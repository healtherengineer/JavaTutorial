
public class Main
{

   public static  void m()
    {
        int data = 50 / 0;
        
 
    }

   public static  void n()
    {
        try{
        m();
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
        
    }

   public static void p()
    {
       
            n();
            System.out.println("p ikinci defa çalıştı çünkü stack de ki methodları çıkartırken  n de hata handle edildi....");
            //sıralanışları
            //m
            //n ---> burda hata handle edildi ve artık diğer parçacıklar rahatca çalışabilir eğer edilmeseydi çalışmazdi
            //p
            //main
        
    }

    public static void main(String[] args)
    {
        p();
        
    }

}
