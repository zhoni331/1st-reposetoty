import java.security.Provider;

public class Application {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("Application started");

        new Service().performAction();
        new Controller().handleRequest();

        logger1.log("Application finished");
    }
}
class Service{
    public void performAction(){
        logger logger1 = logger.getInstance();
        logger1.log("Service action performed");
    }
}
class Controller{
    public void handleRequest(){
        logger logger1 = logger.getInstance();
        logger1.log("Controller handling request");
    }
}