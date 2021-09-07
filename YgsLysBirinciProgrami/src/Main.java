
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("-------------------------------------------------------------");

        System.out.println("Ygs Lys birinci hesaplama Programına Hoş Geldiniz...");
        System.out.println("-------------------------------------------------------------");

        String islemler = "1.Esit Agirlik birinicisi \n"
                + "2.Sayisal birincisi";
        System.out.println(islemler);
        System.out.println("-------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        while (true)
        {

            System.out.print("Çıkış yapmak için q'ya basınız , Devam etmek için başka bir harfe basınız...");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("q"))
            {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            //Birinci Öğrenci
            System.out.print("Birinci Öğrencinin İsmini giriniz : ");
            String isim1 = scanner.nextLine();
            System.out.print("Birinci Öğrencinin Net Sayılarını giriniz(Türkçe , Matematik , Edebiyat , Fizik) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            //İkinci Öğrenci
            System.out.print("İkinci Öğrencinin İsmini giriniz : ");
            String isim2 = scanner.nextLine();
            System.out.print("İkinci Öğrencinin Net Sayılarını giriniz(Türkçe , Matematik , Edebiyat , Fizik) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();

            //Üçüncü  Öğrenci
            System.out.print("Üçüncü Öğrencinin İsmini giriniz : ");
            String isim3 = scanner.nextLine();
            System.out.print("Üçüncü Öğrencinin Net Sayılarını giriniz(Türkçe , Matematik , Edebiyat , Fizik) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println(islemler);
            System.out.print("İşleminizi Giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("1"))
            {
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Eşit Ağırlık birincisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());

            }
            else if (islem.equals("2"))
            {
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);

                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Sayısal birincisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());

            }
            else
            {
                System.out.println("Geçersiz İşlem...");
            }
        }

    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3)
    {

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla())
        {

            return e1;

        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla())
        {

            return e2;

        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla())
        {

            return e1;

        }
        else
        {
            return e1;
        }

    }

}
