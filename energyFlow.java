
/**
 * Write a description of class energyFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energyFlow
{
    private int randomNum;
    public energyFlow(int randomNum)
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
            case 1 : question = "Organisms that manufacture their own food";
            break;
            case 2 : question = " which Consumers eat the first level on the food chain?";
            break;
            case 3 : question = "Animals that obtain their food from both plant and animal material";
            break;
            case 4 : question = "Which of the following best represents the flow of energy in a biome?";
            break;
            case 5 : question = "There would be no life in the oceans without organisms called ______ and ______.";
            break;
            case 6 : question = "Producers make food using ______ to trap the Sun's energy in a process called photosynthesis.";
            break;
            case 7 : question = "One model that shows how energy passes from organism to organism is called...";
            break;
            case 8 : question = "a series of nutrient and energy changes that moves through a chain of organisms is known as: ";
            break;
            case 9 : question = "Any organism which must obtain its food from a source outside itself is a...";
            break;
            case 10 : question = "Organisms which feed on dead and rotten matter and return nutrients back into the soil are called...";
            break;
        }
        return question;
    }
}
