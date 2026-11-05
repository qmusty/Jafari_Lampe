public class Lampe 
{
    private String  Farbe;
    private int     Watt;
    private boolean Dimmbar;

    public Lampe (String neuFarbe, int neuWatt, boolean neuDimmbar)
    {
        setFarbe(neuFarbe);
        setWatt(neuWatt);
        setDimmbar(neuDimmbar);
        printLampe();
    }
    
    public Lampe (String neuFarbe, boolean neuDimmbar)
    {
        setFarbe(neuFarbe);
        setWatt(14);
        setDimmbar(neuDimmbar);
        
    }
    
    public Lampe (String neuFarbe, int neuWatt)
    {
        setFarbe(neuFarbe);
        setWatt(neuWatt);
        setDimmbar(true);
        
    }
    
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
       if (neuWatt >= 1 && neuWatt <= 500)
        {   
        Watt = neuWatt;
        }
        else
        {
        System.out.println("Fehler: Watt muss zwischen 1 und 500 liegen!");
        Watt = 1;
        }
    }
    
        public void printLampe()
    {
        System.out.println(Farbe + " , " + Watt + " , " + Dimmbar);
    }
}