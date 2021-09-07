
public class Main
{
    public static void main(String[] args)
    {
        FinalTest o1 = new FinalTest("OBJE 1");
        FinalTest o2 = new FinalTest("OBJE 2");
        
        
        System.out.println(o1.objeSayisi);
        System.out.println(o2.objeSayisi);
        
        
        System.out.println("Database ismi : " + DataBase.databaseIsmi);
        DataBase d1 = new DataBase();
        System.out.println(d1.databaseIsmi); 

        
    }
    
}
