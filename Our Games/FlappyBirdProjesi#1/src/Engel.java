
import java.util.Random;

public class Engel
{

    Random rand = new Random();
    private final int randomDeger = rand.nextInt(400);
    private int genelX = 900;
    private final int aralik = 100;
    private int genelWidth = 100;
    private int ustHeight = 20 + randomDeger;
    private int altY = aralik + ustHeight;// doğru
    private int altHeight = 600 - altY;
    private int üstY = 0;

    public int getUstHeight()
    {
        return ustHeight;
    }

    public void setUstHeight(int ustHeight)
    {
        this.ustHeight = ustHeight;
    }

    public int getAltHeight()
    {
        return altHeight;
    }

    public void setAltHeight(int altHeight)
    {
        this.altHeight = altHeight;
    }

    public int getGenelX()
    {
        return genelX;
    }

    public void setGenelX(int genelX)
    {
        this.genelX = genelX;
    }

    public int getGenelWidth()
    {
        return genelWidth;
    }

    public void setGenelWidth(int genelWidth)
    {
        this.genelWidth = genelWidth;
    }

    public int getÜstY()
    {
        return üstY;
    }

    public void setÜstY(int üstY)
    {
        this.üstY = üstY;
    }

    public int getAltY()
    {
        return altY;
    }

    public void setAltY(int altY)
    {
        this.altY = altY;
    }

}
