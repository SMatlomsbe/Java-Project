
/**
 * Write a description of class admin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
public class admin extends requiredInfo
{
   public admin(String name,String idNumber)
   {
       super(name,idNumber);
    }
    
   @Override
   public void setName(String Name)
    {
       if(!(name.equalsIgnoreCase(null) && name.startsWith("A")))
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
    
   public void storeResults()
    {
        LoginScreen application = new LoginScreen();
        //application.writeToTextFile();
    }
   
}
