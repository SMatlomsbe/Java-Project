
/**
 * Write a description of class Videos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Videos
{
    public Videos()
    {
    }
    public void watchCellDivisionVideo() throws Exception 
    {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Cell Division.mp4");
    }
     public void watchPhotosynthesisVideo() throws Exception
    {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Photosynthesis.mp4");
    }
     public void watchGaseousVideo() throws Exception
    {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Gas Exchange.mp4");
    }
     public void watchEnergyFlowVideo() throws Exception
    {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"Food Chains .mp4");
    }
}
