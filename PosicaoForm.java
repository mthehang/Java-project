package Visao;


import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
/*import javax.swing.JLabel;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
*/

/**
 *
 * @author Aluno
 */
public class PosicaoForm {
    public void abrirForm(JInternalFrame janela, JDesktopPane desktop){
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        janela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        desktop.add(janela);
        janela.setVisible(true);
    }
/*   
    public void resize(JLabel fundo, JDesktopPane desktop) throws IOException{
        BufferedImage bufferedImage = ImageIO.read(new File("mh teste.png"));
        Image image = bufferedImage.getScaledInstance(desktop.getWidth(), desktop.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(image);
        fundo.setIcon(icon);
        desktop.add(fundo);
    }
*/
    
}
