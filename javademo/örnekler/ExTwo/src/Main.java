public class Main {
    public static void main(String[] args) {
        /*
        //Kalın ve ince sesli harf bulma
        char harf='O';
        switch (harf){
            case('A'):
            case('I'):
            case('O'):
            case('U'):
                System.out.println("Kalın sesli harf!");
                break;
            default:
                System.out.println("İnce sesli harf!");
        }
         */

        /*
        // Bir sayının mükemmel sayı olup olmadığını bulma 6=>1,2,3 ve 28=>1,2,4,7,14 mükemmel sayılardır
        int number=5;
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("Mükemmel sayı!!!");
        }else
            System.out.println("Mükemmel sayı değildir!!!");

         */

        //Arkadaş sayıları bulma
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }
        for (int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                toplam2=toplam2+j;
            }
        }
        if(toplam1==sayi2 || toplam2==sayi1){
            System.out.println("Arkadaş sayılardır");
        }else
            System.out.println("Arkadaş sayı değiller!!");
    }
}