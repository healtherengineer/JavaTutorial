package calısanproje;

import java.util.Scanner;

public class CalısanProje {

    public static void main(String[] args) {
//not Break içinde bulunduğu while veya for dongüsünü sonlandırır.
        //return programı sonlandırır
        Scanner scanner = new Scanner(System.in);
        Yazilimci yazilimci = new Yazilimci("Ege", "BARISAN", "1283", "Java/C/HTML-CSS");
        Yonetici yonetici1 = new Yonetici("Sezaver", "BARISAN", "1", 12);
        System.out.println("*****Calisan otomasyonuna Hosgeldiniz****");
        String islemler = "-->Yazilimci islemleri icin 1'e basiniz\n"
                + "-->Yonetici islemleri icin 2'e basiniz\n"
                + "-->Cıkmak icin q'ya basiniz .\n";
        while (true) {
            System.out.println(islemler);
            System.out.print("Yapmak istediginiz islemi seciniz : ");
            String islem = scanner.nextLine();
            //scanner.nextLine(); // Dummy
            if (islem.equals("q")) {
                System.out.println("Iyi Gunler :) Sistemden çıkılıyor....");
                return;
            } else if (islem.equals("1")) {
                String yazilimciIslem = "-->Yazilimcinin bilgileri icin 1'e basiniz\n"
                        + "-->Format islemleri icin 2 'ye basiniz\n "
                        + "-->Ana Menü'ye donmek icin q ya basiniz .\n";
                while (true) {

                    System.out.println(yazilimciIslem);
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    islem = scanner.nextLine();
                    //scanner.nextLine(); // Dummy (int ten sonra string alacaksan bu)
                    if (islem.equals("q")) {
                        System.out.println("Ana menü'ye dönülüyor...");
                        break;
                    } else if (islem.equals("1")) {
                        yazilimci.bilgiVer();
                    } else if (islem.equals("2")) {
                        System.out.println("Format atılacak isletim sistemini giriniz : ");
                        String isletim = scanner.nextLine();
                        yazilimci.formatAt(isletim);
                    } else {
                        System.out.println("Gecersiz islem....");
                    }
                }
            } else if (islem.equals("2")) {
                String yoneticiIslemleri = "-->Yoneticinin bilgileri icin 1'e basiniz\n"
                        + "-->Zam  islemleri icin 2 'ye basiniz\n "
                        + "-->Ana menü'ye donmek icin q ya basiniz .\n";

                while (true) {
                    System.out.println(yoneticiIslemleri);
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    islem = scanner.nextLine();
                    //     scanner.nextLine();
                    if (islem.equals("q")) {
                        System.out.println("Ana Menüye geri dönülüyor...");
                        break;

                    } else if (islem.equals("1")) {
                        yonetici1.bilgiVer();
                    } else if (islem.equals("2")) {
                        System.out.print("Zam miktarını giriniz : ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        yonetici1.zamYap(yazilimci, miktar);
                    } else {
                        System.out.println("Gecersiz islem...");
                    }

                }

            }
        }

    }

}
