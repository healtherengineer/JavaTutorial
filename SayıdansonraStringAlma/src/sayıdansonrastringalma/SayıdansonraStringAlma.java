/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayıdansonrastringalma;

import java.util.Scanner;

/**
 *
 * @author egeba
 */
public class SayıdansonraStringAlma {

    
    public static void main(String[] args) {
      
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Lütfen yasinizi giriniz : ");
        
        int yas=scanner.nextInt();// yaşimizi girdikten sonraki enter a basmamızı \n olarak algılıyor ve 
       
        //isim değişkenine onu koyuor.
        
        scanner.nextLine(); // Dummy bir string koyarsak halolur
      
        
        System.out.println("İsminizi giriniz : ");
        
        String isim=scanner.nextLine(); 
      
       System.out.println("İsminiz : " +isim);
         
        System.out.println("Yasiniz : " +yas);
        
        
        // ama ister seniz ismi önce alıp yasi sonra alsanızda birşey farketmez
        
    }
    
}
