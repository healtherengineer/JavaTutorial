package ınheritanceagain;

import java.util.Scanner;

public class Adder {

    Scanner scanner = new Scanner(System.in);

    public Staff addStaff() {
        System.out.print("Yeni elemanin ismini giriniz : ");
        String isim = scanner.nextLine();
        System.out.print("Yeni elemanin departmanini giriniz : ");
        String depart = scanner.nextLine();
        System.out.print("Yeni elemanin maasini giriniz : ");
        int salar = scanner.nextInt();
        //  Staff nesne;
        return new Staff(isim, salar, depart);
        

    }
}
