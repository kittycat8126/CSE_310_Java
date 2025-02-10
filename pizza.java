import java.util.Scanner;

class Order {
    private int finalPrice = 0;
    private boolean cokeAdded = false;
    private boolean cheeseAdded = false;

    Order(Scanner scanner) {
        System.out.println("Enter the size of pizza: ");
        System.out.println("Enter 1 for Regular, 2 for Medium, 3 for Large");

        int size = scanner.nextInt();
        scanner.nextLine(); 

        if (size == 1) {
            finalPrice += 100;
        } else if (size == 2) {
            finalPrice += 200;
        } else if (size == 3) {
            finalPrice += 300;
        } else {
            System.out.println("Invalid size, defaulting to Regular.");
            finalPrice += 100;
        }

        addCheese(scanner);
        addCoke(scanner);
        display();
    }

    private void addCheese(Scanner scanner) {
        System.out.println("Do you want extra cheese? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            finalPrice += 50;
            cheeseAdded = true;
            System.out.println("Extra cheese added.");
        } else {
            System.out.println("No extra cheese added.");
        }
    }

    private void addCoke(Scanner scanner) {
        System.out.println("Do you want a Coke? (yes/no)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            finalPrice += 50;
            cokeAdded = true;
            System.out.println("Coke added.");
        } else {
            System.out.println("No Coke added.");
        }
    }

    private void display() {
        System.out.println("\nOrder Summary:");
        System.out.println("Total Price: " + finalPrice);
        if (cheeseAdded) {
            System.out.println("Extra cheese added.");
        }
        if (cokeAdded) {
            System.out.println("Coke added.");
        }
        System.out.println("Thank you for ordering!");
    }
}

public class pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Order(scanner);
        scanner.close();
    }
}
