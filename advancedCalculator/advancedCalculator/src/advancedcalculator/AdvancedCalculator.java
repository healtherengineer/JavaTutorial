package advancedcalculator;

import java.util.Scanner;

public class AdvancedCalculator {

    public static double toplama(double... args) {
        double sum = 0;
        for (double x : args) {
            sum += x;
        }
        return sum;
    }

    public static double cıkarma(double start,double... args) {
        double sum = start;
        for (double x : args) {
            sum -= x;
        }
        return sum;
    }

    public static double carpma(double... args) {
        double sum = 1;
        for (double x : args) {
            sum *= x;
        }
        return sum;
    }

    public static double dynamicDivision(double start, double... n) {
        double result = start;
        for (double i : n) {
            if (i != 0 && result != 0) {
                result = result / i;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1;

        String mesaj = "Toplama için 1'ebasiniz\n"
                + "Cıkarma icin 2 ' e basiniz\n"
                + "Carpma icin 3 'e basiniz \n"
                + "Bolme icin 4'e basiniz "
                + "Cıkmak için q' a basiniz ";

        double n2;

        while (true) {
            System.out.println(mesaj);
            System.out.println("Islem  seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Sistemden Çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("1. sayiyi giriniz : ");
                n1 = scanner.nextDouble();
                System.out.println("2. sayiyi giriniz : ");
                n2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(toplama(n1, n2));
            } else if (islem.equals("2")) {
                System.out.println("1. sayiyi giriniz : ");
                n1 = scanner.nextDouble();
                scanner.nextLine(); // dummy

                System.out.println("2. sayiyi giriniz : ");
                n2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(cıkarma(n1, n2));
            } else if (islem.equals("3")) {
                System.out.println("1. sayiyi giriniz : ");
                n1 = scanner.nextDouble();
                scanner.nextLine(); // dummy

                System.out.println("2. sayiyi giriniz : ");
                n2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(carpma(n1, n2));
            } else if (islem.equals("4")) {
                System.out.println("1. sayiyi giriniz : ");
                n1 = scanner.nextDouble();
                scanner.nextLine(); // dummy

                System.out.println("2. sayiyi giriniz : ");
                n2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(dynamicDivision(n1, n2));
            } else {
                System.out.println("Geçersiz işlem sectiniz...");
            }
        }

    }

}
