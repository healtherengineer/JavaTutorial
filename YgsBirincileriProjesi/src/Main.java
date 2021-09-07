
public class Main
{

    public static void main(String[] args)
    {
        Sayisal sayısal1 = new Sayisal(27, 17, 30, 15);
        Sayisal sayısal2 = new Sayisal(40, 35, 20, 35);
        Sayisal birinci_sayisal = birinci(sayısal1, sayısal2);
        EsitAgirlik esitagirlik1 = new EsitAgirlik(39, 35, 30, 0);
        EsitAgirlik esitagirlik2 = new EsitAgirlik(20, 30, 25, 2);
        EsitAgirlik birinci_esitagirlik = birinci(esitagirlik1, esitagirlik2);
        System.out.println("Esit Agirlik birinicisinin puani : " + birinci_esitagirlik.puanHesapla());
        System.out.println("Birincinin puani : " + birinci_sayisal.puanHesapla());

    }

    public static <E extends Aday> E birinci(E e1, E e2)
    {
        if (e1.puanHesapla() > e2.puanHesapla())
        {
            return e1;

        }
        else
        {
            return e2;
        }

    }

}
