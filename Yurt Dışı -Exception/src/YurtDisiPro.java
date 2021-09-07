
import java.util.logging.Level;
import java.util.logging.Logger;

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
            System.out.println(message);
            Yolcu yolcu = new Yolcu();

            System.out.println("Yasiniz Kontrol Ediliyor...");
            Thread.sleep(3000);

            try
            {
                yolcu.yas_kontrolu();
            } catch (YasException ex)
            {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Harc kontrol ediliyor...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar
            try
            {
                yolcu.yurt_disi_harc_kontrolu();
            } catch (HarcException ex)
            {
                ex.printStackTrace();
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor ...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar
            try
            {
                yolcu.siyasi_yasak_kontrol();
            } catch (SiyasiException ex)
            {
                ex.printStackTrace();
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);// 3 saniye beklemesini sağlar
            try
            {
                yolcu.vize_durumu_kontrol();
            } catch (VizeException ex)
            {
                ex.printStackTrace();
                continue;
            }
            System.out.println("Yurt Dışına (" + yolcu.gitmek_istedigi_ulke + ") cıkabilirsiniz ... İyi Yolculuklar Dileriz....");
            System.out.println("Yolcu bilgileri : ");
            yolcu.yolcuBilgileriYazdir(yolcu);
            break;

        }

    }

}
