public class CustomerManager {
    private BaseLogger baseLogger;
    //constructor
    public CustomerManager(BaseLogger logger){
        this.baseLogger=logger;
    }
public void Add(){
    System.out.println("Müşteri eklendi");
    this.baseLogger.Log("log mesajı");
}
}
