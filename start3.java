
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
public class start3 extends JFrame
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
    private JLabel heading;
    private static int correctMark = 0;
    private static int inCorrectMark = 0;
    public start3()
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

        cellSolutions mycell = new cellSolutions(1);
        cellDivision cell = new cellDivision(1);

        question1= new JLabel("9."+cell.getQuestions(9));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton("False", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton(mycell.getMycellAnswers(9), false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);

        question5 = new JLabel("10."+ cell.getQuestions(10));
        question5.setSize(1000,20);
        question5.setLocation(20,160);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton("Development and growth", false);
        option1aBtn.setBounds(60,200,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton("Cell replacement", false);
        option2aBtn.setBounds(60,240,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("Replacement of damaged plant or animal tissue (regeneration)", false);
        option3aBtn.setBounds(60,280,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton( mycell.getMycellAnswers(10), false);
        option4aBtn.setBounds(60,320,300,20);
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

        option1aBtn.addItemListener(itemH);
        option2aBtn.addItemListener(itemH);
        option3aBtn.addItemListener(itemH);
        option4aBtn.addItemListener(itemH);

    }
    
    public static int getCorrectMarkQ1()
    {
        correctMark = start.correctCount;
        return correctMark;
    }
    
    public static int getInCorrectMarkQ1()
    {
        inCorrectMark = start.inCorrectCount;
        return inCorrectMark;
    }
    
    
    public class itemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(event.getSource()==(option1Btn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start.correctCount++;
            }

            else
            if(event.getSource()==(option1aBtn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                start.correctCount++;
            }

        }
    }

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        { 

            if(event.getSource() == next_button)
            {
                //int Mark = begin.calcTotalMark(totalMark) +  begin2.calcTotalMark(totalMark) + calcTotalMark(totalMark);
                JOptionPane.showMessageDialog(null,"Correct count: " + start.correctCount + "\nincorrect count: " + start.inCorrectCount);

                start4 str = new start4();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,850);
                str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();

            }

        }
    }
}