package idmanprogrami;

import java.util.Scanner;

public class IdmanProgrami {

    public static void main(String[] args) {
        String preinfo = "İdmanlar ;\n "
                + "Burbee \n"
                + "PushUp \n"
                + "SitUp(mekik)\n"
                + "Squat\n";

        System.out.println(preinfo);
 
        System.out.println("Hadi bir Idman oluşturalım . \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hedef burbee sayısını giriniz :");
        int burbee = scanner.nextInt();
        System.out.println("Hedef PushUp sayısını giriniz :");
        int pushUp = scanner.nextInt();
        System.out.println("Hedef SitUp sayısını giriniz  :");
        int sitUp = scanner.nextInt();
        System.out.println("Hedef Squat sayısını giriniz  :");
        int squat = scanner.nextInt();
        Idman myCourse = new Idman(sitUp, pushUp, squat, burbee);
        // nesne oluşturmadan sen nereye kullanıyorsun acaba o değeri; 

        scanner.nextLine();
        // eğer bu dummy i kullanmazsan aşşağıda ki line a \n yi yolluyor.
        System.out.println("İdmanınız başlıyor...\n"
                + "Geçerli idman isimleri : "
                + "Burbee\nPushup\nSitup\nSquat");

        while (myCourse.ıdmanBittiMi() == false) {
            System.out.print("Hareket secelim(burbee,pushUp,sitUp,squat) : ");
            String tur = scanner.nextLine();

            System.out.print("Bu hareketten kaç tane yapacaksınız : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            myCourse.HareketYap(tur, sayi);

        }
        System.out.println("Idmanınız tamamlanmıstır :) ");
    }

}
