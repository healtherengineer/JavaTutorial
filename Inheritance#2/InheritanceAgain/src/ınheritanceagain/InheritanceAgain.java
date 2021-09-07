package ınheritanceagain;

import java.util.Scanner;

public class InheritanceAgain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conductor yonetici1 = new Conductor("Ege BARISAN", 2600, "SoftWare", 10);
        //yonetici1.giveInfo();
        yonetici1.changeDepartment();
        System.out.println("Yeni eleman eklemek ister misiniz : ");
        String islem = scanner.nextLine();
          Adder ekle = new Adder();
        if(islem.equalsIgnoreCase("Evet"))
        {
            Staff calısan = ekle.addStaff();
           calısan.giveInfo();
        }
        else
        {
            System.out.println("Programdan çıkılıyor teşşekkürler");
        }

      
    }

}
