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
public class start9 extends JFrame
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
    private JRadioButton option_one;
    private JRadioButton option_two;
    private JRadioButton option_three;
    private JRadioButton option_four;
    start7 begin = new start7();
    start8 begin2 = new start8();

    private static int correctMark = 0;
    private static int inCorrectMark = 0;
    public start9()
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

        energyFlow flow = new energyFlow(1);
        energySolutions myenergy = new energySolutions(1);

        question1= new JLabel("9."+flow.getQuestions(9));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton(myenergy.getMyenergyAnswers(9), false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton("Autotroph", false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton("Heterotroph", false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton("parasite", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question5 = new JLabel("10."+flow.getQuestions(10));
        question5.setSize(1000,20);
        question5.setLocation(20,240);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton(myenergy.getMyenergyAnswers(10), false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton("fungi", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("Bacteria", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton("Consumers", false);
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

    public static int getCorrectMarkQ3()
    {
        return correctMark = start7.correctCount; //- start6.getCorrectMarkQ2();
        //return correctMark;
    }

    public static int getInCorrectMarkQ3()
    {
        return inCorrectMark = start7.inCorrectCount;// - start6.getInCorrectMarkQ2();
        //return inCorrectMark;
    }

    public class itemHandler implements ItemListener
    {
        public void itemStateChanged(ItemEvent event)
        {
            if(event.getSource()==(option1Btn))
            {
                start7.correctCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start7.inCorrectCount++;
            }

            else
            if(event.getSource()==(option1aBtn))
            {
                start7.correctCount++;
            }
            else
            if(event.getSource()==(option2aBtn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3aBtn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4aBtn))
            {
                start7.inCorrectCount++;
            }

        }
    }

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == next_button)
            {
                JOptionPane.showMessageDialog(null,"Correct count: " + start7.correctCount + "\nincorrect count: " + start7.inCorrectCount);

                start10 str = new start10();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,850);
                str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            } 

        }
    }

}

