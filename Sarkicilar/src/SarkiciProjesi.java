
import java.util.Scanner;

public class SarkiciProjesi
{

    private static Sarkicilar sarkicilar = new Sarkicilar();

    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir()
    {
        System.out.println("\t0 - İslemleri tekrar görüntüle");
        System.out.println("\t1 - Şarkıcıları Listele");
        System.out.println("\t2 - Şarkıcı Ekle");
        System.out.println("\t3 - Şarkıcı Sil");
        System.out.println("\t4 - Şarkıcı Güncelle ");
        System.out.println("\t5 - Şarkıcı Ara");

        System.out.println("\t6 - Programdan Çık");

    }

    public static void sarkicilari_goruntule()
    {
        sarkicilar.sarkici_bastir();
    }

    public static void sarkicilari_ekle()
    {
        System.out.println("Eklemek istediginiz sarkicinin ismini giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }

    public static void sarkicilari_sil()
    {
        System.out.println("Silmek istediginiz sarkicinin pozisyonunu giriniz(0,1,2...) : ");
        int position = scanner.nextInt();
        sarkicilar.sarkici_sil(position - 1);

    }

    public static void sarkicilari_guncelle()
    {
        System.out.println("Güncellemek istediginiz şarkıcının pozisyonunu giriniz(0,1,2...) :  ");

        int pos = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Yeni şarkıcı'yı giriniz: ");

        String isim = scanner.nextLine();

        sarkicilar.sarkici_guncelle(isim, (pos - 1));
    }

    public static void sarkicilari_ara()
    {
        System.out.println("Aramak istediginiz Sarkicinin adini giriniz : ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args)
    {
        System.out.println("\tSarkicilar Listesin'e Hos Geldiniz");
        islemleri_bastir();
        boolean cikis = false;
        while (!cikis)
        {
            System.out.print("\tIsleminizi Seciniz (0,1,2...): ");
            int islem = scanner.nextInt();

            scanner.nextLine();

            switch (islem)
            {

                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkicilari_ekle();
                    break;
                case 3:
                    sarkicilari_sil();
                    break;
                case 4:
                    sarkicilari_guncelle();
                    break;
                case 5:
                    sarkicilari_ara();
                    break;

                case 6:
                    cikis = true;
                    System.out.println("Programdan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlis bir islem girdiniz ...");
                    break;

            }

        }

    }

}
