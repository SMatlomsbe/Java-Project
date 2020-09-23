
/**
 * Write a description of class requirements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JScrollPane;
public class requirements extends JFrame
{
   private JButton backBtn; 
   private JTextArea area;
   private JLabel background;
   private Box box;
   public requirements() throws Exception
    {
      super("requirements page");
      
      Font font = new Font("sherif",Font.BOLD,20);
      ImageIcon icon = new ImageIcon("t.jpg");
      background = new JLabel(icon);
      add(background);  
        
      backBtn = new JButton("Back");
      backBtn.setSize(115,30);
      backBtn.setLocation(1000,650);
      background.add(backBtn);
      
      area = new JTextArea();
      area.setBounds(5,4,550,450);
    
      area.append("REQUIREMENTS\n1.CANDINATE MUST BE A GRADE TEN LEARNER.\n2.SHOULD HAVE LIFE SCIENCE AS ONE HIS OR HER\n"
      +"3.THE CANDIDATE SHOULD BE 16 OR OVER 16 YEARS.\n4.OUR SYSTEM CAN ONLY BE USED BY SOUTH AFRICANS\n"
      +"5.THE CANDIDATE SHOULD BE ENGLISH LITERAATE AS THIS PROGRSM DOEs'NT HAVE OTHER LSNGUAGE OPTIONS");
      area.setEditable(false);
      
      Box box = Box.createVerticalBox();
      box.add(new JScrollPane(area));
      box.setBounds(5,4,550,450);
      background.add(box);
      
      ButtonHandler handler = new ButtonHandler();
      backBtn.addActionListener(handler);
    }
    
    
    public class ButtonHandler implements ActionListener
      {
      public void actionPerformed(ActionEvent event) 
      {
        try
        {
        if(event.getSource()== backBtn)
        {
            quizPage req = new quizPage();
       
            req.setVisible(true);
            req.setResizable(false);
            req.setSize(1200,800);
            req.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }
      }
      catch(Exception ex)
      {
          ex.getMessage();
      }
     }
   
  }

 
   
   
}

