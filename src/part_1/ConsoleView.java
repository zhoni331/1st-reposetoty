package part_1;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String gatherInput() {
        System.out.print("Enter new data: ");
        return scanner.nextLine();
    }

    public String gatherAppendInput() {
        System.out.print("Enter additional data to append: ");
        return scanner.nextLine();
    }
}
