
public class Test {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap = new Hesap("EgeBarisan01", " 12345", 500);

        atm.calis(hesap);

    }

}
