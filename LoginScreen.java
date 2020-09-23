/**
 * Write a description of class LoginScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import javax.swing.JOptionPane; 
import javax.swing.ButtonGroup;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class LoginScreen extends JFrame
{
    private JButton login_button;
    private JButton exit_button;
    private JLabel background;
    private JLabel logoIcon;
    private JLabel userName_label;
    private JLabel password_label;
    public JTextField userName_field;
    public JPasswordField password_field;
    private JRadioButton check_teacher;
    private JRadioButton check_student;
    private JRadioButton check_admin;
    private ButtonGroup group;
    private Container pane;
    public static int count = 0;
    public student [] arrStudents = new student[100];
    public int[] arrMarksQ1 = new int[100];
    public int[] arrMarksQ2 = new int[100];
    public int[] arrMarksQ3 = new int[100];
    public int[] arrMarksQ4 = new int[100];
    public int[] arrAverage = new int[100];
    public LoginScreen()
    {
        super("Login in Screen");
        Font font = new Font("serif", Font.BOLD,16);

        ImageIcon icon = new ImageIcon("l.jpg");
        background = new JLabel(icon);
        add(background);

        ImageIcon logo = new ImageIcon("imag.jpg");
        logoIcon = new JLabel(logo);

        logoIcon.setSize(160,200);
        logoIcon.setLocation(0,0);
        background.add(logoIcon);

        login_button = new JButton("LOGIN");
        login_button.setSize(100,30);
        login_button.setLocation(800,650);
        background.add(login_button);

        exit_button = new JButton("EXIT");
        exit_button.setSize(100,30);
        exit_button.setLocation(1000,650);
        background.add(exit_button);

        userName_label = new JLabel("Username:");
        userName_label.setSize(100,20);
        userName_label.setLocation(450,300);
        userName_label.setFont(font);
        background.add(userName_label);

        password_label = new JLabel("Password:");
        password_label.setSize(100,20);
        password_label.setLocation(450,400);
        password_label.setFont(font);
        background.add(password_label);

        userName_field = new JTextField(13);
        userName_field.setSize(250,30);
        userName_field.setLocation(600,300);
        userName_field.setToolTipText("Enter name and surname");
        background.add(userName_field);

        password_field = new JPasswordField();
        password_field.setSize(250,30);
        password_field.setLocation(600,400);
        password_field.setToolTipText("input ID number");
        background.add(password_field);

        check_teacher = new JRadioButton("Teacher", false);
        check_teacher.setBounds(20,540,300,20);
        background.add(check_teacher);

        check_student = new JRadioButton("Student",false); 
        check_student.setBounds(20,560,300,20);
        background.add(check_student);

        check_admin = new JRadioButton("Administrator",false); 
        check_admin.setBounds(20,580,300,20);
        background.add(check_admin);

        group = new ButtonGroup();
        group.add(check_admin);
        group.add(check_student);
        group.add(check_teacher);

        ButtonHandler handler = new ButtonHandler();
        exit_button.addActionListener(handler);
        login_button.addActionListener(handler);
    }

    public void displayMarks()
    {
        arrMarksQ1[count] = start3.getCorrectMarkQ1();
        arrMarksQ2[count] = start6.getCorrectMarkQ2();
        arrMarksQ3[count] = start9.getCorrectMarkQ3();
        arrMarksQ4[count] = start12.getCorrectMarkQ4();
        arrAverage[count]= start12.calcAverage();

        for(int k = 0; k < count; k++)
        {
            resultsPage.area.append(String.format("%s\t\t%s\t\t%d\t%d\t%d\t%d\t%d\n",(k+1) + "." + arrStudents[k].getName(),  arrStudents[k].getDateOfBirth(),arrMarksQ1[k], arrMarksQ2[k], arrMarksQ3[k], arrMarksQ4[k],arrAverage[k]));

        }
    }

    public class ButtonHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {

            String idNum = password_field.getText();
            String thename =userName_field.getText();
            int mark = 0;
            int average = 0;
            student stud = new student(thename,idNum,mark,average);
            teacher T = new teacher(thename,idNum);
            int count = 0;

            if(event.getSource() == exit_button)
            {

                welcomePage page = new welcomePage();

                page.setVisible(true);
                page.setResizable(false);
                page.setSize(1200,800);
                page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }

            if(check_student.isSelected()== false && check_teacher.isSelected())
            {
                if( userName_field.getText().equals(thename)
                && event.getSource() == login_button)
                {
                    JOptionPane.showMessageDialog(null,"Welcome " + userName_field.getText());
                    resultsPage results = new resultsPage();

                    results.setVisible(true);
                    results.setResizable(false);
                    results.setSize(1200,800);
                    results.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "ensure that you chose your criteria and input correct details");

            }

            if(check_student.isSelected()&& check_teacher.isSelected()== false)
            {
                if( password_field.getText().equals(idNum) && userName_field.getText().equals(thename) && event.getSource() == login_button)
                {
                    //count++;
                    JOptionPane.showMessageDialog(null,"Welcome " + userName_field.getText());

                    quizPage quiz = new quizPage();

                    quiz.setVisible(true);
                    quiz.setResizable(false);
                    quiz.setSize(1200,800);
                    quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "ensure that you chose your criteria and input correct details");
                }
            }

            if(check_admin.isSelected()&& password_field.getText().equals(idNum) && userName_field.getText().equals(thename)&& event.getSource() == login_button)
            {

                /*admin data = new admin(name,idNum);

                data.setVisible(false);
                data.setResizable(false);
                data.setSize(1200,800);
                data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();*/
            }

            try
            {

                FileWriter filew = new FileWriter("data.txt");

                BufferedWriter writer = new BufferedWriter(filew);

                PrintWriter output = new PrintWriter(writer);

                output.println(count+"."+thename + "," + idNum + "," + mark);
                arrStudents[count] = new student(thename, idNum, mark,average);
                output.close();
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }

            try
            {

                FileReader fileR = new FileReader("data.txt");

                BufferedReader input = new BufferedReader(fileR);
                String line = "";
                ArrayList aList = new ArrayList();

                if(! input.ready())//checks whether the file can be read
                {
                    throw new IOException();
                }

                while((line == input.readLine()))
                {
                    aList.add(line);
                }
                input.close();
                int size = aList.size();
                for(int i = 0; i< size ;i++)
                {
                    resultsPage.area.append(aList.get(i).toString());
                }
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }

    public static void main(String [] args)
    {
        LoginScreen screen = new LoginScreen();
        screen.setVisible(true);
        screen.setSize(1200,800);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.pack();
    }

}
