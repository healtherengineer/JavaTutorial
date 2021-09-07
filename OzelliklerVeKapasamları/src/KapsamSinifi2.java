
public class KapsamSinifi2
{

    private int privateDegisken = 30;

    public KapsamSinifi2()
    {

    }
    public void dahiliSinifKontrol(){
        DahiliSinif d = new DahiliSinif();
        System.out.println("Kontrol ediliyor..." + d.a);
        d.onileCarp(); // ayrıca method larına da erişebilir
    }

    public class DahiliSinif
    {

        int privateDegisken = 20;

        private int a = 5;
        public void onileCarp()
        {
               int privateDegisken =10; //unutma en local değişken the localest variable 

            for (int i = 1; i < 6; i++)
            {

                System.out.println(i + " * " + privateDegisken + " = " + (privateDegisken * i));
            }
        }
    }

}
