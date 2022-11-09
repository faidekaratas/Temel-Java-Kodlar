public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        //buraya iş kodları yazılır.
        customerDal.add();
    }
}
