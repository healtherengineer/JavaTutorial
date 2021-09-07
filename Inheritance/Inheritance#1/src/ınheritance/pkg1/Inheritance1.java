package ınheritance.pkg1;

public class Inheritance1 {

    public static void main(String[] args) {

        Yonetici yonetici1 = new Yonetici("Ege BARISAN", 6550, "IT Yöneticisi", 2);
        yonetici1.bilgiVer();
        System.out.println("******-----*********-***********");
        System.out.println("global degerli maasınız : " + yonetici1.getMaas());
        yonetici1.zamYap(500);
        System.out.println("güncellenen global değerli maasınız : " + yonetici1.getMaas());
    }

}
