package ınheritance.pkg1;

public class Yonetici extends Calisan {
    // subclassımız
// ekstraözellikte ekleyebilirim

    private int sorumlu_kisi;

    public int getSorumlu_kisi() {
        return sorumlu_kisi;
    }

    public void setSorumlu_kisi(int sorumlu_kisi) {
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        /* this.isim = isim;
         this.maas = maas;
         this.departman = departman;*/
        // önce  super class ın constructorı çalışır !!!! yani recursive function gibi

        super(isim, maas, departman); // miras aldığımız classın constructorını çağırdık. private olduğundan dolaylı olarak eriştik.
        this.sorumlu_kisi = sorumlu_kisi;
        System.out.println("Yönetici constructorı çalıştı .");
        // System.out.println("Sorumlu oldugu kisi sayisi : "  + this.sorumlu_kisi);

    }

    //haydii OVERRIGING YAPALIMMMM!!!!!!!!!!!!!
// eğer biz miras aldığımız classın bir fonksiyonunu geliştirerek kullanmak istersek overriding yaparız
    // mesela öğretmenin verdiği dersler olur öğrencinin aldığı dersler olur
    // o zaman bilgileri gösterirken insan classından türeyen öğretmende verdiği dersler olacak
    // öğrencide ise aldığı dersler olacak ama ikisininde isimleri olacak . departmanları olacak.
    public void bilgiVer() {
        /* System.out.println("Isim : " + getIsim());
         System.out.println("Maas : " + getMaas());
         System.out.println("Departman : " + getDepartman());*/

        super.bilgiVer(); // daha sade ve güzel bir kullanım oldu bence . :)

        System.out.println("Sorumlu oldugu kisi sayisi : " + sorumlu_kisi);

        // sence de çok acemice değil mi şöyle de yapamaz mıydık
        //ihtiyacımız olan ekstradan 1 özellik var ve copy paste yerine 
        //super anhtar kelimesi ile çeksek daha iyi olmazmıydı ? 
    }
}
