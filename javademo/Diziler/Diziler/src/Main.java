public class Main {
    public static void main(String[] args) {

        //Array
        String [] ogrenciler= new String[5];
        ogrenciler[0]="Aylin";
        ogrenciler[1]="Yelda";
        ogrenciler[2]="Zeynep";
        ogrenciler[3]="Bora";
        ogrenciler[4]="Tuğra";

        //String[] ogrenciler={"Aylin","Yelda","Zeynep",...}

        for( int i=0; i<ogrenciler.length; i++){
            System.out.print(" - "+ ogrenciler[i]);
        }
        System.out.println("*************************");
        for(String ogrenci:ogrenciler){
            System.out.print(" - "+ ogrenci);
        }
System.out.println("***********************");

        //Example
        double[] myList={1.2,1.3,6.4,4.3,5.6};
        double total=0;
        double max=myList[0];
        for (double list:myList){
            total=total+list;
            if(max<list){
                max=list;
            }
        }
        System.out.println("Toplam: "+ total);
        System.out.println("En büyük: " + max);

        //Çok Boyutlu Diziler
        String[][] sehirler= new String[3][3];
        sehirler[0][0]="Giresun";
        sehirler[0][1]="Ordu";
        sehirler[0][2]="Samsun";
        sehirler[1][0]="Kayseri";
        sehirler[1][1]="Ankara";
        sehirler[1][2]="Yozgat";
        sehirler[2][0]="İstanbul";
        sehirler[2][1]="İzmir";
        sehirler[2][2]="Kocaeli";

        for(int i=0;i<=2;i++){
            System.out.println("-------");
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}