public class ProductManager {
    public void add(Product product) {
        /*JDBC:Java DataBase Connectivity, Java programlama dilinde yazılmış
        uygulamaların veritabanı ile etkileşime girmesini sağlayan bir uygulama programlama arayüzüdür.*/
        System.out.println("Ürün eklendi" + product.get_name());
    }
}
