public class CustomerManager {
    //Customer Manager ın istenilen database den veri getirmesini istiyoruz.Bunun için;
    BaseDatabaseManager baseDatabaseManager;
    public void getCustomer(){
        baseDatabaseManager.getData();
    }
}
