public class BaseCrediManager {
    public double hesapla(double tutar){
        return tutar*1.18;
    }
    /*Bu fonksiyonun override olmasını engellemek için
    public final double hesapla(double tutar){
        return tutar*1.18;
    } şeklinde yazabilirz.
     */
}
