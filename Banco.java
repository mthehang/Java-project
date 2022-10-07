package dao;

/**
 *
 * @author Matheus
 */
import Modelo.Eletrodomesticos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Banco{
    private static String DATABASE_URL = "jdbc:postgresql://ec2-52-200-215-149.compute-1.amazonaws.com:5432/d2s285kaa4vhcl";
    private static String USUARIO = "diaziqxcdgkmwc";
    private static String SENHA = "9da0d25f14a677d02816b0814382547b13c6a9541d8edba4b6493c8d8b5b9d52";
    private static String driverName = "org.postgresql.Driver";

    private static Connection createConnection(){
      try{
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://ec2-52-200-215-149.compute-1.amazonaws.com:5432/d2s285kaa4vhcl", "diaziqxcdgkmwc", "9da0d25f14a677d02816b0814382547b13c6a9541d8edba4b6493c8d8b5b9d52");
            return conexao;
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "ERRO CLASSE: "+e.getMessage());  
            return null;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
            return null;
        }
   }
    /*
    public static boolean CriarTabela(){
        try{
            String cmd = "UPDATE TB_PRODUTO SET N_QUANTIDADE=0;";
            Connection cnn = createConnection();
            Statement stmt = cnn.createStatement();
            stmt.execute(cmd);
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
            return false;
        }
    }
    */
    public static void InserirValores(String nome, String marca, String preco, String cor, String descricao, String tensao){
        try{
            String cmd = "INSERT INTO TB_PRODUTO (N_ID, T_NOME, T_MARCA, D_PRECO, T_COR, T_DESCRICAO, T_TENSAO, N_QUANTIDADE) VALUES ((SELECT (MAX(N_ID)+1) FROM TB_PRODUTO), '"+nome+"', '"+marca+"', '"+preco+"', '"+cor+"', '"+descricao+"', '"+tensao+"', '0')";
            Connection cnn = createConnection();
            Statement stmt = cnn.createStatement();
            stmt.execute(cmd);
            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso."); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
    }
    public static void DeletarColuna(String a){
        try{
            String cmd = "DELETE FROM TB_PRODUTO WHERE N_ID="+a;
            Connection cnn = createConnection();
            Statement stmt = cnn.createStatement();
            stmt.execute(cmd);
            JOptionPane.showMessageDialog(null, "Item removido com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
    }
    
    public static String NewID(){
        try{
            String mensagem = null;
            String cmd = "SELECT (MAX (N_ID) +1) AS N_ID FROM TB_PRODUTO";
            Connection cnn = createConnection();
            
            PreparedStatement stmt = cnn.prepareStatement(cmd);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                mensagem = rs.getString("N_ID");   
            }
            stmt.close();
            cnn.close();
            return mensagem;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
            return "";
        }
    }
    
    public List<Eletrodomesticos> VerificarTabela(){
        List<Eletrodomesticos> produtos = new ArrayList<>();
        Connection cnn = createConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            String cmd = "SELECT * FROM TB_PRODUTO ORDER BY N_ID";
            stmt = cnn.prepareStatement(cmd);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Eletrodomesticos produto = new Eletrodomesticos();
                produto.setId(rs.getInt("N_ID"));
                produto.setNome(rs.getString("T_NOME"));
                produto.setMarca(rs.getString("T_MARCA"));
                produto.setPreco(rs.getDouble("D_PRECO"));
                produto.setCor(rs.getString("T_COR"));
                produto.setDescricao(rs.getString("T_DESCRICAO"));
                produto.setTensao(rs.getString("T_TENSAO"));
                produto.setQuantidade(rs.getInt("N_QUANTIDADE"));
                produtos.add(produto);
            }
            stmt.close();
            cnn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
        return produtos;
    }
    
    public static void VerificarID(String id, JTextField args[], JTextArea txtDesc, JComboBox cbTensao){
        try{
            String s[] = {""};
            String cmd = "SELECT * FROM TB_PRODUTO WHERE N_ID="+id;
            Connection cnn = createConnection();
            
            PreparedStatement stmt = cnn.prepareStatement(cmd);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                args[0].setText(rs.getString("T_NOME"));
                args[1].setText(rs.getString("T_MARCA"));
                args[2].setText(rs.getString("D_PRECO").replace(".",","));
                args[3].setText(rs.getString("T_COR"));
                txtDesc.setText(rs.getString("T_DESCRICAO"));
                cbTensao.getModel().setSelectedItem(rs.getString("T_TENSAO"));
            }
            stmt.close();
            cnn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
    }
    
    public static void ARID(String id, JTextField args[]){
        try{
            String cmd = "SELECT * FROM TB_PRODUTO WHERE N_ID="+id;
            Connection cnn = createConnection();
            
            PreparedStatement stmt = cnn.prepareStatement(cmd);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                args[0].setText(rs.getString("T_NOME"));
                args[1].setText(rs.getString("T_MARCA"));
                args[2].setText(rs.getString("N_QUANTIDADE"));
            }
            stmt.close();
            cnn.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
    }
    
    
    public static void AlterarColuna(String id, String nome, String marca, String preco, String cor, String descricao, String tensao){
        try{
            String cmd = "UPDATE TB_PRODUTO SET T_NOME='"+nome+"', T_MARCA='"+marca+"', D_PRECO='"+preco+"', T_COR='"+cor+"', T_DESCRICAO='"+descricao+"', T_TENSAO='"+tensao+"' WHERE N_ID="+id;
            Connection cnn = createConnection();
            Statement stmt = cnn.createStatement();
            stmt.execute(cmd);
            JOptionPane.showMessageDialog(null, "Item alterado com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }
    }
    
    public static void AddQtd(int quantidade, String id){
        try{
            String cmd = "UPDATE TB_PRODUTO SET N_QUANTIDADE="+quantidade+" WHERE N_ID="+id;
            Connection cnn = createConnection();
            Statement stmt = cnn.createStatement();
            stmt.execute(cmd);
            JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO SQL: "+e.getMessage());
        }       
    }
}
