import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LampeTest
{
    @Test
    public void testWattMinimum()
    {
        Lampe lampe = new Lampe("Rot", 1, true);
        assertEquals(1, lampe.getWatt());
    }

    @Test
    public void testWattMaximum()
    {
        Lampe lampe = new Lampe("Rot", 500, true);
        assertEquals(500, lampe.getWatt());
    }

    @Test
    public void testWattNormal()
    {
        Lampe lampe = new Lampe("Blau", 100, false);
        assertEquals(100, lampe.getWatt());
    }
    
    @Test
    public void testWattZuGross()
    {
        Lampe lampe = new Lampe("Rot", 501, true);
        assertEquals(1, lampe.getWatt());
    }
}