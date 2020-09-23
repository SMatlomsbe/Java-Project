
/**
 * Write a description of class testFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import javax.swing.JOptionPane;
public class testFile
{
    public static void main(String[] args) 
       {
      try
        {
        File file = new File("data.txt"); 
        PrintWriter output = new PrintWriter(file);
        
        student[] arrStudents = new student[100];
        
        String answer = JOptionPane.showInputDialog("Do you want to view students records (y/n)?: ");
        
        int count = 0;
        while(!(answer.equalsIgnoreCase("y")))
        {
            String name = JOptionPane.showInputDialog("");
            String idNumber  = JOptionPane.showInputDialog("");
            int marks  = Integer.parseInt(JOptionPane.showInputDialog(""));
            
            student myStudents = new student(name,idNumber,marks);
            arrStudents[count] = myStudents;
            
            arrStudents[count].setName(name);
            arrStudents[count].setIdNum(idNumber);
            arrStudents[count].calcResults(marks);
        
           count++;
           answer = JOptionPane.showInputDialog("Do you want to view another student's records (y/n)?: ");
        }
        
        
            
        for(int i = 0; i< count;i++)
          {
            output.println((i+1) + "." + arrStudents[i].toString());
            output.println();
            output.println();
            // and marks
           }
        
        output.close();
        }
         catch(IOException ex)
          {
             JOptionPane.showMessageDialog(null, ex);
           }
    }
}
