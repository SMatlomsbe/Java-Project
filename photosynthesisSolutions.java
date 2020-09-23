
/**
 * Write a description of class photosynthesiSolutions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class photosynthesisSolutions
{
    private int randomNum;
    public photosynthesisSolutions(int randomNum)
    {
        this.randomNum = randomNum;
    }

    public int getRandomNum()
    {
        return randomNum;
    }

    public String getMyphotosynthesisAnswer(int randomNum)
    {
        String answer = "";
        switch(randomNum)
        {

            case 1 : answer = "Five";
            break;
            case 2 : answer = "Oxygen liberation";
            break;
            case 3 : answer = "Thylakoids";
            break;
            case 4 : answer = "Carbon dioxide, temperature and light";
            break;
            case 5 : answer = "Green, Yellow and Orange";
            break;
            case 6 : answer = "Cyclic photophosphorylation";
            break;
            case 7 : answer = "Retinal";
            break;
            case 8 : answer = "Stomata";
            break;
            case 9 : answer = "Water";
            break;
            case 10 : answer = "Sucrose";
            break;
        }
        return answer;
    }
}
