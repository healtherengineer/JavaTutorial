
package com.ege.matematik;

public class Matematik implements IMatematik
{

    @Override
    public void toplama(int a, int b)
    {

        System.out.println("Toplama sonucu  : "  + (a+b));
    }

    @Override
    public void cıkarma(int a, int b)
    {
                System.out.println("Çıkarma sonucu  : "  + (a-b));

    }

    @Override
    public void carpma(int a, int b)
    {
        System.out.println("Çarpma sonucu  : "  + (a*b));
    }

    @Override
    public void bolme(int a, int b)
    {
        System.out.println("Bolme sonucu  : "  + ((double)a/b));
    }
    
}
