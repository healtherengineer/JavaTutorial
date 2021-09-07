
package testobs;

import java.util.ArrayList;
import java.util.Scanner;

public class deneme
{
    Scanner scanner = new Scanner(System.in);
    private String isim ;
    private String parola;
    ArrayList<String> muzikler=new ArrayList<>();
      public deneme(String isim, String parola)
    {
        this.isim = isim;
        this.parola = parola;
    }
      public void muzikEkle(String parca)
      {
      
          muzikler.add(parca);
      }
      public void muzikyaz(deneme denek,int indx)
      {
          for(int i = 0 ; i<denek.get(indx).muzikler)
      }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getParola()
    {
        return parola;
    }

    public void setParola(String parola)
    {
        this.parola = parola;
    }

  
    

    
}
