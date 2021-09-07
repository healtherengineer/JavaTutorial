
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HafizaOyunu {

    private static Kart[][] kartlar = new Kart[4][4];

    public static void kayittanAl() {

        File file = new File("kayit.bin");
        if (file.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kayıtlı bir oyununuz bulunmaktadır . Kaldığınız yerden devam etmek ister misiniz ?");
            String cevap = scanner.nextLine();
            if (cevap.equals("yes")) {

                kartlar = OyunKayit.kayittanAl();
                return;
            }
        }
        kartlar[0][0] = new Kart('F');
        kartlar[0][1] = new Kart('D');
        kartlar[0][2] = new Kart('G');
        kartlar[0][3] = new Kart('H');
        kartlar[1][0] = new Kart('B');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('C');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('B');
        kartlar[2][1] = new Kart('E');
        kartlar[2][2] = new Kart('F');
        kartlar[2][3] = new Kart('E');
        kartlar[3][0] = new Kart('A');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('D');
        kartlar[3][3] = new Kart('C');

    }

    public static void starting() throws InterruptedException{
//      for (int i = 0; i < 4; i++) {
//            System.out.println("____________________");
//            for (int j = 0; j < 4; j++) {
//              
////                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
////                    Thread.sleep(2000);
////                   //no oyunTahtasi();
////                  //  System.out.print(" | | ");
//                
//            }
//            System.out.println(""); // matris görüntüsü icin.!!!
//        }
     //   System.out.print("____________________");
     
        for (int i = 0; i < 4; i++) {
            System.out.println("____________________");
            for (int j = 0; j < 4; j++) {
                kartlar[i][j].setTahmin(true);
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
                    Thread.sleep(250);
                    kartlar[i][j].setTahmin(false);
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println(""); // matris görüntüsü icin.!!!
        }
        System.out.print("____________________");
     
    }
public static void clrscr() {
  for (int i = 0; i < 50; ++i) System.out.println();
  
  for(int i = 0 ;i < 20 ; i++){
      System.out.print("*");
  }
    System.out.print("Welcome to Our game ");
      
  for(int i = 0 ;i < 20 ; i++){
      System.out.print("*");
  }
    System.out.println("");
}
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        kayittanAl();
        starting();
      clrscr();
        while (oyunBittiMi() == false) {

            oyunTahtasi();

            System.out.print("Oyundan Çıkmak için q'ya basınız ...");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {

                System.out.print("Oyunu kaydetmek ister misiniz ... (yes yada no)");

                String cevap1 = scanner.nextLine();
                if (cevap1.equals("yes")) {
                    OyunKayit.oyunKaydet(kartlar);

                } else {
                    System.out.println("Oyun Kaydedilmedi ...");
                }
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            tahminEt();

        }

    }

    public static void tahminEt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nBirinci tahmininizi giriniz (i ve j degerlerini arada bir bosluk olacak sekilde giriniz) :");

        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        if (i1 > 4 || j1 > 4 || i1 < 0 || j1 < 0) {
            System.out.println("Gecersiz islem...");
            return;
        }
        if (kartlar[i1][j1].isTahmin() == true) {
            return;
        }

        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.print("İkinci tahmininizi giriniz (i ve j degerlerini arada bir bosluk olacak sekilde giriniz) :");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if (i2 > 4 || j2 > 4 || i2 < 0 || j2 < 0) {
            System.out.println("Gecersiz islem...");
            kartlar[i1][j1].setTahmin(false);
            return;
        }
        kartlar[i2][j2].setTahmin(true);
        oyunTahtasi();
        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            System.out.println("\nTebrikler ... Dogru eslesme !!!...");

        } else {
            System.out.println("\nUzgünüm... Yanlis Deger Tekrar Deneyiniz...");
            kartlar[i1][j1].setTahmin(false);
            kartlar[i2][j2].setTahmin(false);

            // buraya bir dummy ekleyip dummy den sonra clear screen yapsak nasıl olur acaba?
        }

    }

    public static boolean oyunBittiMi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void oyunTahtasi() {
        for (int i = 0; i < 4; i++) {
            System.out.println("____________________");
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
                } else {
                    System.out.print(" | | ");
                }
            }
            System.out.println(""); // matris görüntüsü icin.!!!
        }
        System.out.print("____________________");

    }

}
