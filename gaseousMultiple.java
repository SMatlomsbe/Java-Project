
/**
 * Write a description of class gaseousMultiple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gaseousMultiple
{
    private String Option_one;
    private String Option_two;
    private String Option_three;
    private String Option_four;
    public gaseousMultiple()
    {
    }
    
    public void setQuestions(int random)
    {
        gaseousSolutions myGaseousAnswer = new gaseousSolutions(random);
        
        if(random == 1)
        {
            Option_one = "Heart";
            Option_two = "Kidney";
            Option_three = myGaseousAnswer.getMygaseousAnswers(1);
            Option_four = "Gonad";
        }
        if(random == 2)
        {
            Option_one = myGaseousAnswer.getMygaseousAnswers(2);
            Option_two = "Stomata";
            Option_three = "Stems";
            Option_four = "Roots";
        }
        if(random == 3)
        {
            Option_one = "Plant living in the sea";
            Option_two = myGaseousAnswer.getMygaseousAnswers(3);
            Option_three = "Oxygen dissolved in water";
            Option_four = "Plants with special adaptionsto live in or around water";
        }
        if(random == 4)
        {
            Option_one = "Oral Cavity";
            Option_two = "Gonad";
            Option_three = "Swim bladder";
            Option_four = myGaseousAnswer.getMygaseousAnswers(4);
        }
        if(random == 5)
        {
            Option_one = "Air";
            Option_two = "Water";
            Option_three = myGaseousAnswer.getMygaseousAnswers(5);
            Option_four = "Oxygen";
        }
        if(random == 6)
        {
            Option_one = myGaseousAnswer.getMygaseousAnswers(6);
            Option_two = "The air sac of siphonophore, serving as float ";
            Option_three = "The stalk that attaches the leaf of the stem";
            Option_four = "Plant living in the sea, opposite of fresh water";
        }
        if(random == 7)
        {
            Option_one = "Taking in oxygen";
            Option_two = "Exit of oxygen";
            Option_three = myGaseousAnswer.getMygaseousAnswers(7);
            Option_four = "Exit of water";
        }
        if(random == 8)
        {
            Option_one = "Taking in oxygen";
            Option_two = "Exit of oxygen";
            Option_three = myGaseousAnswer.getMygaseousAnswers(8);
            Option_four = "Taking in water";
        }
        if(random == 9)
        {
            Option_one = "Exchange of gases";
            Option_two =myGaseousAnswer.getMygaseousAnswers(9);
            Option_three = "Diffussion";
            Option_four = "inspiration and expiration";
        }
        if(random == 10)
        {
            Option_one = myGaseousAnswer.getMygaseousAnswers(10);
            Option_two = "Process through which different gases are are transferred in opposite directions";
            Option_three = "When oxygen is required to enter cell while waste carbon must be removed";
            Option_four = "The movement of gases across membranes";
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
