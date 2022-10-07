package Modelo;

import dao.Banco;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Aluno
 */
public class Eletrodomesticos extends Produto{
    protected String marca;
    protected String cor;
    protected String tensao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }
    
    public void Alterar(String id, String nome, String marca, String preco, String cor, String descricao, String tensao){
        Banco.AlterarColuna(String.valueOf(id), nome, marca, String.valueOf(preco), cor, descricao, tensao);
    }
    
    public void Deletar(String id){
        Banco.DeletarColuna(id);
    }
    
    public void Salvar(String nome, String marca, String preco, String cor, String descricao, String tensao){
        Banco.InserirValores(nome, marca, String.valueOf(preco), cor, descricao, tensao);
    }
    
    public void Addqtd(JTextField txtQtd, JTextField txtAdd, JTextField txtRemover, JTextField txtId, JTextField txtProduto, JTextField txtMarca){
        setId(Integer.parseInt(txtId.getText()));
        int i = 0;
        int l = 0;
        setQuantidade(Integer.parseInt(txtQtd.getText()));
        int k = getQuantidade();
        if("".equals(txtAdd.getText())){
        } else {
            l = Integer.parseInt(txtAdd.getText());
        }
        if("".equals(txtRemover.getText())){
        } else {
            i = Integer.parseInt(txtRemover.getText());
        }
        int j = k+l-i;
        if(j >= 0){
            Banco.AddQtd(j, String.valueOf(id));
            txtAdd.setText("");
            txtRemover.setText("");
            JTextField args[] = {txtProduto, txtMarca, txtQtd};
            ARID(txtId.getText(), args);
            txtAdd.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Impossível remover esta quantidade.");
            txtRemover.requestFocus();
        }
        
    }
    
    public static void ARID(String txtId, JTextField args[]){
        Banco.ARID(txtId, args);
    }
    
    public static void VerificarID(String id, JTextField args[], JTextArea txtDesc, JComboBox cbTensao){
        Banco.VerificarID(id, args, txtDesc, cbTensao);
    }
    
    public static void ExibirTabela(JTable jtProduto){
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0);
        Banco pdao = new Banco();
        String x = "R$ ";
        for(Eletrodomesticos p: pdao.VerificarTabela()){
            modelo.addRow(new Object[]{p.getId(), p.getNome(), p.getMarca(),
            x+p.getPreco(), p.getCor(), p.getDescricao(), p.getTensao(), p.getQuantidade()});
        }
    }
    
    public static void AtualizarTabela(JTable jtProduto){
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        jtProduto.setRowSorter(new TableRowSorter(modelo));
        ExibirTabela(jtProduto);
        JOptionPane.showMessageDialog(null, "Tabela atualizada com sucesso.");        
    }
    
    public static String NewId(){
        String NewId = Banco.NewID();
        return NewId;
    }

}

