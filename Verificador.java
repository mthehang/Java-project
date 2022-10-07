package Visao;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author Matheus
 */
public class Verificador{
    public static void Verificar_Texto(JTextField txtProduto, JTextField txtMarca, JTextField txtPreco, JTextField txtCor,JButton btnSalvar){
        KeyEvent evt = null;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtProduto.getText().equals("") || txtMarca.getText().equals("") || txtPreco.getText().equals("") || txtCor.getText().equals("")){
                btnSalvar.setEnabled(false);
            }else{
                btnSalvar.setEnabled(true);
            }
                        
        }
    }
    public static void Apenas_numeros(KeyEvent e){ 
        String caracteres="0987654321.,";
        if(!caracteres.contains(e.getKeyChar()+"")){
            e.consume();
        } 
    }
}

    

