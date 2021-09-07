package obsdeneme;

import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);
    private String kullanici_adi;
    private String parola;
    private String department;

    public User(String kullanici_adi, String parola, String department) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.department = department;
    }

    public void bilgiVer() {
        System.out.println("Kullanici  : " + this.kullanici_adi);
        System.out.println("Departmani : " + this.department);

    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

}
