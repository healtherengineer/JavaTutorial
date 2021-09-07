
import java.util.Scanner;


public class Main
{
    public static void girisKontrol(int yas){
        
        if(yas<18){
            throw new ArithmeticException();
            
        }
        else
        {
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
    public static void main(String[] args)
    {
        //Giriş kontrol diye bir method yapalım 
        //18 den küçük olunca bir hata mesajı vermek yerine artık dahagüzel
        // kodlarımızı yazabilmek için kendi exceptionlarımızı yakalayıp fırlatalım
        // let's do that...
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        try{
                    girisKontrol(yas);

        }
        catch(ArithmeticException e){
            System.out.println("18 yaşından küçükler mekana giremez...");
        }
        
        
    }
    
}
