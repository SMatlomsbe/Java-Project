
/**
 * Write a description of class CellMultiple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class cellMultiple
{
   private String Option_one;
    private String Option_two;
    private String Option_three;
    private String Option_four;
    public cellMultiple()
    {
    }

    public void setQuestions(int random)
    {
        cellSolutions mycell = new cellSolutions(random);
        if(random == 1)
        {
            Option_one = "half  the  number  of  chromosomes ";
            Option_two = mycell.getMycellAnswers(1);
            Option_three = "twice  the  number  of  chromosomes";
            Option_four = "two  new  nuclei";
        }
        if(random == 2)
        {
            Option_one = "Growth ";
            Option_two = "Repair";
            Option_three = " Asexual reproduction in unicelullar org";
            Option_four = mycell.getMycellAnswers(2);
        }
        if(random == 3)
        {
            Option_one = "3 cells ";
            Option_two = "4 cells";
            Option_three = mycell.getMycellAnswers(3);
            Option_four = "16 cells ";
        }
        if(random == 4)
        {
            Option_one = "Centrioles ";
            Option_two = mycell.getMycellAnswers(4);
            Option_three = "Centromeres";
            Option_four = "Chromosomes";
        }
        if(random == 5)
        {
            Option_one = mycell.getMycellAnswers(5);
            Option_two = "mitochondria";
            Option_three = "Chloroplast";
            Option_four = "Nucleoli";
        }
        if(random == 6)
        {
            Option_one = "The cell wall only ";
            Option_two = "The vacuole only";
            
            Option_three ="The cell wall and nucleus";
            
            Option_four = mycell.getMycellAnswers(6);
        }
        if(random == 7)
        {
            Option_one = "metaphase ";
            Option_two = "Anaphase";
            Option_three = "Prophase";
            Option_four = mycell.getMycellAnswers(7);
        }
        if(random == 8)
        {
            Option_one = mycell.getMycellAnswers(8);
            Option_two = " RNA";
            Option_three = "centromes";
            Option_four = "chromatids";
        }
        if(random == 9)
        {
            Option_one = " False";
            Option_two = mycell.getMycellAnswers(9);
        }
        if(random == 10)
        {
            Option_one = "Development and growth";
            Option_two = "Cell replacement ";
            Option_three = "Replacement of damaged plant or animal tissue (regeneration)  ";
            Option_four = mycell.getMycellAnswers(10);
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
