
public class Main
{

    public static void main(String[] args)
    {

        /*   try
         {
         // part of the code
         }
         catch(Exception e)
         {
                    
         // the code that will being made instead of useless code
         e.printStackTrace();
                    
         } 
        
         Checked exception : Java tarafından öngörülebilen exception lardır... compile anında fark edilir 
         Unchecked exception : Java tarafından değil Programcı tarafından öngürlebilecek exception lardır . Runtime esnasında meydana gelir...
         Error: Hiç bir türlü tamir edilemeyen fixlenemeyen exception lardır ...
         Try-Catch blokları asla tek başlarına kullanılamaz kankilerdir...
        
        
         */
        try
        {
            int a = 20;
            System.out.println(a / 0); // ArithmetichException (divison by zero - / by zero);
            int[] b =
            {
                1, 2, 3, 4, 5
            };
            System.out.println(b[7]); // ArrayIndexOutofBoundsExceptşon 

        } catch (ArithmeticException e)
        {
            System.out.println("Bir sayi 0' ile bölünemez...");
            // e.printStackTrace(); // hata türünü söyler...
        }
        System.out.println("Kodun geri kalanı...");
        try
        {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e)
        {
            System.out.println("Null bir yeri gösteren bir değişkenle işlem yapmaya kalkıştınız...");
        }
        try
        {
            String message = "Fenerbahçe1907";
            int covertedint = Integer.parseInt(message); // parseint static bir method ki obje oluşturulmadan kullanıldı.

        } catch (NumberFormatException e)
        {
            //  e.printStackTrace();
            System.out.println("İnteger olamicak bir Stringi integer bir degere cevirmeye çalıştınız...");

        }
        // try-catch bloklarımızı özelden genele yazmalıyız ki kullanıcıya daha güzel mesajlar verebilmek için...
        try
        {
            String message1 = "Fenerbahçe1907";
            int covertedint1 = Integer.parseInt(message1); // parseint static bir method ki obje oluşturulmadan kullanıldı.

            int[] b1 =
            {
                1, 2, 3, 4, 5
            };
            System.out.println(b1[7]); // ArrayIndexOutofBoundsExceptşon 
            int a1 = 20;
            System.out.println(a1 / 0); // ArithmetichException (divison by zero - / by zero);

        } catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception fark edildi...");

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Dizi boyutunu aştınız...");

        } catch (Exception e)
        {
            System.out.println("Beklenmedik bir hata oluştu...");
        }
        System.out.println("Kodumuz catch bloklarını çok güzel kullanarak son çalışacak kod satırına inmeyi başardı...");
// Eğer özelen genele yazmassak en genel catch bloğumuzdan sonra ki catch ler Gereksiz olur!!!!....
        try
        {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e)
        {
            System.out.println("common task completed");
        }
   //catch(ArithmeticException e){System.out.println("task1 is completed");}    
        //catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
        System.out.println("rest of the code...");
    }

}


