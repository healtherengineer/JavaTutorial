
package yurtdisipro;


public interface IEuVatandasi extends YurtDisiKurallari
{
    
    String hangi_birlik();
    boolean ulke_vize_kontrolu(String gidilecek_ulke);

}
