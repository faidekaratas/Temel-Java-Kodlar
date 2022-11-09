public abstract class GameCalculator {
//abstract sınıflar new yapılamaz
    public abstract void hesapla(); /*Bu fonksiyon ilgili sınıflarda kullanılmak zorunda.
    Fakat her sınıf kendi hesaplama işlemini yapabilir.Yani hesapla fonksiyonu içerisindeki
    işlemler farklı olabilir. */

    /* Override edilebilir.
    public void hesapla(){
        System.out.println("Puanınız: 100");
    }
    */
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
