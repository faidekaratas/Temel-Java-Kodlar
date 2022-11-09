public class Main {
    public static void main(String[] args) {

        int ogrSayisi= 20;
        String mesaj= "Öğrenci Sayısı: ";
        System.out.println( mesaj + ogrSayisi);

        //Conditionals
        int sayi= 60;
        if(sayi<50){
            System.out.println("Sayı 50'den küçüktür.");
        }
        else if(sayi==50){
            System.out.println("Sayı 50'ye eşit.");
        }
        else{
            System.out.println("Sayı 50'den büyüktür.");
        }

        //Recap Demo1
        int sayi1=20;
        int sayi2=15;
        int sayi3=30;
        int enbuyuk= sayi1;

        if(enbuyuk<sayi2){
            enbuyuk= sayi2;
        }
        if(enbuyuk<sayi3){
            enbuyuk=sayi3;
        }
        System.out.println("En büyük: " + enbuyuk);

        //Switch case
        char grade='B';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break; //yazılmazsa bütün durumları yazdırır.
            case 'B':
                System.out.println("Çok iyi: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default: //Yukarıdaki şartların dışındaki durumda kullanılır
                System.out.println("Geçersiz not girdinizz");        }


        //Loop
        //for
        for( int i=0; i<=20; i+=2){
            System.out.println("Döngü: " + i);
        }
        System.out.println("for döngüsü bitti!");
        //while
        int i=0;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti!");
        //do-while döngü çalışmasa bile do ya girer
        int k=0;
        do{
            System.out.println(k);
            k+=2;
        }while(k<10);
            System.out.println("Do-while döngüsü bitti!");
    }
}