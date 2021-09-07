
public class Main
{
    public static void main(String[] args)
    {
        int vize = 85;
        int fnl = -1;
        double ort = vize*0.4 + fnl*0.6;
        
        if(vize>100 ||  fnl >100 || vize<0 || fnl<0){
                        System.out.println("vize veya final notu 100 den büyük olamaz !!!");
                        System.out.println("vize veya final 0 dan küçük olamaz !!!");

        }
        else
        {
            System.out.println("Girdiğiniz değerler doğru Notunuz ve mesajınız Aşağıdadır...");
        if(ort==100){
            System.out.println("Tebrikler çanı kırdınız. " +"ortalamanız : " + ort);
        }
        else if(ort >= 55 && ort < 100){
            System.out.println("İnsan gibi geçtiniz..." + "ortalamanız : " + ort);
            
        }
        else if(ort < 55){
            System.out.println("Geçmiş olsun ailene selamlar ayıkla pirincin taşını kaldınız."+"ortalamanız : " + ort);
        }
        else{
            System.out.println("Lütfen geçerli bir vize veya final notu giriniz");
            
        }
        }
     
        
        
        
        
        
    
        
//     if(koşul1){
//         
//     }
//     else if(koşul2){
//         
//     }
//     else {
//         
//     }
        
        
    }
}
