package beyblade;

import java.util.Scanner;

public class ProgramBeyblade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Beyblade Programina Hos geldiniz ...");
        System.out.println("***************************************");

        while (true) {
             System.out.println("Cikis yapmak icin q'ya Basiniz . ");
            System.out.print("Uretmek istediginiz Beyblade'i Giriniz : ");
            String islem = scanner.nextLine();
            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programimizi tercih ettiğiniz icin Tessekur ederiz ...\nProgramdan Cikiliyor...");
                break; // oldugu döngüden veya switch bloğundan çıkar!!!.

            } else {
                BeybladeFabrikasi uretici = new BeybladeFabrikasi(); // beybladefabrikasındaki beyblade yapı kullanmak için bir 
                                                                    //uretici referansı kullanıyoruz

                Beyblade beyblade = uretici.beybladeYap(islem);
                // burda da return new Beyblade("something") diye birşey döndürp nesne oluşturuyoruz 
                // ve aşşağıda o Beyblade nesnesinin methodlarıyla bilgi veriyoruz.
                // bu else de aslında beyblade cinin ismini cismini alıp nesne de üretebilirdik. Tam istediğin gibi.
                if (beyblade == null) {
                    System.out.println("Gecerli bir beyblade giriniz ...");
                } else {
                    beyblade.bilgiVer();
                    beyblade.saldiri();
                    beyblade.kutsalCanavarıCıkart();
                }
            }
        }

    }

}
