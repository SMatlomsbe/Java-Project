
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.*;
public class start12 extends JFrame
{
    private JLabel background;
    private ButtonGroup group;
    private JLabel question1;
    private JRadioButton option1Btn;
    private JRadioButton option2Btn;
    private JRadioButton option3Btn;
    private JRadioButton option4Btn;
    private JButton done_button;
    private JLabel question5;
    private JRadioButton option1aBtn;
    private JRadioButton option2aBtn;
    private JRadioButton option3aBtn;
    private JRadioButton option4aBtn;
    private JLabel question3;
    private JRadioButton Option_one;
    private JRadioButton Option_two;
    private JRadioButton Option_three;
    private JRadioButton Option_four;

    private static int correctMark = 0;
    private static int inCorrectMark = 0;
    private static int average = 0;
    
    public static int count = 0;
    public student [] arrStudents = new student[100];
    public int[] arrMarksQ1 = new int[100];
    public int[] arrMarksQ2 = new int[100];
    public int[] arrMarksQ3 = new int[100];
    public int[] arrMarksQ4 = new int[100];
    public int[] arrAverage = new int[100];
    public start12()
    {
        super("Quiz Page");
        Font font = new Font("sherif",Font.BOLD,20);
        ImageIcon icon = new ImageIcon("t.jpg");
        background = new JLabel(icon);
        add(background);

        done_button = new JButton("Done");
        done_button.setSize(100,30);
        done_button.setLocation(1000,810);
        background.add(done_button);
        add(new JScrollPane(background));

        gaseousExchange ex = new gaseousExchange(1);
        gaseousSolutions myGaseousAnswer = new gaseousSolutions(1);

        question1= new JLabel("9."+ex.getQuestions(9));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton("Exchange of gases", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton(myGaseousAnswer.getMygaseousAnswers(9), false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton("Diffussion", false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton("inspiration and expiration", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question5 = new JLabel("10."+ex.getQuestions(10));
        question5.setSize(1000,20);
        question5.setLocation(20,240);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton(myGaseousAnswer.getMygaseousAnswers(10), false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton("Process through which different gases are are transferred in opposite directions", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("When oxygen is required to enter cell while waste carbon must be removed", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton("The movement of gases across membranes", false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        ButtonHandler handler = new ButtonHandler();
        done_button.addActionListener(handler);

        itemHandler itemH = new itemHandler();
        option1Btn.addItemListener(itemH);
        option2Btn.addItemListener(itemH);
        option3Btn.addItemListener(itemH);
        option4Btn.addItemListener(itemH);

        option1aBtn.addItemListener(itemH);
        option2aBtn.addItemListener(itemH);
        option3aBtn.addItemListener(itemH);
        option4aBtn.addItemListener(itemH);
    }

    public static int getCorrectMarkQ4()
    {
        correctMark = start10.correctCount; //- start9.getCorrectMarkQ3();
        return correctMark;
    }

    public static int getInCorrectMarkQ4()
    {
        inCorrectMark = start10.inCorrectCount; //- start9.getInCorrectMarkQ3();
        return inCorrectMark;
    }
    //student.calcAverage();
    
    public static int calcAverage()
    {
        return average = ((start3.getCorrectMarkQ1()+start6.getCorrectMarkQ2()+start9.getCorrectMarkQ3()+ getCorrectMarkQ4())/(40)) *100;

    } 
    
   
    public class itemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(event.getSource()==(option1Btn))
            {
                start10.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start10.correctCount++;
            }

            else
            if(event.getSource()==(option3Btn))
            {
                start10.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                start10.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1aBtn))
            {
                start10.correctCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
                start10.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
                start10.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                start10.inCorrectCount++;
            }
        }
    } 

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == done_button)
            {

                String answer =JOptionPane.showInputDialog(null,"Correct count: " + start10.correctCount + "\nincorrect count: " + start10.inCorrectCount+ "\n Do you want to view your aggregate results?(Y/N)"); 
            
                if(answer.equalsIgnoreCase("Y"))
                {
                    JOptionPane.showMessageDialog(null,"Click button results");
                    quizPage req = new quizPage();

                    req.setVisible(true);
                    req.setResizable(false);
                    req.setSize(1200,800);
                    req.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }
                else
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

        public void displayMarks()
        {
            arrMarksQ1[count] = start3.getCorrectMarkQ1();
            arrMarksQ2[count] = start6.getCorrectMarkQ2();
            arrMarksQ3[count] = start9.getCorrectMarkQ3();
            arrMarksQ4[count] = start12.getCorrectMarkQ4();
            arrAverage[count]= calcAverage();

            resultsPage.area.append(String.format("%s\t\t%s\t\t%s\t%s\t%s\t%s\t%s\n", "Name", "I.D number", "Question1", "Question2","Question3","Question4","Average"));
            for(int k = 0; k < count; k++)
            {
                resultsPage.area.append(String.format("%s\t\t%s\t\t%d\t%d\t%d\t%d\t%d\n",(k+1) + "." + arrStudents[k].getName(),  arrStudents[k].getDateOfBirth(),arrMarksQ1[k], arrMarksQ2[k], arrMarksQ3[k], arrMarksQ4[k],arrAverage[k]));
            }
        }

    }

}
