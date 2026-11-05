public class Lampe 
{
    private String  Farbe;
    private int     Watt;
    private boolean Dimmbar;

    public String getFarbe()
    {
        return Farbe;
        
    }
    // this is a comment 
    public int getWatt()
    {
        return Watt;
    }

    public boolean getDimmbar()
    {
        return Dimmbar;
    }    
    
    public void setFarbe (String neuFarbe)
    {
        Farbe = neuFarbe;
    }
    
    public void setDimmbar (boolean neuDimmbar)
    {
        Dimmbar = neuDimmbar;
    }
    
    public void setWatt (int neuWatt)
    {
        Watt = neuWatt;
    }
    
    
    
    
    
    
}