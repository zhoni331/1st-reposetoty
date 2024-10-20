package chain_of_responsability;


// Abstract Handler
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);
}

// Concrete Handler 1 - Junior Support
class JuniorPizzaJola extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("simple")) {
            System.out.println("Junior PizzaJola: I can handle this simple issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("Junior PizzaJola: No one available to handle this issue.");
        }
    }
}

// Concrete Handler 2 - Senior Support
class SeniorPizzaJola extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("intermediate")) {
            System.out.println("Senior PizzaJola: I can handle this intermediate issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("Senior PizzaJola: No one available to handle this issue.");
        }
    }
}

// Concrete Handler 3 - Technical Support
class TechPizzaJola extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("complex")) {
            System.out.println("Technical PizzaJola: I can handle this complex issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("Technical PizzaJola: No one available to handle this issue.");
        }
    }
}

// Client
public class COR {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler junior = new JuniorPizzaJola();
        SupportHandler senior = new SeniorPizzaJola();
        SupportHandler tech = new TechPizzaJola();

        // Create the chain of responsibility
        junior.setNextHandler(senior);
        senior.setNextHandler(tech);

        // Client sends different types of issues
        System.out.println("Sending a simple pizza order...");
        junior.handleRequest("simple"); // Handled by Junior PizzaJola

        System.out.println("\nSending an intermediate pizza order...");
        junior.handleRequest("intermediate"); // Handled by Senior PizzaJola

        System.out.println("\nSending a complex pizza order...");
        junior.handleRequest("complex"); // Handled by Technical PizzaJola

        System.out.println("\nSending an unknown pizza order...");
        junior.handleRequest("unknown"); // No handler available
    }
}
