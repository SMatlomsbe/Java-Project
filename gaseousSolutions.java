
/**
 * Write a description of class gaseousSolutions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gaseousSolutions
{
    private int randomNum;
    public gaseousSolutions(int randomNum)
    {
        this.randomNum = randomNum;
    }

    public int getRandomNum()
    {
        return randomNum;
    }

    public String getMygaseousAnswers(int randomNum)
    {
        String answer = "";
        switch(randomNum)
        {
            case 1 : answer = "Lungs";
            break;
            case 2 : answer = "The entire plant is involved leaves(stomata), stem(lenticels) and roots";
            break;
            case 3 : answer = "Plants growing in salty water and is a specialized structure developed from the root in certain plants growing in swamps and marshes serving as respiratory organ.";
            break;
            case 4 : answer = "Fish have specialised organs called the gills for exchange of gases";
            break;
            case 5 : answer = "Oxygen dissolved in water";
            break;
            case 6 : answer = "Is a plate like cover made up of muscles and bony layers present on the outer side of the gills";
            break;
            case 7 : answer = "Taking in water thereby oxygen";
            break;
            case 8 : answer = "Exit of water";
            break;
            case 9 : answer = "A biological process through which different gases are transferred in opposite directions accross a specialized respiratory surface";
            break;
            case 10 : answer = "Exchange of gases";
            break;
        }
        return answer;
    }
}
