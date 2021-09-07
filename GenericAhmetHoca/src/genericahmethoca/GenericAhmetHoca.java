/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericahmethoca;

import java.util.ArrayList;

/**
 *
 * @author egeba
 */
class Ogrenci<T, V>
{

    String ad;
    T no;  // generic tanımladım
    // herşey no ya gelebilir
    V digerBilgiler;

    public Ogrenci()
    {

    }

    public Ogrenci(String ad, T no)
    {

        this.ad = ad;
        this.no = no;

    }

    public void setNo(T no)
    {
        this.no = no;

    }

    public T getno()
    {
        return no;
    }

    public void goster()
    {

        System.out.println("Ogrenci ADı : " + ad);
        System.out.println("OGrenci no  : " + no);

    }

}

//Key-Value Pair (anahtar -değer)
interface IPair<K,V>{
    public K getKey();
    public V getValue();
    
    
    
    
}
class Pair<K, V> implements IPair
{

    private K key;
    private V value;

    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public void setKey(K key)
    {
        this.key = key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

}

public class GenericAhmetHoca
{

    //generic oldu
    public static <T> void yazdir(T s)
    {

        System.out.println(s);
    }

    public static void main(String[] args)
    {
        
        
        //her öğrenciye 1 ıd bir ogrenci nesnesi verebilirim
        Pair<Integer,String> ay = new Pair<Integer,String>(1,"OCAK");
                Pair<Integer,String> ay2 = new Pair<Integer,String>(2,"ŞUBAT");
                Pair<Integer,Ogrenci> dugum  = new Pair<Integer,Ogrenci>(3,new Ogrenci());
                int key = dugum.getKey();
                Ogrenci deger = dugum.getValue();
                
                
                

                
        
        
        
//        Ogrenci<Integer, String> ogr = new Ogrenci<>();
//        ogr.setNo(156);  // artık T = Integer olur
//
//        ogr.ad = "Ege";
//        ogr.goster();
//        ogr.digerBilgiler = "ASD";
//        System.out.println("---------------------------");
//        Ogrenci<String, Integer> ogr2 = new Ogrenci<>();
//        ogr2.setNo("K123");
//        ogr2.ad = "Mustafa";
//        ogr2.goster();
//        ogr2.digerBilgiler = 1;

//        
//        GenericAhmetHoca test = new GenericAhmetHoca();
//        test.yazdir("mERHABA");
//        test.yazdir(0); // yapamayız 
        // Generic le yaparız ama
//        yazdir(test);
//        ArrayList liste = new ArrayList();
//        liste.add("Algoritma");
//        liste.add(10);
//        liste.add(true);
//        
//        // tip Dönüştürme Casting
//        
//        String s = (String) liste.get(0);
//        // hata oluşur runtime de
//        
//        
//        //<> generic tip
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Nesne"); // artık eklenecek ifade String olacak
//        
//        
//        ArrayList<Integer> liste2 = new ArrayList<>();
//        
//     ArrayList<ogrenci> ogrList = new ArrayList<>();
//        ogrenci ogr1 = new ogrenci();
//     
//        ogrList.add(ogr1);
//        
//      ogrList.add(new ogrenci());
//      
//        generix tipinin faydaları ;
//        1. kod kolaylığı sağlar/optimizasyonu
//        2.Tip Güvenliği
//        3.Type castinge gerek kalmıyor...
    }

}
