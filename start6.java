
/**
 * Write a description of class start2 here.
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
import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.*;

public class start6 extends JFrame
{
    private JLabel background;
    private ButtonGroup group;
    private JLabel question1;
    private JRadioButton option1Btn;
    private JRadioButton option2Btn;
    private JRadioButton option3Btn;
    private JRadioButton option4Btn;
    private JButton next_button;
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
    public start6()
    {
        super("Quiz Page");
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

        question1= new JLabel("9."+myCell.getQuestions(9));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton("Carbon dioxide", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(9), false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton("Glucose", false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton("ATP", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question5 = new JLabel("10."+ myCell.getQuestions(10));
        question5.setSize(1000,20);
        question5.setLocation(20,240);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton("Glucose", false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton("Fructose", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("Ribolose 1.5 bosphosphate", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton(myphotosynthesisAnswer.getMyphotosynthesisAnswer(10), false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        ButtonHandler handler = new ButtonHandler();
        next_button.addActionListener(handler);
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

    public static int getCorrectMarkQ2()
    {
        correctMark = start4.correctCount; //- start3.getCorrectMarkQ1();
        return correctMark;
    }

    public static int getInCorrectMarkQ2()
    {
        inCorrectMark = start4.inCorrectCount; //- start3.getInCorrectMarkQ1();
        return inCorrectMark;
    }

    public class itemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(event.getSource()==(option1Btn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start4.correctCount++;
            }

            else
            if(event.getSource()==(option3Btn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1aBtn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
                start4.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                start4.correctCount++;
            }
        }
    } 

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        { 
            if(event.getSource() == next_button)
            {
                JOptionPane.showMessageDialog(null,"Correct count: " + start4.correctCount + "\nincorrect count: " + start4.inCorrectCount);
                start7 str = new start7();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,850);
                str.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                dispose();
            }

        }
    }

}
