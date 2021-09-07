
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        int total = 0;

        System.out.println("Bankamızı tercih ettiğiniz için Teşekkürler");
        System.out.println("********************************************");

        System.out.println("Kullanıcı Paneli ");
        System.out.println("********************************************");
        int girisHakkı = 3;
        while (true) {
            if (login.control(hesap)) {
                System.out.println("Giris basarılı...");
                break;
            } else {
                girisHakkı--;
                System.out.println("Giris Basarısız. kalan giris hakkınız : " + girisHakkı);
            }
            if (girisHakkı == 0) {
                return;
            }

        }

        while (true) {
            String islemler = "Islemler : \n"
                    + "Hesap bilgisi için 1'e basınız\n"
                    + "Para yatırmak için 2 'e basınız\n "
                    + "Para çekmek için 3 'e basınız \n"
                    + "Çıkmak için q ' ya basınız\n ";

            System.out.println(islemler);
            System.out.print("Islem seciniz : ");

            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor . Yeniden bekleriz....");
                break;
            } else if (islem.equals("1")) {
                hesap.bilgiVer();
            } else if (islem.equals("2")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
                int miktar;
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                miktar = scanner.nextInt();
                scanner.nextLine(); //int ten sonra string alacaksan o Dummy kullanılacak!
                hesap.paraYatir(miktar);
            } else if (islem.equals("3")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
                int miktar;
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                miktar = scanner.nextInt();
                scanner.nextLine();// dummy
                if (miktar > 1500) {
                    System.out.println("Bir gün içerisinde 1500 tl den fazla para çekemezsiniz "
                            + "Herşey sizin güvenliğiniz için...");
                } else {
                    total = total + miktar;
                    if (total < 1501) {
                        hesap.paraCek(miktar);
                    } else {
                        System.out.println("Total de 1500 tl ye ulaştınız daha fazla nakit para çekmek için "
                                + "En yakın şubemize bekleriz .");
                    }
                }

            } else {
                System.out.println("Geçersiz işlem ...");
                break;
            }

        }

    }

}
