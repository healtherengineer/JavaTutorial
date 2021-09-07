

import java.util.Scanner;
class SiyasiException extends Exception{

    @Override
    public void printStackTrace()
    {

        System.out.println("Siyasi yasağınız bulunuyor yurt dışına çıkamazsınız...");
    }
    
    
}
class HarcException extends Exception{

    @Override
    public void printStackTrace()
    {
        System.out.println("Harc miktarı Asgari 15 Tl'dir .Lütfen tam yatırınız...");
    }
    
    
}
class VizeException extends Exception{

    @Override
    public void printStackTrace()
    {
        System.out.println("Vize işlemleri hatası oluştu...");

    }
    
}
class YasException extends Exception{

    @Override
    public void printStackTrace()
    {
        System.out.println("Yaşınız tek başınıza yolculuk yapmaya uygun değil!...");

    }
    
}

public  class Yolcu  
{

    
    String sebep;
    int harc;//
    boolean siyasi_yasak;//
    boolean vize;//
    String gitmek_istedigi_ulke; //
    int Yas;
 

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
        System.out.println("Yaşınızı giriniz : ");
        this.Yas =scanner.nextInt();
        scanner.nextLine();

    }

    
    public void yurt_disi_harc_kontrolu() throws HarcException
    {
        if (harc < 15)
        {
          throw new HarcException();

        }
        else
        {
            System.out.println("Harc islemleri tamamlandi!");
           
        }
    }

  
    public void siyasi_yasak_kontrol() throws SiyasiException
    {
        if (this.siyasi_yasak)
        {
         throw new SiyasiException();
            
        }
        else
        {
            System.out.println("Herhangi bir sakınca yoktur...");
            
        }

    }
 
    public void vize_durumu_kontrol() throws VizeException
    {
        if (vize)
        {
            System.out.println("Gideceğiniz ülkeye vizeniz bulunuyor ...");
          
        }
        else
        {
            throw new VizeException();
      
        }

    }



    public void yolcuBilgileriYazdir(Yolcu yol)

    {
//        System.out.println("Yolcunun ADI : " + getAd());
//        System.out.println("Yolcunun Soyadi  : " + getSoyad());
//        System.out.println("Yolcunun yasi : " + getYas());
//        System.out.println("Yolcunun Uyrugu  : " + getVatandaslik());
        System.out.println("Yolcunun gidecegi Ulke : " + this.gitmek_istedigi_ulke);
        System.out.println("Yolcunun gitme sebebi  : " + this.sebep);
        
       

    }

   
    public void yas_kontrolu() throws YasException
    {
        if(Yas>=18)
        {
            System.out.println("Tek başınıza yolculuk yapmanızda bir sakınca yoktur ...");
     
        }
        else
        {
       throw new YasException();
            
        }
    }

}
