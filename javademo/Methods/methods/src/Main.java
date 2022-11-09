public class Main {
    //metod isimleri camelcase yazılır.
    //classlar pascalcase yazılır.
    public static void main(String[] args) {
        String mesaj = sehirGetir(); //sehirGetir fonksiyonu string olduğu için hata vermez.
        int topla = topla(4, 5);//topla int olduğu için hata vermez.
        System.out.println(mesaj);
        System.out.println(topla);
        int total = topla2(1, 2, 3, 4, 5);
        System.out.println(total);
    }

    public static void ekle() {

    }

    public static void sil() {

    }

    public static void guncelle() {

    }

    //return fonksiyon oluşturma;
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirGetir() {
        return "İstanbul";
    }

    //Bir fonksiyona birden fazla parametre gönderilmesi;
    //Aşağıdaki örnekte birden çok parametre gönderilerek toplama işlemi yapılır.
    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}