public class Formel11
{
    public int berechne(int x, int y)
    {
        int z;
        z = 4 * y - x * x;
        return z;
    }

    public int berechne(int a, int b, int c)
    {
        int e;
        e = berechne(a, 3) + berechne(c, 5) + berechne(b, a);
        return e;
    }
}