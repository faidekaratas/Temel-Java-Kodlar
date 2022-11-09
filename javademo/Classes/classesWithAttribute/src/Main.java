public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.set_id(17);
        product.set_name("Laptop");
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(5);
        product.set_renk("mor");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürün id: "+ product.get_id());
        System.out.println("Ürün kodu: "+ product.get_kod());

    }
}