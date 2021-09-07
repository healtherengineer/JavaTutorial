package yurtdisipro;

public class YurtDisiPro
{

    public static void main(String[] args) throws InterruptedException
    {

        String kurallar = "Yurt Dışına cıkıs Kurallari : \n"
                + "Harc bedelini tam yatırmanız gerekiyor .\n"
                + "Herhangi bir siyasi engelinizin bulunmaması gerekiyor.\n"
                + "Gideceginiz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurt dışına çıkış kurallarının hepsini yerine getirmek zorundasiniz ! ";

        System.out.println("**************************************************************************");
        System.out.println("Adana - Şakirpaşa Havalimanına Hosgeldiniz....");
        System.out.println("**************************************************************************");

        while (true)
        {
            System.out.println(kurallar);
            AvrupaliYolcu yolcu = new AvrupaliYolcu();
            if (yolcu.avrupali_mi(yolcu.getVatandaslik()))
            {
                System.out.println("Birliginiz Kontrol Ediliyor ...");
                Thread.sleep(3000);
                System.out.println(yolcu.hangi_birlik());
                System.out.println("Yasiniz Kontrol Ediliyor...");
                Thread.sleep(3000);
                if (yolcu.yas_kontrolu())
                {
                    System.out.println(message);
                    continue;
                }

                System.out.println("Gideceginiz Ulkeye vizeniz var mi? Kontrol Ediliyor...");
                Thread.sleep(3000);
                if (!yolcu.ulke_vize_kontrolu(yolcu.gitmek_istedigi_ulke))
                {
                    System.out.println("*************************");
                    System.out.println(message);
                    System.out.println("*************************");

                    continue;
                }
                Thread.sleep(3000);

                System.out.println("Harc kontrol ediliyor...");
                Thread.sleep(3000);// 3 saniye beklemesini sağlar
                if (yolcu.yurt_disi_harc_kontrolu() == false)
                {
                    System.out.println(message);

                    continue;
                }
                System.out.println("Siyasi yasak kontrol ediliyor ...");
                Thread.sleep(3000);// 3 saniye beklemesini sağlar

                if (yolcu.siyasi_yasak_kontrol() == false)
                {
                    System.out.println(message);
                    continue;
                }

                System.out.println("Yurt Dışına (" + yolcu.gitmek_istedigi_ulke + ") cıkabilirsiniz ... İyi Yolculuklar Dileriz....");
                System.out.println("Yolcu bilgileri : ");
                yolcu.yolcuBilgileriYazdir(yolcu);
                break;

            }
            System.out.println("Yasiniz Kontrol Ediliyor...");
            Thread.sleep(3000);
            if (yolcu.yas_kontrolu())
            {
                System.out.println(message);
                continue;
            }

       
            System.out.println("Birliginiz Kontrol Ediliyor ...");
            Thread.sleep(3000);
            System.out.println("Non-Eu Vatandasisiniz...");

            System.out.println("Harc kontrol ediliyor...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar
            if (yolcu.yurt_disi_harc_kontrolu() == false)
            {
                System.out.println(message);

                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor ...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar

            if (yolcu.siyasi_yasak_kontrol() == false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar
            if (yolcu.vize_durumu_kontrol() == false)
            {
                System.out.println(message);
                continue;

            }

            System.out.println("Yurt Dışına (" + yolcu.gitmek_istedigi_ulke + ") cıkabilirsiniz ... İyi Yolculuklar Dileriz....");
            System.out.println("Yolcu bilgileri : ");
            yolcu.yolcuBilgileriYazdir(yolcu);
            break;

        }

    }

}
