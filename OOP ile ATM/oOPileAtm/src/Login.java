
import java.util.Scanner;

public class Login {

    public boolean control(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);

        String password;
        String kullaniciAdi;

        System.out.print("Kullanıcı adı : ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("Parola      : ");
        password = scanner.nextLine();
        if (hesap.getKullanici_adi().equals(kullaniciAdi) && hesap.getParola().equals(password)) {
            return true;

        } else {
            System.out.println("Kullanici adi veya sifreniz yanlıştır. Tekrar deneyiniz...");
            return false;
        }

    }

}
