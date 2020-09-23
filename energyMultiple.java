/**
 * Write a description of class energyMultiple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class energyMultiple
{
    private String Option_one;
    private String Option_two;
    private String Option_three;
    private String Option_four;
    public energyMultiple()
    {
    }

    public void setQuestions(int random)
    {
        energySolutions myenergy = new energySolutions(random);
        if(random == 1)
        {
            Option_one = "Herbivore ";
            Option_two = " Carnivore";
            Option_three = myenergy.getMyenergyAnswers(1);
            Option_four = "Consumers";
        }
        if(random == 2)
        {
            Option_one = " Secondary producers";
            Option_two = " Tertiary consumers";
            Option_three = "Herbivores";
            Option_four = myenergy.getMyenergyAnswers(2);
        }
        if(random == 3)
        {
            Option_one = myenergy.getMyenergyAnswers(3);
            Option_two = "Herbivores";
            Option_three = "Producers";
            Option_four = "Carnivores";
        }
        if(random == 4)
        {
            Option_one = " Food chain ";
            Option_two = myenergy.getMyenergyAnswers(4);
            Option_three = "Energy pyramid";
            Option_four = "Food cycle";
        }
        if(random == 5)
        {
            Option_one = " Decomposers, phytoplankton ";
            Option_two = " zooplankton, consumers";
            Option_three = myenergy.getMyenergyAnswers(5);
            Option_four = " zooplankton, scavengers";
        }
        if(random == 6)
        {
            Option_one = " food chains ";
            Option_two = " Cellular respiration";
            Option_three = " Microscopic organism";
            Option_four = myenergy.getMyenergyAnswers(6);
        }
        if(random == 7)
        {
            Option_one = "An energy link ";
            Option_two = " A phytoplankton cycle";
            Option_three = " photosynthesis ";
            Option_four = myenergy.getMyenergyAnswers(7);
        }
        if(random == 8)
        {
            Option_one = " Food web ";
            Option_two = " Food pyramid";
            Option_three = "Food cycle";
            Option_four = myenergy.getMyenergyAnswers(8);
        }
        if(random == 9)
        {
            Option_one = myenergy.getMyenergyAnswers(9);
            Option_two = "Autotroph";
            Option_three = "Heterotroph";
            Option_four = "parasite";
        }
        if(random == 10)
        {
            Option_one = myenergy.getMyenergyAnswers(10);
            Option_two = "fungi";
            Option_three = "Bacteria";
            Option_four = "Consumers";
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
    


