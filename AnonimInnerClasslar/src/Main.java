
public class Main
{

    public static void main(String[] args)
    {
        Iogrenci ogrenci1 = new Iogrenci()
        {

            @Override
            public void dersCalis()
            {

                System.out.println("Ders çalışıyor...");

            }

            @Override
            public void kayitYap()
            {

                System.out.println("Kayıt yapıyor... ");
            }
        };

        ogrenci1.dersCalis();
        ogrenci1.kayitYap();
        //Abstract class lar ile yapalım birde
        System.out.println("--------------------------------------");

        Ogrenci ogrenci2 = new Ogrenci("Mustafa ZAIMOGLU", "02180201066")
        {

            // sadece abstract methodumuzu override ederiz...
            @Override
            void kayitYaptir()
            {

                System.out.println("Kayit yapılıyor..." + " İsim : " + getIsim() + " Numara : " + getNo());

            }
        };
        ogrenci2.ders_calis();
        ogrenci2.kayitYaptir();

    }

    public interface Iogrenci
    {

        void dersCalis();

        void kayitYap();

    }

//--------------------------------------------------
    public static abstract class Ogrenci
    {

        private String isim;
        private String no;

        public String getIsim()
        {
            return isim;
        }

        public void setIsim(String isim)
        {
            this.isim = isim;
        }

        public String getNo()
        {
            return no;
        }

        public void setNo(String no)
        {
            this.no = no;
        }

        public Ogrenci(String isim, String no)
        {
            this.isim = isim;
            this.no = no;
        }

        abstract void kayitYaptir();

        public void ders_calis()
        {
            System.out.println("Ders calışılıyor...");
        }

    }

}
