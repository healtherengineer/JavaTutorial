
public class Sayisal extends Aday
{

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim)
    {
        super(turkce, matematik, edebiyat, fizik, isim);

    }

    @Override
    int puanHesapla()
    {

        return getEdebiyat() * 1 + getFizik() * 5 + getMatematik() * 5 + getTurkce() * 4;
    }

}
