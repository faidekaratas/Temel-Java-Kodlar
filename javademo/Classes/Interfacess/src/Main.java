public class Main {
    public static void main(String[] args) {
        //bir class birden fazla intarface kullanabilir.
        //interfaceler; arayüz,iş,veri erişim katmanları arasındaki iletişimi sağlar.
        //ICustomerDal iCustomerDal = new OracleCustomerDal();
        CustomerManager customerManager=new CustomerManager(new  OracleCustomerDal());
        customerManager.add();
    }
}