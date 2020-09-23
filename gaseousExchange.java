
/**
 * Write a description of class gaseousExchange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gaseousExchange
{
    private int randomNum;
    public gaseousExchange(int randomNum)
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
                    case 1 : question = "Which are the respiratory organs in man?";
                    break;
                    case 2 : question = "Which part of a plant is involved in the gaseous exchange?";
                    break;
                    case 3 : question = "What are pneumatophores?";
                    break;
                    case 4 : question = " How does exchange of gases take place in fish?";
                    break;
                    case 5 : question = "From where do the fish obtain their oxygen supply?";
                    break;
                    case 6 : question = " What is operculum? ";
                    break;
                    case 7 : question = " Describe inspiration and expiration in fish.";
                    break;
                    case 8 : question = "what is gaseous exchange";
                    break;
                    case 9 : question = "How does gaseous exchange take place in the leaves?";
                    break;
                    case 10 : question = "What are lenticels?";
                    break;
                }
        return question;
    }
}
