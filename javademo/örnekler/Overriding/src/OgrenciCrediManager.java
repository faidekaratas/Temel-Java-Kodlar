public class OgrenciCrediManager extends BaseCrediManager{
    /* Öğrenci için hesaplama oranının farklı olmasını istedik bu durumda BaseCrediManager da
    yazdığımız fonksiyonun aynısını öğrenciye yazıp oranı değiştirebiliriz buna override denir.
     */
    public double hesapla(double tutar){
        return tutar*1.10;
    }
}
