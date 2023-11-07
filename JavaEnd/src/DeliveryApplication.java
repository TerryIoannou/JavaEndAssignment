import java.util.Scanner;

/**
 * The DeliveryApplication class is responsible for running the delivery application.
 */
public class DeliveryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate a Depot
        Depot depot = new Depot();

        // Add postmen, packages, and letters to the depot (you can customize these values)
        Postman postman1 = new Postman("John Doe", 30, 80);
        Postman postman2 = new Postman("Jane Smith", 25, 70);

        Package package1 = new Package(2);
        Package package2 = new Package(3);
        Package letter1 = new Package(0.002); // 2 grams

        depot.addPostman(postman1);
        depot.addPostman(postman2);
        depot.addPackage(package1);
        depot.addPackage(package2);
        depot.addLetter(letter1);

        // Track deliveries
        depot.trackDeliveries();

        // Close scanner
        scanner.close();
    }
}
