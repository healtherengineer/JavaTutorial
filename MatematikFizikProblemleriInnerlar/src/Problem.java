
public class Problem
{

    public static class Matematik
    {

        public static void daireAlan(int yaricap)
        {

            System.out.println("Daire'nin Alani : " + (yaricap * yaricap * Math.PI));

        }

        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3)
        {
            System.out.println("Ucgenin cevresi : " + (kenar1 + kenar2 + kenar3));

        }

    }

    public static class Fizik
    {
        public static void icCarpim(Vec vec1,Vec vec2){
            
            int iccarpım = vec1.getI() *vec2.getI() + vec1.getJ() * vec2.getJ() + vec2.getK() *vec1.getK();
            
            System.out.println(vec1.getIsim() +" ile "+ vec2.getIsim() + "'nin iç çarpımı  "+ iccarpım);
            
        }
    }
}
