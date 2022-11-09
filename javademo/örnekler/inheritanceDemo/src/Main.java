public class Main {
    public static void main(String[] args) {

KrediUI krediUI=new KrediUI();
//BaseKrediManager tarim ve öğretmene miras verdiği için KrediUI dan ikisine de ulaşabiliriz.
krediUI.krediHesapla(new AskerKrediManager()); //Buna POLIMORFIZM denir.
    }
}