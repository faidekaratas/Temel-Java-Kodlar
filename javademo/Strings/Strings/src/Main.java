import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
/*
        //Mesajın toplam eleman sayısı
        System.out.println("Toplam eleman sayısı: "+mesaj.length());
        //5. elemanı getiren kod satırı
        System.out.println("5. elemanı: "+ mesaj.charAt(4));
        //Mesajı başka bir stringle birleştirme
        System.out.println(mesaj.concat(" Yaşasın!"));
        //Başlangıç harfinin true false kontrolü
        System.out.println("Cümle B harfiyle başlıyor: "+ mesaj.startsWith("B"));
        //Bitiş harfinin kontrolü
        System.out.println("Cümle l harfiyle bitiyor: "+ mesaj.endsWith("l"));
        //Cümleden istenilen karakterleri getirme
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        //Belirtilen karakterlerin kaçıncı indekste olduğunu bulma
        System.out.println(mesaj.indexOf("av"));
        //Belirtilen karakterlerin sondan kaçıncı indekste olduğunu bulma
        System.out.println(mesaj.lastIndexOf("a"));
 */
        //Karakter değiştirme
        String yeniMesaj= mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //Belirtilen indexten itibaren kullanma Örneğin 2 den 5. indexe kadar
        System.out.println(mesaj.substring(2,5));
        //Split ile kelimeleri ayırma
        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }
        //Cümleyi küçük harfe ve büyük harfe çevirme
        String kucuk= mesaj.toLowerCase();
        String buyuk=mesaj.toUpperCase();
        System.out.println(kucuk);
        System.out.println(buyuk);
        // Trim fonksiyonu cümlenin başındaki ve sonundaki boşlukları kaldırır.
        System.out.println(mesaj.trim());
    }
}