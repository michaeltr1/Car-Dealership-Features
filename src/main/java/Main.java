import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("===== CAR DEALERSHIP =====");
        Scanner read = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Find vehicles by price range");
        System.out.println("2. Find vehicles by make/model");
        System.out.println("3. Find vehicles by year range");
        System.out.println("4. Find vehicles by color");
        System.out.println("5. Find vehicles by mileage range");
        System.out.println("6. Find vehicles by type");
        System.out.println("7. List all vehicles");
        System.out.println("8. Add a vehicle");
        System.out.println("9. Remove a vehicle");
        System.out.println("99. Quit");
        System.out.println("Enter your choice: ");
        int choice = read.nextInt();

        switch (choice) {

            case 1 -> System.out.println("Find vehicles by price range");

            case 2 -> System.out.println("Find vehicles by make/model");

            case 3 -> System.out.println("Find vehicles by year range");

            case 4 -> System.out.println("Find vehicles by color");

            case 5 -> System.out.println("Find vehicles by mileage range");

            case 6 -> System.out.println("Find vehicles by type");

            case 7 -> System.out.println("List all vehicles");

            case 8 -> System.out.println("Add a vehicle");

            case 9 -> System.out.println("Remove a vehicle");

            case 99 -> System.out.println("Goodbye!");

            default -> System.out.println("Invalid choice. Try again.");
        }
        while(choice !=99);
        System.out.println("Thank you for visiting the website!");

    }
}
