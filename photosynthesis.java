
/**
 * Write a description of class photosynthesis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class photosynthesis
{
   private int randomNum;
    public photosynthesis(int randomNum)
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
                    case 1 : question = "How many carbon atoms are in a molecule of RuBP?";
                    break;
                    case 2 : question = "The light reaction of photosynthesis does not include";
                    break;
                    case 3 : question = "Photosynthesis takes place in the membranes of small sacs called";
                    break;
                    case 4 : question = "The dark reaction in photosynthesis is limited by";
                    break;
                    case 5 : question = "Colors of light most useful in photosynthesis are";
                    break;
                    case 6 : question = "During what stage of photosynthesis is O2 produced?";
                    break;
                    case 7 : question = "What pigment is used in human vision?";
                    break;
                    case 8 : question = "Water vapor exits and CO2 enters a leaf through the";
                    break;
                    case 9 : question = "The oxygen that is released as O2 during photosynthesis came from _____________ molecules.";
                    break;
                    case 10 : question = "The primary form of sugar transported from the site of photosynthesis to the rest of the plant is:";
                    break;
                }
        return question;
    }

    }

