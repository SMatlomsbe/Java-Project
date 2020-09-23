
/**
 * Abstract class Students - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
import javax.swing.JOptionPane;

public abstract class requiredInfo implements Science
{
    public String name;
    public String idNumber;
  
    public requiredInfo( String name,String idNumber)
    {
        this.name= name;
        this.idNumber = idNumber;
    }
    
    @Override
    public abstract void setName(String Name);
    
    @Override
    public void setIdNum(String idNum)
    {
        if(!(idNumber.equalsIgnoreCase(null)))
       { 
           idNumber = idNum;
       }
        else  if(idNumber.equalsIgnoreCase(null))
        {
            JOptionPane.showMessageDialog(null,"Please enter  your Id number");
        }
    }
    
    public String getIdnum()
    {
        return idNumber;
    }
   
    public String toString()
    {
        return String.format("%s%s%s%s","Name:",name,"ID Number:",idNumber);
    }
}
