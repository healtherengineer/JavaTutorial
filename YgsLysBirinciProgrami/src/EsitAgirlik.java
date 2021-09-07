
public class EsitAgirlik extends Aday
{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim)
    {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    int puanHesapla()
    {

        return getEdebiyat() * 5 + getFizik() * 2 + getMatematik() * 5 + getTurkce() * 4;
    }

}
