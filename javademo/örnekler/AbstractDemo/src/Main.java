public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
//Yukarıdaki kodda cus.manager istediği databasemanager ı çağırabilir. Yukarıda oracle ı çağırdık.
        customerManager.getCustomer();
    }
}