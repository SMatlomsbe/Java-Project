
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
public class start2 extends JFrame
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

    private JRadioButton option1_one;
    private JRadioButton option1_two;
    private JRadioButton option1_three;
    private JRadioButton option1_four;

    public start2()
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
        //cellMultiple micell = new cellMultiple();

        question1= new JLabel("5."+cell.getQuestions(5));
        question1.setSize(1000,20);
        question1.setLocation(20,20);
        question1.setFont(font);
        question1.setForeground(Color.WHITE);
        background.add(question1);

        option1Btn= new JRadioButton(mycell.getMycellAnswers(5), false);
        option1Btn.setBounds(60,80,300,20);
        background.add(option1Btn);

        option2Btn= new JRadioButton("mitochondria", false);
        option2Btn.setBounds(60,120,300,20);
        background.add(option2Btn);

        option3Btn= new JRadioButton("chloroplast", false);
        option3Btn.setBounds(60,160,300,20);
        background.add(option3Btn);

        option4Btn= new JRadioButton("Nucleoli", false);
        option4Btn.setBounds(60,200,300,20);
        background.add(option4Btn);

        group = new ButtonGroup();
        group.add(option1Btn);
        group.add(option2Btn);
        group.add(option3Btn);
        group.add(option4Btn);

        question5 = new JLabel("6."+ cell.getQuestions(6));
        question5.setSize(1000,20);
        question5.setLocation(20,240);
        question5.setFont(font);
        question5.setForeground(Color.WHITE);
        background.add(question5);

        option1aBtn= new JRadioButton("The cell wall only", false);
        option1aBtn.setBounds(60,280,300,20);
        background.add(option1aBtn);

        option2aBtn= new JRadioButton("The vacuole only", false);
        option2aBtn.setBounds(60,320,300,20);
        background.add(option2aBtn);

        option3aBtn= new JRadioButton("The cell wall and nucleus", false);
        option3aBtn.setBounds(60,360,300,20);
        background.add(option3aBtn);

        option4aBtn= new JRadioButton(mycell.getMycellAnswers(6), false);
        option4aBtn.setBounds(60,400,300,20);
        background.add(option4aBtn);

        group = new ButtonGroup();
        group.add(option1aBtn);
        group.add(option2aBtn);
        group.add(option3aBtn);
        group.add(option4aBtn);

        question3= new JLabel("7." + cell.getQuestions(7));
        question3.setSize(1000,20);
        question3.setLocation(20,440);
        question3.setFont(font);
        question3.setForeground(Color.WHITE);
        background.add(question3);

        option_one = new JRadioButton("metaphase");
        option_one.setBounds(60,480,300,20);
        background.add(option_one);

        option_two = new JRadioButton("Anaphase");
        option_two.setBounds(60,520,300,20);
        background.add(option_two);

        option_three = new JRadioButton (mycell.getMycellAnswers(7));
        option_three.setBounds(60,560,300,20);
        background.add(option_three);

        option_four = new JRadioButton("Prophase");
        option_four.setBounds(60,600,300,20);
        background.add(option_four);

        group = new ButtonGroup();
        group.add(option_one);
        group.add(option_two);
        group.add(option_three);
        group.add(option_four);

        question3= new JLabel("8. "+ cell.getQuestions(8));
        question3.setSize(1000,20);
        question3.setLocation(20,640);
        question3.setFont(font);
        question3.setForeground(Color.WHITE);
        background.add(question3);

        option1_one = new JRadioButton(mycell.getMycellAnswers(8));
        option1_one.setBounds(60,680,300,20);
        background.add(option1_one);

        option1_two = new JRadioButton("RNA");
        option1_two.setBounds(60,720,300,20);
        background.add(option1_two);

        option1_three = new JRadioButton ("Centromes");
        option1_three.setBounds(60,760,300,20);
        background.add(option1_three);

        option1_four = new JRadioButton("chromatids");
        option1_four.setBounds(60,800,300,20);
        background.add(option1_four);

        group = new ButtonGroup();
        group.add(option1_one);
        group.add(option1_two);
        group.add(option1_three);
        group.add(option1_four);

        ButtonHandler handler = new ButtonHandler();
        next_button.addActionListener(handler);

        itemHandler itemH = new itemHandler();
        option1Btn.addItemListener(itemH);
        option2Btn.addItemListener(itemH);
        option3Btn.addItemListener(itemH);
        option4Btn.addItemListener(itemH);
        option1_one.addItemListener(itemH);
        option1_two.addItemListener(itemH);
        option1_three.addItemListener(itemH);
        option1_four.addItemListener(itemH);
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
                start.correctCount++;
            }
            else
            if(event.getSource()==(option2Btn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option3Btn))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option4Btn))
            {
                start.inCorrectCount++;
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
            else
            if(event.getSource()==(option_one))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option_two))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option_three))
            {
                start.correctCount++;
            }
            else
            if(event.getSource()==(option_four))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1_one))
            {
                start.correctCount++;
            }
            else
            if(event.getSource()==(option1_two))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1_three))
            {
                start.inCorrectCount++;
            }
            else
            if(event.getSource()==(option1_four))
            {
                start.inCorrectCount++;
            }
        }
    }

    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == next_button)
            {
                start3 str = new start3();
                str.setVisible(true);
                str.setResizable(false);
                str.setSize(1200,850);
                str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }

        }
       }
    }
