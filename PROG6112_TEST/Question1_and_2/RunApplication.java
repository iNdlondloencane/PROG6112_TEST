import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else {
            consoleType = "SWITCH";
        }

        System.out.print("Enter the store: ");
        String store = input.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();
    }
}
