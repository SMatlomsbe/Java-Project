
/**
 * Write a description of class welcomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomePage extends JFrame
{
    private JLabel background;
    private JButton open_btn;
    private JLabel label;
    public welcomePage()
    {
       Font font = new Font("sherif",Font.BOLD,20);
       ImageIcon icon = new ImageIcon("celia.jpg");
       background = new JLabel(icon);
       add(background);
        
       open_btn = new JButton("Open");
       open_btn.setSize(115,30);
       open_btn.setLocation(980,680);
       background.add(open_btn);
      
       
       label = new JLabel("Welcome to understanding life sciences!");
       label.setSize(500,30);
       label.setLocation(50,40);
       label.setFont(font);
       background.add(label);
       
       
        
       ButtonHandler handler = new ButtonHandler();
       open_btn.addActionListener(handler);
    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == open_btn )
            {
                LoginScreen screen = new LoginScreen();
        
                screen.setVisible(true);
                screen.setSize(1200,800);
                screen.setResizable(false);
                screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                screen.pack();
                dispose();
            }
        }
    }
    
    public static void main(String args[])
    {
        welcomePage page = new welcomePage();
        
        page.setSize(1200,800);
        page.setVisible(true);
        page.setResizable(false);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //page.pack();
    }
}
