
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
import javax.swing.JOptionPane;
public class resultsPage2 extends JFrame
{ 
    private JButton backBtn;
    private JButton watchBtn;
    private JTextArea area;
    private JLabel background;
    private Box box;
    public resultsPage2() 
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

        watchBtn = new JButton("Watch video");
        watchBtn.setSize(115,30);
        watchBtn.setLocation(850,650);
        background.add(watchBtn);

        area = new JTextArea();
        area.setBounds(5,4,450,450);

        area.setEditable(false);
        area.setText(String.format("\t\t%s","MARKS:\n\n Question1\t Question2\t Question3 \t Question4\t Average\n\n"));
        area.append(Integer.toString( start3.getCorrectMarkQ1()));
        area.append("\t"+Integer.toString( start6.getCorrectMarkQ2()));
        area.append("\t"+Integer.toString( start9.getCorrectMarkQ3()));
        area.append("\t"+Integer.toString( start12.getCorrectMarkQ4()));
        area.append("\t"+Integer.toString( start12.calcAverage()));

        Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(area));
        box.setBounds(5,4,450,450);
        background.add(box);

        ButtonHandler handler = new ButtonHandler();
        backBtn.addActionListener(handler);
        watchBtn.addActionListener(handler);
    }

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event) 
        {
            try
            {
                if(event.getSource()== backBtn)
                {
                    quizPage quiz = new quizPage();

                    quiz.setVisible(true);
                    quiz.setResizable(false);
                    quiz.setSize(1200,800);
                    quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }
            }
            catch(Exception ex)
            {
                ex.getMessage();
            }

            if(start3.getCorrectMarkQ1() < 5 && event.getSource()== watchBtn ) 
            {
                try
                {
                    JOptionPane.showMessageDialog(null,"You got less than 50% for question1 thus you should watch a video now to learn more");
                    Videos myVid = new Videos();
                    myVid.watchCellDivisionVideo();
                }
                catch(Exception ec)
                {
                    JOptionPane.showMessageDialog(null,"File not found");
                }
            }
            
            if(start6.getCorrectMarkQ2() < 5 && event.getSource()== watchBtn)
            {
                try
                {
                    JOptionPane.showMessageDialog(null,"You got less than 50% for question2 thus you should watch a video now to learn more");
                    Videos myVid = new Videos();
                    myVid.watchPhotosynthesisVideo();
                }
                catch(Exception ec)
                {
                    JOptionPane.showMessageDialog(null,"File not found");
                }
            }

            if(start9.getCorrectMarkQ3() < 5 && event.getSource()== watchBtn)
            {
                try
                {
                    JOptionPane.showMessageDialog(null,"You got less than 50% for question3 thus you should watch a video now to learn more");
                    Videos myVid = new Videos();
                    myVid.watchEnergyFlowVideo();
                }
                catch(Exception ec)
                {
                    JOptionPane.showMessageDialog(null,"File not found");
                }
            }

            if(start12.getCorrectMarkQ4() < 5 && event.getSource()== watchBtn)
            {
                try
                {
                    JOptionPane.showMessageDialog(null,"You got less than 50% for question4 thus you should watch a video now to learn more");
                    Videos myVid = new Videos();
                    myVid.watchGaseousVideo();
                }
                catch(Exception ec)
                {
                    JOptionPane.showMessageDialog(null,"File not found");
                }
            }
        }

    }
}
