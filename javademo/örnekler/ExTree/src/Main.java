public class Main {
    public static void main(String[] args) {
        //Verilen dizide istenilenilen sayıyı bulma
        int[] sayilar= new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak=10;
        boolean varMiyokMu= false;
        for (int sayi: sayilar){
            if(aranacak==sayi){
                varMiyokMu=true;
                break;
            }
        }
        if(varMiyokMu){ //bu ifade varMiyokMu=true ifadesidir.
            System.out.println("Mevcut: "+ varMiyokMu);
        } else System.out.println("Mevcut değil: "+ varMiyokMu);

    }
}