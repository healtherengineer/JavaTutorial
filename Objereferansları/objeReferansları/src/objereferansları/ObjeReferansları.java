/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objereferansları;


public class ObjeReferansları {

    
    public static void main(String[] args) {
        
       /* account hesap1 = new account("Ahmet Deveci", 15000.0, "ahmet.01@gmail.com ","12356989");

        account hesap2 = new account();
        hesap2=hesap1; // hesaap 2 artık hesap1 i gösteriyor
        //boyrun
        hesap2.bilgiVer();
               */
        
        // eğer tek satırlık işlemlerimiz varsa fonksiyona sadece
        // referans yollamak istersek
        new account("Sezaver BARISAN", 80000.0, "sezavercrazygirl.@gmail.com", "98756456").bilgiVer();
        // gördüğün gibi sıkıntı çıkmadı.
        
        
        
        
        
        
        
    }
    
}
