
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru
{

    public static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir()
    {
        System.out.println("0- Islemleri tekrar göster...");
        System.out.println("1- Bir sonraki sehire git...");
        System.out.println("2- Bir önceki sehire git...");
        System.out.println("3- Uygulamadan çık...");

    }

    public static void sehirleri_turla(LinkedList sehirler)
    {
        ListIterator<String> iterator = sehirler.listIterator();

        int islem;
        boolean cikis = false;
        boolean ileri = true;
        //ileri == true ise ilerlenmis ileri == false ise bir önceki adımda geri gidilmiş bilgisini tutsun kontrol edelim diye.
        while (!cikis)
        {
            System.out.println("Islem seciniz : ");
            if (!iterator.hasNext())
            {
                System.out.println("Herhangi bir sehir bulunmuyor! (Son Sehirdeyiz)...");
            }
            islem = scanner.nextInt();

            switch (islem)
            {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (!ileri)
                    {
                        if (iterator.hasNext())
                        {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext())
                    {
                        System.out.println("Sehir'e ilerleniyor : " + iterator.next());

                    }
                    else
                    {
                        System.out.println("Gidilecek sehir kalmadi...");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri)
                    {
                        if (iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        ileri = false;

                    }
                    if (iterator.hasPrevious())
                    {
                        System.out.println("Sehir'e degistiriliyor : " + iterator.previous());

                    }
                    else
                    {
                        System.out.println("Sehir turu Basladi...");
                        ileri =false;
                    }

                    break;
                case 3:
                    System.out.println("Uygulama Terk ediliyor...");
                    cikis = true;
                    break;
                default:
                    System.out.println("Yanlis bir islem girdiniz ...");

            }
        }

    }

    public static void main(String[] args)
    {

        LinkedList<String> sehirler = new LinkedList<String>();

        islemleri_bastir();
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("AfyonKarahisar");

        sehirleri_turla(sehirler);

    }

}
