
/**
 * Write a description of class teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class teacher extends requiredInfo
{
   public teacher(String name,String idNumber)
   {
       super(name,idNumber);
    }
   
   public void setName(String Name)
    {
       if(!(name.equalsIgnoreCase(null) && name.startsWith("T")))
       {
          Name = name;
       }
        else
        if(name.equalsIgnoreCase(null))
        {
            JOptionPane.showMessageDialog(null,"Please enter  your name");
        }
    }
    
    public String getName()
    {
        return name;
    } 
    
   public void viewResults()
   {
       
    }
    
   
}

