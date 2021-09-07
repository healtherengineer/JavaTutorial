
import java.util.Scanner;

public class Deneme
{

    public static void main(String[] args)
    {

        // önce dışardan değerimizi alıp bunları diziye dolduralım
        Scanner scanner = new Scanner(System.in);

        // girilen n sayısı
        System.out.println("N değerini girermisiniz : ");

        int n = scanner.nextInt();
        int okek = 1;
        for (int i = 1; i <= n; i++)
        {

            okek *= i;
        }
        int s = 0;
        int perform=0;
       
        for (int i = okek; i >= 1; i--)
        {
            for (int j = 1; j <= n; j++)
            {
                perform++;
                if (i % j != 0)
                {
                    j = n;

                }
                else
                {
                    s++;

                }
            }
            if (s == n)
            {
                if (okek > i)
                {
                    okek = i;

                }
            }
            s = 0;
        }
        System.out.println("okek :" + okek + "\nperformans  : " +perform);

    }

}
