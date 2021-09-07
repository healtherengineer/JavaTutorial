
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarpmaException extends Exception
{

    @Override
    public void printStackTrace()
    {
        System.out.println("İki sayıda çok büyük sayılar Lütfen daha küçük sayılar deneyiniz...");
    }

}

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("--------------------------------------");
        System.out.println("Hesap Makinesine Hoş Geldiniz ...");
        System.out.println("--------------------------------------");

        String islemler = "1 - Toplama\n"
                + "2 - Çıkarma\n"
                + "3 - Çarpma\n"
                + "4 - Bölme";
        System.out.println(islemler);
        Scanner scanner = new Scanner(System.in);
        System.out.println("işlem giriniz : ");
        int islem = scanner.nextInt();

        int result;

        int n1, n2;

        try
        {
            switch (islem)
            {
                case 1:
                    System.out.println("Birinci sayiyi giriniz  : ");
                    n1 = scanner.nextInt();
                    System.out.println("İkinci sayiyi giriniz   : ");
                    n2 = scanner.nextInt();
                    result = n1 + n2;
                    System.out.println("Girilen sayıların toplamı = " + result);
                    break;
                case 2:
                    System.out.println("Birinci sayiyi giriniz  : ");
                    n1 = scanner.nextInt();
                    System.out.println("İkinci sayiyi giriniz   : ");
                    n2 = scanner.nextInt();
                    result = n1 - n2;
                    System.out.println("Girilen sayıların farkları = " + result);
                    break;
                case 3:
                    System.out.println("Birinci sayiyi giriniz  : ");
                    n1 = scanner.nextInt();
                    System.out.println("İkinci sayiyi giriniz   : ");
                    n2 = scanner.nextInt();
                    if (n1 > 10000 && n2 > 10000)
                    {
                        throw new CarpmaException();
                    }
                    result = n1 * n2;
                    System.out.println("Girilen sayıların çarpımları = " + result);
                    break;
                case 4:
                    System.out.println("Birinci sayiyi giriniz  : ");
                    n1 = scanner.nextInt();
                    System.out.println("İkinci sayiyi giriniz   : ");
                    n2 = scanner.nextInt();
                    result = n1 / n2;
                    System.out.println("Girilen sayıların bölüm'ü = " + result);
                    break;
                default:
                    System.out.println("Geçersiz işlem girildi ... ");

                    break;

            }
        } catch (ArithmeticException ex)
        {
            System.out.println("Bir sayi 0'a bölünemez...");
        } catch (InputMismatchException ex)
        {
            System.out.println("Lütfen Inputları doğru formatta giriniz...");
        } catch (CarpmaException ex)
        {
            ex.printStackTrace();
        }

    }

}
