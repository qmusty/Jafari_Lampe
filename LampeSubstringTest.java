import static org.junit.Assert.*;
import org.junit.Test;

public class LampeSubstringTest
{
    @Test
    public void testFarbton()
    {
        Lampe l = new Lampe("Warm Weiß", 60, true);

        assertEquals("Warm", l.getFarbton());
    }

    @Test
    public void testFarbe()
    {
        Lampe l = new Lampe("Warm Weiß", 60, true);

        assertEquals("Weiß", l.getFarbe());
    }

    @Test
    public void testFehler()
    {
        Lampe l = new Lampe("UNKN", 60, true);

        assertEquals("Fehler: Kein Leerzeichen", l.getFarbton());
        assertEquals("Fehler: Kein Leerzeichen", l.getFarbe());
    }
}