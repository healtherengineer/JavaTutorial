package magazaprojesi;

public class MagazaProjesi
{

    public static void main(String[] args)
    {
        Calisan[] staffs = new Calisan[7];
        staffs[0] = new Mudur("Furkan", " Kartal");
        ((Mudur) staffs[0]).setAylikSatis(37000); // staffs nesnesini mudure convertledim
        staffs[1] = new Tezgahtar("Okan", "Yesil");
        ((Tezgahtar) staffs[1]).setSatis(15000);
        staffs[2] = new Tezgahtar("Burcu", "Segmen");
        ((Tezgahtar) staffs[2]).setSatis(27000);
        staffs[3] = new IdariPersonel("Ayse", "Demir");
        staffs[4] = new IdariPersonel("Mehmet", "Celik");
        staffs[5] = new Hizmetli("Ali", "Kaya");
        ((Hizmetli) staffs[5]).setMesaiSaati(60);
        staffs[6] = new Hizmetli("Ahmet", "Ates");
        ((Hizmetli) staffs[6]).setMesaiSaati(84);
        System.out.println("Calisanlarin maasi : ");

        for (int i = 0; i < staffs.length; i++)
        {
            staffs[i].bilgiVer();
            System.out.println("*******************************");
        }
    }

}
