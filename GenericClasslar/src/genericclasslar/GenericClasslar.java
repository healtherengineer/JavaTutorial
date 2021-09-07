package genericclasslar;

import java.util.ArrayList;

public class GenericClasslar
{

    public static void main(String[] args)
    {
       

        Character[] char_dizi =
        {
            'J', 'A', 'V', 'A'
        };
        String[] string_dizi =
        {
            "Türev", "Limit", "Integral"
        };

        Integer[] int_dizi =
        {
            1, 2, 4, 2, 4, 12
        };

        Ogrenci[] ogrenci_dizi =
        {
            new Ogrenci("Mustafa Zaimoglu"), new Ogrenci("Büşra Gülnişah Ertekin"), new Ogrenci("Ege Barışan")
        };
// bunlara generic class denir 
        YazdirSinifi<Character> yazdir_char = new YazdirSinifi<Character>();
        YazdirSinifi<String> yazdir_string = new YazdirSinifi<String>();
        YazdirSinifi<Integer> yazdir_int = new YazdirSinifi<Integer>();
        YazdirSinifi<Ogrenci> yazdir_ogrenci = new YazdirSinifi<Ogrenci>();
        // 4 class taki her biri 10 satırdan 40 satırın yapacağı işlemi 4 tane referans oluşturma işlemi halletti
        

        yazdir_char.yazdir(char_dizi);
        System.out.println("----------------------------------");
        yazdir_string.yazdir(string_dizi);
        System.out.println("----------------------------------");
        yazdir_int.yazdir(int_dizi);
        System.out.println("----------------------------------");
        yazdir_ogrenci.yazdir(ogrenci_dizi);

    }
}
