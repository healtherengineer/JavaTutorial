package obsdeneme;

import java.util.Scanner;

public class Adder {

    Scanner scanner = new Scanner(System.in);

    public Ogrenci ekleOgrenci() {
        System.out.println("Departmanini giriniz: ");
        String departman = scanner.nextLine();

        System.out.println("Ogrencinin Kullanici adini giriniz : ");
        String Isim = scanner.nextLine();
        System.out.println("Parolasini belirleyiniz  : ");
        String password = scanner.nextLine();

        return new Ogrenci(Isim, password, departman);
    }

    public Ogretmen ekleOgretmen() {
        System.out.println("Ogretmenin Departmanini giriniz: ");
        String departman = scanner.nextLine();

        System.out.println("Ogretmenin Kullanici adini giriniz : ");
        String Isim = scanner.nextLine();
        System.out.println("Parolasini belirleyiniz  : ");
        String password = scanner.nextLine();

        return new Ogretmen(Isim, password, departman);
    }

}
