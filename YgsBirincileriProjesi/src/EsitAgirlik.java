
public class EsitAgirlik extends Aday
{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik)
    {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla()
    {

        return getEdebiyat() * 5 + getFizik() * 2 + getMatematik() * 5 + getTurkce() * 4;
    }

}
