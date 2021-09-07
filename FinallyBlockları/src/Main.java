
public class Main
{
    public static void main(String[] args)
    {
        
        
        // Finally blocks ;
        //** Mutlaka çalışması gerken kodlarımızı yazarız...
        //birden çok catch bloğu olabilir ama sadece 1 tane finally bloğumuz olabilir.
        // exception handle lansa da handle lanmasada finally bloğu çalışır
        // eğer exception handle lanmassa finally bloğundan sonra Program durur.
        //eğer exception handle lanırsa handle layan catch bloğu , finally bloğu ve kodun geri kalanı çalışır...
        try{
            String s1 = "Ege Barışan";// NullPointerException
            s1.hashCode();
            int a = 25;
            System.out.println(0/0); // arithmetich exception
        }
        catch(ArithmeticException e ){
            e.printStackTrace();
            System.out.println("Aritmetik exception firlatıldı...");
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer exception fırlatıldı...");
        }
        finally{
            System.out.println("Finally bloğumuz calışıyor...");
        }
        System.out.println("Rest of the code ...");
        
       
    }
    
}
