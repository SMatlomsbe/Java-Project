
/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.*;
public class start7 extends JFrame
{
    private JLabel background;
    private ButtonGroup group;
    private JLabel question1;
    private JRadioButton option1Btn;
    private JRadioButton option2Btn;
    private JRadioButton option3Btn;
    private JRadioButton option4Btn;
    private JLabel question2;
    private JRadioButton option1aBtn;
    private JRadioButton option2aBtn;
    private JRadioButton option3aBtn;
    private JRadioButton option4aBtn;
    private JButton next_button;
    private JRadioButton option_one;
    private JRadioButton option_two;
    private JRadioButton option_three;
    private JRadioButton option_four;

    private JRadioButton option1btn;
    private JRadioButton option2btn;
    private JRadioButton option3btn;
    private JRadioButton option4btn;

    private JLabel question3;
    private JLabel heading;
    private JLabel logoIcon;
    
    public static int correctCount = 0;
    public static int inCorrectCount = 0;
    public start7()
    {
        super("Quiz Page");
        Font font = new Font("sherif",Font.BOLD,20);
        ImageIcon icon = new ImageIcon("t.jpg");
        background = new JLabel(icon);
        add(background);

        ImageIcon logo = new ImageIcon("web2.jpg");
        logoIcon = new JLabel(logo);

        logoIcon.setSize(200,200);
        logoIcon.setLocation(500,25);
        background.add(logoIcon);

        next_button = new JButton("Next");
        next_button.setSize(100,30);
        next_button.setLocation(1000,810);
        background.add(next_button);
        add(new JScrollPane(background));

        energyFlow flow = new energyFlow(1);
        energySolutions myenergy = new energySolutions(1);

        heading = new JLabel("QUESTION 3: Energy flow");
        heading.setSize(1000,20);
        heading.setLocation(500,10);
        heading.setFont(font);
        heading.setForeground(Color.GREEN);
        background.add(heading);

        question1= new JLabel("1." + flow.getQuestions(1));
        question1.setSize(1000,20);
        question1.setLocation(20,40);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton("Herbivore ", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton(" Carnivore", false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton(myenergy.getMyenergyAnswers(1), false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton("Consumers", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question2= new JLabel("2."+ flow.getQuestions(2));
        question2.setSize(1000,20);
        question2.setLocation(20,240);
        question2.setFont(font);
        question2.setForeground(Color.WHITE);
        background.add(question2);

        option1aBtn= new JRadioButton(" Secondary producers", false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton(" Tertiary consumers", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("Herbivores", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton(myenergy.getMyenergyAnswers(2), false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        question3= new JLabel("3." + flow.getQuestions(3) );
        question3.setSize(1000,20);
        question3.setLocation(20,440);
        question3.setForeground(Color.WHITE);
        question3.setFont(font);
        background.add(question3);

        option_one = new JRadioButton(myenergy.getMyenergyAnswers(3));
        option_one.setBounds(60,480,300,20);
        background.add(option_one);

        option_two = new JRadioButton("Herbivores");
        option_two.setBounds(60,520,300,20);
        background.add(option_two);

        option_three = new JRadioButton ("Producers");
        option_three.setBounds(60,560,300,20);
        background.add(option_three);

        option_four = new JRadioButton("Carnivores");
        option_four.setBounds(60,600,300,20);
        background.add(option_four);

        group = new ButtonGroup();
        group.add(option_one);
        group.add(option_two);
        group.add(option_three);
        group.add(option_four);

        question1= new JLabel("4." + flow.getQuestions(4));
        question1.setSize(1000,20);
        question1.setLocation(20,640);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1btn= new JRadioButton( "Food chain " , false);
        option1btn.setBounds(60,680,300,20);
        background.add(option1btn);

        option2btn= new JRadioButton(myenergy.getMyenergyAnswers(4), false);
        option2btn.setBounds(60,720,300,20);
        background.add(option2btn);

        option3btn= new JRadioButton("Energy pyramid", false);
        option3btn.setBounds(60,760,300,20);
        background.add(option3btn);

        option4btn= new JRadioButton("Food cycle", false);
        option4btn.setBounds(60,800,300,20);
        background.add(option4btn);

        group = new ButtonGroup();
        group.add(option1btn);
        group.add(option2btn);
        group.add(option3btn);
        group.add(option4btn);

        ButtonHandler handler = new ButtonHandler();
        next_button.addActionListener(handler);

        itemHandler itemH = new itemHandler();
        option1Btn.addItemListener(itemH);
        option2Btn.addItemListener(itemH);
        option3Btn.addItemListener(itemH);
        option4Btn.addItemListener(itemH);
        option1btn.addItemListener(itemH);
        option2btn.addItemListener(itemH);
        option3btn.addItemListener(itemH);
        option4btn.addItemListener(itemH);
        option1aBtn.addItemListener(itemH);
        option2aBtn.addItemListener(itemH);
        option3aBtn.addItemListener(itemH);
        option4aBtn.addItemListener(itemH);

        option_one.addItemListener(itemH);
        option_two.addItemListener(itemH);
        option_three.addItemListener(itemH);
        option_four.addItemListener(itemH);
    }

    public class itemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(event.getSource()==(option1Btn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option3Btn))
            {
               correctCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option1aBtn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
               inCorrectCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
              inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                correctCount++;
            }
            else
            if(event.getSource()==(option_one))
            {
              correctCount++;
            }
            else
            if(event.getSource()==(option_two))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option_three))
            {
              inCorrectCount++;
            }
            else
            if(event.getSource()==(option_four))
            {
               inCorrectCount++;
            }
            else
            if(event.getSource()==(option1btn))
            {
               inCorrectCount++;
            }
            else
            if(event.getSource()==(option2btn))
            {
             correctCount++;
            }
            else
            if(event.getSource()==(option3btn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option4btn))
            {
              inCorrectCount++;
            }
        }
    } 

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            if(event.getSource() == next_button)
            {
                start8 str = new start8();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,800);
                str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }

        }
    }
    public int getCorrectCountQ2()
    {
        return correctCount;
    }

    public int getInCorrectCountQ2()
    {
        return inCorrectCount;
    }     
}

