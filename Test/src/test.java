
public class test
{

    public static void main(String[] args)
    {
        bisiklet bisiklet1 = new bisiklet();
        Araba araba1 = new Araba();

        bisiklet1.bilgi_hiz();
        System.out.println("****************");
        bisiklet1.hiz_arttir(10);
        System.out.println("****************");

        bisiklet1.bilgi_hiz();

    }

}
