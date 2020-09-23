
/**
 * Write a description of class student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class student extends requiredInfo
{
    private int marks;
    private int average;
   public student (String name,String idNumber,int Marks,int Average)
   {
       super(name,idNumber);
       Marks = marks;
       Average = average;
    }
   
   
   public void calcResults(int marks)
   {  
        int totalMark = marks;
    }
    
   public  int calcAverage()
    {
        return average = ((marks)/(40)) *100;

    } 
    
   @Override
   public void setName(String Name)
    {
       if(!(name.equalsIgnoreCase(null) && name.startsWith("S")))
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
    
   public String getGender()
    {
        String gender = "" ; 
        String checkString = idNumber.substring(6,7);
       switch(checkString)
        {
            case "0" :  gender = "Female";
            break;
            case "1" :  gender = "Female";
            break;
            case "2" :  gender = "Female";
            break;
            case "3" :  gender = "Female";
            break;
            case "4" :  gender = "Female";
            break;
            case "5" :  gender = "Male";
            break;
            case "6" :  gender = "Male";
            break;
            case "7" :  gender = "Male";
            break;
            case "8" :  gender = "Male";
            break;
            case "9" :  gender = "Male";
            break;
            
        }
        
        return gender;
    }
    
   public String getDateOfBirth()
    {
        String day = idNumber.substring(4,6);
        String month = idNumber.substring(2,4);
        String monthOfBirth = "";
         switch (month)
             {
                 case "01": monthOfBirth = "Jan";
                     break;
                 case "02": monthOfBirth = "Feb";
                     break;
                 case "03": monthOfBirth = "Mar";
                     break;
                 case "04": monthOfBirth = "Apr";
                     break;
                 case "05": monthOfBirth = "May";
                     break;
                 case "06": monthOfBirth = "Jun";
                     break;
                 case "07": monthOfBirth = "Jul";
                     break;
                 case "08": monthOfBirth = "Aug";
                     break;
                 case "09": monthOfBirth = "Sept";
                     break;
                 case "10": monthOfBirth = "Oct";
                     break;
                 case "11": monthOfBirth = "Nov";
                     break;
                 case "12": monthOfBirth = "Dec";
                     break;
                     
             }
        String year = idNumber.substring(0,2);
        
        return day +" "+monthOfBirth+" 19"+year;
    }
    
    public String checkNationality()
    {
        
        String nationality = idNumber.substring(10,11);
        String check_nationality = "";
        
       if (nationality.equalsIgnoreCase("0"))
         {
             check_nationality = "South african";
          }
            else
          if(nationality.equalsIgnoreCase("1"))
           {
              check_nationality = "Foreigner";
           }
             
       return check_nationality;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%s%d",super.toString(),"Marks:",marks);
    }
    
}
