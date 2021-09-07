package yurtdisipro;

import java.util.Scanner;

public abstract class Yolcu  extends Insan implements YurtDisiKurallari
{

    
    String sebep;
    int harc;//
    boolean siyasi_yasak;//
    boolean vize;//
    String gitmek_istedigi_ulke; //
 

    public Yolcu()
    {
        super();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatirdiğiniz harc bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();//dummy

        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu ? (evet veya hayır) ");
        String cevap2 = scanner.nextLine();
        if (cevap2.equalsIgnoreCase("Evet"))
        {
            this.siyasi_yasak = true;

        }
        else
        {
            this.siyasi_yasak = false;

        }
        System.out.println("Vizeniz bulunuyor mu ? (evet veya hayır)");
        String cevap1 = scanner.nextLine();
        if (cevap1.equalsIgnoreCase("evet"))
        {
            this.vize = true;
        }
        else
        {
            this.vize = false;
        }
        System.out.println("Gitmek istediginiz Ulkeyi giriniz : ");
        this.gitmek_istedigi_ulke = scanner.nextLine();
        System.out.println("Gitme nedeninizi giriniz  (education,Business,others...) : ");
        this.sebep = scanner.nextLine();

    }

    @Override
    public boolean yurt_disi_harc_kontrolu()
    {
        if (harc < 15)
        {
            System.out.println("Lutfen Harc miktarinin tamamını yatırınız...");
            return false;

        }
        else
        {
            System.out.println("Harc islemleri tamamlandi!");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak_kontrol()
    {
        if (this.siyasi_yasak)
        {
            System.out.println("Siyasi yasağınız bulunuyor... Yurt Dışına çıkamazsınız.!");
            return false;
        }
        else
        {
            System.out.println("Herhangi bir sakınca yoktur...");
            return true;
        }

    }

    @Override
    public boolean vize_durumu_kontrol()
    {
        if (vize)
        {
            System.out.println("Gideceğiniz ülkeye vizeniz bulunuyor ...");
            return true;
        }
        else
        {
            System.out.println("Gideceginiz ülkeye vizeniz bulunmuyor . Gidemezsiniz !");
            return false;
        }

    }



    public void yolcuBilgileriYazdir(Yolcu yol)

    {
        System.out.println("Yolcunun ADI : " + getAd());
        System.out.println("Yolcunun Soyadi  : " + getSoyad());
        System.out.println("Yolcunun yasi : " + getYas());
        System.out.println("Yolcunun Uyrugu  : " + getVatandaslik());
        System.out.println("Yolcunun gidecegi Ulke : " + this.gitmek_istedigi_ulke);
        System.out.println("Yolcunun gitme sebebi  : " + this.sebep);
        
       

    }

    @Override
    public boolean yas_kontrolu()
    {
        if(getYas()>=18)
        {
            System.out.println("Tek başınıza yolculuk yapmanızda bir sakınca yoktur ...");
            return false;
        }
        else
        {
            System.out.println("Yaninizda bir bireyin olmasi gereklidir");
            return true;
        }
    }

}
