
/**
 * Write a description of class energySolutions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energySolutions
{
    private int randomNum;
    public energySolutions(int randomNum)
    {
        this.randomNum = randomNum;
    }

    public int getRandomNum()
    {
        return randomNum;
    }

    public String getMyenergyAnswers(int randomNum)
    {
        String answer = "";
        switch(randomNum)
        {

            case 1 : answer = "Producer";
            break;
            case 2 : answer = "Primary consumers";
            break;
            case 3 : answer = "Omnivores";
            break;
            case 4 : answer = "Food web";
            break;
            case 5 : answer = " phytoplankton, zooplankton";
            break;
            case 6 : answer = "Chlorophyll";
            break;
            case 7 : answer = " Food chain";
            break;
            case 8 : answer = "Food chain";
            break;
            case 9 : answer = "Saprophyte";
            break;
            case 10 : answer = "Decomposers";
            break;
        }
        return answer;
    }
}
