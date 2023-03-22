package question1;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to display Dishes.");
            System.out.println("Press 2 to search Dish.");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayDishes();
                    break;
                case 2:
                    searchDish();
                    break;
                default:
                    System.out.println("Invalid option. Try again!");
                    break;
            }

            System.out.println("Press 1 to continue or any other key to exit.");
            int choice = scanner.nextInt();
            if (choice != 1) {
                break;
            }
        }
    }

    private static void displayDishes() {
        for (Dish dish : Menu.menuList) {
            System.out.println(dish);
        }
    }

    private static void searchDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Dish ID: ");
        int dishID = scanner.nextInt();

        for (Dish dish : Menu.menuList) {
            if (dish.getDishID() == dishID) {
                System.out.println(dish);
                return;
            }
        }

        System.out.println("Dish not found!");
    }
}
