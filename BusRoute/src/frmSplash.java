
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class frmSplash{

    private JLabel SplashImage;
    private JLabel SplashText;
    private JWindow window;
    private JPanel panel;
    public frmSplash(int duration) {
        window=new JWindow();               
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((screen.width - 700) / 2, (screen.height - 800) / 2,900, 800);        
            panel=(JPanel)window.getContentPane();
        SplashImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("images/fd.png")));
       // SplashImage.setBounds(10, 10, 100,100);
        
        SplashText=new JLabel("Bus Route",SwingConstants.CENTER);
        panel.add(SplashImage, BorderLayout.CENTER);
        panel.add(SplashText,BorderLayout.SOUTH);
        
        window.setVisible(true);
        try{
            Thread.sleep(duration);            
        }catch(Exception ex){            
        }//try catch closed
        window.setVisible(false);
        window.dispose();
    }//constructr closed

}//class closed

