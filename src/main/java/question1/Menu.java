package question1;
import java.util.ArrayList;

public class Menu {
    static ArrayList<Dish> menuList = new ArrayList<>();

    static {
        menuList.add(new Dish(1, "Pizza", "15 mins"));
        menuList.add(new Dish(2, "Burger", "20 mins"));
        menuList.add(new Dish(3, "Pasta", "30 mins"));
    }
}
