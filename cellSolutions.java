
/**
 * Write a description of class cellSolutions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cellSolutions
{
    private int randomNum;
    public cellSolutions(int randomNum)
    {
        this.randomNum = randomNum;
    }

    public int getRandomNum()
    {
        return randomNum;
    }

    public String getMycellAnswers(int randomNum)
    {
        String answer = "";
        switch(randomNum)
        {

            case 1 : answer = " a  full  set  of  chromosomes";
            break;
            case 2 : answer = "The formation of cells";
            break;
            case 3 : answer = "8 cells";
            break;
            case 4 : answer = "Centrosomes";
            break;
            case 5 : answer = "ribosomes";
            break;
            case 6 : answer = "The cell wall and vacuole";
            break;
            case 7 : answer = "Interphase";
            break;
            case 8 : answer = "Chromatids";
            break;
            case 9 : answer = "True";
            break;
            case 10 : answer = "All the above";
            break;
        }
        return answer;
    }
}
