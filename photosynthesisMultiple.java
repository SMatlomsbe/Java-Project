
/**
 * Write a description of class photosynthesisMultiple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class photosynthesisMultiple
{
     private String Option_one;
    private String Option_two;
    private String Option_three;
    private String Option_four;
    public photosynthesisMultiple()
    {
    }
    
    public void setQuestionsNormal(int random)
    {
        
        photosynthesisSolutions myphotosynthesisAnswer = new photosynthesisSolutions(random);
        if(random == 1)
        {
            Option_one = "Zero";
            Option_two = "One";
            Option_three = "Three";
            Option_four = myphotosynthesisAnswer.getMyphotosynthesisAnswer(1);
        }
        if(random == 2)
        {
            Option_one = "Chemiosmosis";
            Option_two = myphotosynthesisAnswer.getMyphotosynthesisAnswer(2);
            Option_three = "Charge seperation";
            Option_four = "Electron transport";
        }
        if(random == 3)
        {
            Option_one = myphotosynthesisAnswer.getMyphotosynthesisAnswer(3);
            Option_two = "Grana";
            Option_three = "Photosystems";
            Option_four = "Photons";
        }
        if(random == 4)
        {
            Option_one = myphotosynthesisAnswer.getMyphotosynthesisAnswer(4);
            Option_two = "Carbon dioxide, light and water";
            Option_three = "water, temperature and carbon dioxide";
            Option_four = "Oxygen, water and temperature";
        }
        if(random == 5)
        {
            Option_one = myphotosynthesisAnswer.getMyphotosynthesisAnswer(5);
            Option_two = "Red, violet and blue";
            Option_three = "Infrared, red and yellow";
            Option_four = "Red, white and blue";
        }
        if(random == 6)
        {
            Option_one = myphotosynthesisAnswer.getMyphotosynthesisAnswer(6);
            Option_two = "Carbon fixation";
            Option_three = "The crebs cycle";
            Option_four = "Carbon dioxide is not produced during photosynthesis";
        }
        if(random == 7)
        {
            Option_one = "Chlorophll";
            Option_two = "Beta carotene";
            Option_three = myphotosynthesisAnswer.getMyphotosynthesisAnswer(7);
            Option_four = "Vitamin A";
        }
        if(random == 8)
        {
            Option_one = myphotosynthesisAnswer.getMyphotosynthesisAnswer(8);
            Option_two = "Grana";
            Option_three = "Photons";
            Option_four = "Stroma";
        }
        if(random == 9)
        {
            Option_one = "Carbon dioxide";
            Option_two = myphotosynthesisAnswer.getMyphotosynthesisAnswer(9);
            Option_three = "Glucose";
            Option_four = "ATP";
        }
        if(random == 10)
        {
            Option_one = "Glucose";
            Option_two = "Fructose";
            Option_three = "Ribolose 1.5 bosphosphate";
            Option_four = myphotosynthesisAnswer.getMyphotosynthesisAnswer(10);
        }
    }
        
        public String getOption1()
    {
        return Option_one;
    }
    public String getOption2()
    {
        return  Option_two;
    }
    public String getOption3()
    {
        return Option_three;
    }
    public String getOption4()
    {
        return Option_four;
    }
    }

