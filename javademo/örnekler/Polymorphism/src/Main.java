public class Main {
    public static void main(String[] args) {
        //JAVA da metodlar küçük harfle yazılır.
/*
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger()};
        for (BaseLogger logger : loggers) {
            logger.Log("Log mesajı");
        }

 */
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();

    }
}