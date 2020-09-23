
/**
 * Write a description of class cellDivision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cellDivision
{
   private int randomNum;
    public cellDivision(int randomNum)
    {
        this.randomNum = randomNum;
    }
    
    public int getRandomNum()
    {
        return randomNum;
    }
    
    public String getQuestions(int ran)
       {
        randomNum = ran;
        String question = "";
        switch(randomNum)
        {
                    case 1 : question = "Each  new  cell  produced  by  mitosis  will  have..."; 
                    break;
                    case 2 : question = "Which  of  the  following  is  NOT  a  function  of  mitosis?";
                    break;
                    case 3 : question = "If  a  cell  divides  by  mitosis,  how  many  cells  will  there  be  after  three  divisions?";
                    break;
                    case 4 : question = "In  a  cell  nucleus,  the  thread-like  structures  are  called...";
                    break;
                    case 5 : question = "The  organelles  that  synthesise  proteins  are  called...";
                    break;
                    case 6 : question = "The  part  of  the  plant  cell  responsible  for  providing  support is...";
                    break;
                    case 7 : question = "During which phase does cells grow in size and replicate their DNA?";
                    break;
                    case 8 : question = "Each chromosome consist of two___________ joint by the centromere";
                    break;
                    case 9 : question = "Cancer is a disease of uncontrolled mitosis";
                    break;
                    case 10 : question = "Which one is the role of mitosis?";
                    break;
                }
        return question;
    }
}
