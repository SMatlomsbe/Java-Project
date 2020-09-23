
/**
 * Write a description of class resultsPage here.
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
import java.util.Arrays;
public class resultsPage extends JFrame
{ 
    private JButton backBtn; 
    public static JTextArea area;
    private JLabel background;
    private Box box;

    public resultsPage() 
    {
        super("results page");

        Font font = new Font("sherif",Font.BOLD,20);
        ImageIcon icon = new ImageIcon("t.jpg");
        background = new JLabel(icon);
        add(background);  

        backBtn = new JButton("Back");
        backBtn.setSize(115,30);
        backBtn.setLocation(1000,650);
        background.add(backBtn);

        area = new JTextArea();
        area.setBounds(5,4,450,450);
        area.setEditable(false);
        area.setText(String.format("\t\t%s\n\n\n%s\t%s\t%s\t%s\t%s\t%s\t%s\n","STUDENTS RESULTS:", "Name", "I.D number", "Question1", "Question2","Question3","Question4","Average"));
        //area.read(output);

        area.append("\t\t"+Integer.toString( start3.getCorrectMarkQ1()));
        area.append("\t"+Integer.toString( start6.getCorrectMarkQ2()));
        area.append("\t"+Integer.toString( start9.getCorrectMarkQ3()));
        area.append("\t"+Integer.toString( start12.getCorrectMarkQ4()));
        area.append("\t"+Integer.toString( start12.calcAverage()));

        Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(area));
        box.setBounds(5,4,600,450);
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
                    LoginScreen screen = new LoginScreen();

                    screen.setVisible(true);
                    screen.setSize(1200,800);
                    screen.setResizable(false);
                    screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    screen.pack();
                    //area.append(quizPage.textfile());
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
