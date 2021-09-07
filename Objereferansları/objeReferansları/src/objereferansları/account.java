
package objereferansları;


public class account {
    
       private String hesapNo;
    private String isim;
    private double bakiye;
    
    private String email;
    private String telefon;

    
    public account()
    {
        System.out.println("My first constructors ....");
    }
    // overloading de yapcam şimdi arada
    public account(String isim,double bakiye,String email,String telefon)
    {
        this.bakiye=bakiye;
        this.email =email;
        this.isim = isim;
        this.telefon = telefon;
        
    }
    
    public void bilgiVer()
    {
        System.out.println("Isminiz      : " + this.getIsim());
        System.out.println("Bakiyeniz    :  " +this.getBakiye());
        System.out.println("Emailiniz    : " + this.getEmail());
        System.out.println("Telefonunuz  : " + this.getTelefon());
        System.out.println("Hesap No     : " + this.getHesapNo());
    }
    public void paraCek(double miktar)
    {
        if(miktar >1500)
        {
            System.out.println("Bir gün içerisinde 1500 tl den fazla para çekemezsiniz..."); 
        }
        else
        {
                if(bakiye - miktar < 0 )
        {
            System.out.println("Yeterli bakiyeniz bulunmamaktadır...");
        }
        else
        {
            bakiye -=miktar;
            System.out.println("Güncel Bakiyeniz : " + bakiye);
        }
        }
    
    }
    public void paraYatir(double miktar)
    {
        bakiye +=miktar;
        System.out.println("Güncel bakiyeniz : " +bakiye);
        
    }
    public String getHesapNo() {
        return telefon.substring(0, 3)+ email.substring(0,5) ;
    }

    /**
     * @param hesapNo the hesapNo to set
     */


    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
}
