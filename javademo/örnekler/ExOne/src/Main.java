public class Main {
    public static void main(String[] args) {

        // Verilen sayının asal olup olmadığını bulma
        int number=1;
        //remainder=> kalan demek
        int remainder= number % 2;
        //isPrime=> asal demek
        boolean isPrime=true;
        //1 değeri girildiğinde ekrana sayı bir yazsın.
        //Bu kod satırından sonra aşağıdaki döngü de çalışır.
        //Döngünün çalışmaması için return eklemeliyiz.
        if(number==1){
            System.out.println("Sayı 1");
            return;
        }
        for (int i=2;i<=number; i++){
            if(number % i ==0){
                isPrime=false;
            }
        }
        System.out.println("Bu sayı asal mıdır: "+ isPrime);
    }
}