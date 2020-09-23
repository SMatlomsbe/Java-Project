
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
public class start8 extends JFrame
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
    private JRadioButton option11Btn;
    private JRadioButton option21Btn;
    private JRadioButton option31Btn;
    private JRadioButton option41Btn;
    public start8()
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

        question1= new JLabel("5."+flow.getQuestions(5));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton(" Decomposers, phytoplankton ", false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton(" zooplankton, consumers", false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton(myenergy.getMyenergyAnswers(5), false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton(" zooplankton, scavengers", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question5 = new JLabel("6."+flow.getQuestions(6));
        question5.setSize(1000,20);
        question5.setLocation(20,240);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton( "food chains ", false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton(" Cellular respiration", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton(" Microscopic organism", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton(myenergy.getMyenergyAnswers(6), false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        question3= new JLabel("7." + flow.getQuestions(7) );
        question3.setSize(1000,20);
        question3.setLocation(20,440);
        question3.setForeground(Color.WHITE);
        question3.setFont(font);
        background.add(question3);

        option_one = new JRadioButton("An energy link ");
        option_one.setBounds(60,480,300,20);
        background.add(option_one);

        option_two = new JRadioButton(" A phytoplankton cycle");
        option_two.setBounds(60,520,300,20);
        background.add(option_two);

        option_three = new JRadioButton (" photosynthesis ");
        option_three.setBounds(60,560,300,20);
        background.add(option_three);

        option_four = new JRadioButton(myenergy.getMyenergyAnswers(7));
        option_four.setBounds(60,600,300,20);
        background.add(option_four);

        group = new ButtonGroup();
        group.add(option_one);
        group.add(option_two);
        group.add(option_three);
        group.add(option_four);

        question1= new JLabel("8." + flow.getQuestions(8));
        question1.setSize(1000,20);
        question1.setLocation(20,640);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option11Btn= new JRadioButton(" Food web " , false);
        option11Btn.setBounds(60,680,300,20);
        background.add(option11Btn);

        option21Btn= new JRadioButton(" Food pyramid", false);
        option21Btn.setBounds(60,720,300,20);
        background.add(option21Btn);

        option31Btn= new JRadioButton("Food cycle", false);
        option31Btn.setBounds(60,760,300,20);
        background.add(option31Btn);

        option41Btn= new JRadioButton(myenergy.getMyenergyAnswers(8), false);
        option41Btn.setBounds(60,800,300,20);
        background.add(option41Btn);

        group = new ButtonGroup();
        group.add(option11Btn);
        group.add(option21Btn);
        group.add(option31Btn);
        group.add(option41Btn);

       
        ButtonHandler handler = new ButtonHandler();
        next_button.addActionListener(handler);

        itemHandler itemH = new itemHandler();
        option1Btn.addItemListener(itemH);
        option2Btn.addItemListener(itemH);
        option3Btn.addItemListener(itemH);
        option4Btn.addItemListener(itemH);
        option11Btn.addItemListener(itemH);
        option21Btn.addItemListener(itemH);
        option31Btn.addItemListener(itemH);
        option41Btn.addItemListener(itemH);
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
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3Btn))
            {
                start7.correctCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1aBtn))
            {
                start7.inCorrectCount++;
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
                start7.correctCount++;
            }
            else
            if(event.getSource()==(option_one))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option_two))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option_three))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option_four))
            {
                start7.correctCount++;
            }
            else
            if(event.getSource()==(option11Btn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option21Btn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option31Btn))
            {
                start7.inCorrectCount++;
            }
            else
            if(event.getSource()==(option41Btn))
            {
                start7.correctCount++;
            }
        }
    }
    
        public class ButtonHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                if(event.getSource() == next_button)
                {

                    start9 str = new start9();
                    str.setVisible(true);
                    str.setResizable(false);
                    str.setSize(1200,850);
                    str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }

            }
        

    }
}

