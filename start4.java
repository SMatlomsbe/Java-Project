
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
public class start4 extends JFrame
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
    
    public static int correctCount = 0;
    public static int inCorrectCount = 0;
    public start4()
    {
        super("Quiz page");
        Font font = new Font("sherif",Font.BOLD,20);
        ImageIcon icon = new ImageIcon("t.jpg");
        background = new JLabel(icon);
        add(background);

        next_button = new JButton("Next");
        next_button.setSize(100,30);
        next_button.setLocation(1000,810);
        background.add(next_button);
        add(new JScrollPane(background));

        photosynthesis myCell = new photosynthesis(1);
        photosynthesisSolutions myphotosynthesisAnswer = new photosynthesisSolutions(1);

        heading = new JLabel("QUESTION 2: Photosynthesis");
        heading.setSize(1000,20);
        heading.setLocation(500,10);
        heading.setFont(font);
        heading.setForeground(Color.GREEN);
        background.add(heading);

        
        question1= new JLabel("1." +myCell.getQuestions(1));
        question1.setSize(1000,20);
        question1.setLocation(20,40);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton("Zero", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton("One", false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton("Three", false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(1), false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question2= new JLabel("2." +myCell.getQuestions(2));
        question2.setSize(1000,20);
        question2.setLocation(20,240);
        question2.setFont(font);
        question2.setForeground(Color.WHITE);
        background.add(question2);

        option1aBtn= new JRadioButton("Chemiosmosis", false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(2), false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("Charge seperation", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton("Electron transport", false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        question3= new JLabel("3." +myCell.getQuestions(3));
        question3.setSize(1000,20);
        question3.setLocation(20,440);
        question3.setForeground(Color.WHITE);
        question3.setFont(font);
        background.add(question3);

        option_one = new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(3));
        option_one.setBounds(60,480,300,20);
        background.add(option_one);

        option_two = new JRadioButton("Grana");
        option_two.setBounds(60,520,300,20);
        background.add(option_two);

        option_three = new JRadioButton ("Photosystems");
        option_three.setBounds(60,560,300,20);
        background.add(option_three);

        option_four = new JRadioButton("Photons");
        option_four.setBounds(60,600,300,20);
        background.add(option_four);

        group = new ButtonGroup();
        group.add(option_one);
        group.add(option_two);
        group.add(option_three);
        group.add(option_four);

        question1= new JLabel("4." +myCell.getQuestions(4));
        question1.setSize(1000,20);
        question1.setLocation(20,640);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1btn= new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(4) , false);
        option1btn.setBounds(60,680,300,20);
        background.add(option1btn);

        option2btn= new JRadioButton("Carbon dioxide, light and water", false);
        option2btn.setBounds(60,720,300,20);
        background.add(option2btn);

        option3btn= new JRadioButton("water, temperature and carbon dioxide", false);
        option3btn.setBounds(60,760,300,20);
        background.add(option3btn);

        option4btn= new JRadioButton("Oxygen, water and temperature", false);
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
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                correctCount++;
            }
            else
            if(event.getSource()==(option1aBtn))
            {
               inCorrectCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
                correctCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
                inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                inCorrectCount++;
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
                correctCount++;
            }
            else
            if(event.getSource()==(option2btn))
            {
                inCorrectCount++;
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
                start5 str = new start5();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,800);
                str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }

            /*if(option1Btn.isSelected()|| option2Btn.isSelected() || option3Btn.isSelected())
            {
            mark = markCounter;
            }
            else
            {
            mark = markCounter+1;
            }

            if(option1aBtn.isSelected()|| option3aBtn.isSelected() || option4aBtn.isSelected())
            {
            mark = markCounter;
            }
            else
            {
            mark = markCounter+1;
            }

            if(option_two .isSelected()|| option_three.isSelected() || option_four.isSelected())
            {
            mark = markCounter;
            }
            else
            {
            mark = markCounter+1;
            }

            if(option2Btn.isSelected()|| option3Btn.isSelected() || option4Btn.isSelected())
            {
            mark = markCounter;
            }
            else
            {
            mark = markCounter+1;
            }
            //totalMark = mark;
            calcTotalMark(mark);
            }
            }

            public int calcTotalMark(int mark)
            {
            return totalMark = mark++;
            } */     
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
