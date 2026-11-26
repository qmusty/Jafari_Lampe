
public class Lampengeschaeft
{
    private String name;
    private Lampe lampe0 = null;
    private Lampe lampe1 = null;
    private Lampe lampe2 = null;

    public Lampengeschaeft()
    {
        name = "SuperLampengeschaeft";
    }
    
    public Lampengeschaeft(String NeuName)
    {
        name = NeuName;
    }
    
    public String GetName()
    {
        return name;
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void hinzufugen(Lampe neu)
    {
        if (lampe0 == null)
    {
            lampe0 = neu;
    }
        else if (lampe1 == null)
    {
            lampe1 = neu;
    }
        else if (lampe2 == null)
    {
            lampe2 = neu;
    }
        else
    {
            System.out.println("Fehler: Geschaeft ist voll!");
    }
    }
}