
/**
 * Write a description of class quizPage here.
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
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import javax.swing.*;
public class quizPage extends JFrame
{
    private JButton requirements_btn;
    private JButton results_btn;
    private JButton start_btn;
    private JButton back_btn;
    private JLabel background;
    private JTextArea area;

    public quizPage() 
    {
        super("quiz page"); 

        Font font = new Font("sherif",Font.BOLD,16);

        ImageIcon icon = new ImageIcon("t.jpg");
        background = new JLabel(icon);
        add(background);

        requirements_btn = new JButton("Requirements");
        requirements_btn.setSize(115,30);
        requirements_btn.setLocation(50,100);
        background.add(requirements_btn);

        start_btn = new JButton("Start");
        start_btn.setSize(115,30);
        start_btn.setLocation(50,150);
        background.add(start_btn);

        results_btn = new JButton("Results");
        results_btn.setSize(115,30);
        results_btn.setLocation(50,200);
        background.add(results_btn);

        back_btn = new JButton("Back");
        back_btn.setSize(115,30);
        back_btn.setLocation(1000,650);
        background.add(back_btn);

        area = new JTextArea();
        area.setBounds(400,50,300,230);

        /*Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(area));
        box.setBounds(20,50,30,30);
        add(box);*/

        ButtonHandler handler = new ButtonHandler();
        start_btn.addActionListener(handler);
        results_btn.addActionListener(handler);
        requirements_btn.addActionListener(handler);
        back_btn.addActionListener(handler);
    }

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event) 
        {
            try
            {
                if(event.getSource() == start_btn )
                {

                    start Str = new start();
                    Str.setVisible(true);
                    Str.setResizable(false);
                    Str.setSize(1200,800);
                    Str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }

                if(event.getSource() == requirements_btn)
                {
                    requirements req = new requirements();

                    req.setVisible(true);
                    req.setResizable(false);
                    req.setSize(1200,800);
                    req.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }

                if(event.getSource() == back_btn)
                {
                    LoginScreen login = new LoginScreen();
                    login.setVisible(true);
                    login.setSize(1200,800);
                    login.setResizable(false);
                    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    login.pack();
                    dispose();
                }

                if(event.getSource() == results_btn )
                {
                    resultsPage2 re = new resultsPage2();

                    re.setVisible(true);
                    re.setResizable(false);
                    re.setSize(1200,800);
                    re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }

            }
            catch(Exception x)
            {
                System.out.println(x.getMessage());
            }

        }
    }

    public static void main(String args[]) throws Exception
    {
        quizPage quiz = new quizPage();

        quiz.setVisible(true);
        quiz.setResizable(false);
        quiz.setSize(1200,800);
        quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 

    //    public void textfile() throws Exception
    //     {
    //        String []requirements = new String[10];
    //        FileReader file = new FileReader("requirement.txt");
    //        BufferedReader reader = new BufferedReader(file);
    //         
    // String text = "";
    //        String line =reader.readLine();
    //        String elements[];
    //         
    //        while(line != null)
    //         {
    // text += line;()
    //             if(elements[0].equalsIgnoreCase("Requirements"))
    //             {
    //                 String req = elements[0];
    //                 
    //             }
    //             line = reader.readLine();
    //             
    //         }
    // return text;
    //        
    //     }
}

    
