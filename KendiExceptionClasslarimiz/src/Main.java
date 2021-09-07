
import java.util.Scanner;

public class Main
{

    public static void mekanGiris(int yas) throws InvalidAgeExcepiton
    {
        // eğer checked bir exception ise throws anahtar kelimesini eklerim
        if (yas < 18)
        {
            throw new InvalidAgeExcepiton("Yaş 18'den küçük olamaz.");
        }
        else
        {
            System.out.println("Mekana Hoş geldiniz...");
        }
    }

    public static void main(String[] args) throws InvalidAgeExcepiton
    {
        // api olarak kullanacak olanlar olursa kendileri invalidAge exceptionu yazsınlar diye mainde yazdık
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        mekanGiris(yas);
       /* try{
            mekanGiris(yas);
        }
        catch(InvalidAgeExcepiton e){
           // System.out.println(e); // Constructor daki mesaj gelir
           // System.out.println("Bir hata oluştu"); // yakalarız 
            e.printStackTrace(); // override ettiğimiz metoddaki işlemler olur.
        }
               */
        

    }

}
