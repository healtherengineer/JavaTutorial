package obsdeneme;

import java.util.Scanner;

public class LoginObs {

    public boolean control(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz : ");
        String tempNick = scanner.nextLine();
        System.out.println("Parolanizi giriniz : ");
        String tempPassword = scanner.nextLine();

        if (user.getKullanici_adi().equalsIgnoreCase(tempNick) && user.getKullanici_adi().equalsIgnoreCase(tempPassword)) {

            return true;

        } else {

            return false;
        }

    }

}
