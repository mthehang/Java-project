
package Visao;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Limpador {
    public static void limpaform(JTextField args[]){
        for(int i = 0; i < args.length; i++){
            args[i].setText("");
        }
        
    }
    public static void desativaform(JTextField args[]){
        for(int i = 0; i < args.length; i++){
            args[i].setEditable(false);
        }
        
    }
    public static void ativaform(JTextField args[]){
        for(int i = 0; i < args.length; i++){
            args[i].setEditable(true);
        }
        
    }
    public static void corform(JLabel args[]){
        Color cor = new Color(153,153,153);
        for(int i = 0; i < args.length; i++){
            args[i].setForeground(cor);
        }
        
    }
    public static void voltacorform(JLabel args[]){
        Color cor = new Color(0,0,0);
        for(int i = 0; i < args.length; i++){
            args[i].setForeground(cor);
        }
        
    }
    public static void pularform(JTextField args[]){
        for(int i = 0; i < args.length; i++){
            args[i].requestFocus();
        }     
    }
    
}
