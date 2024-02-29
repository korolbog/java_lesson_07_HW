import java.util.ArrayList;
import java.util.List;
/**
 * Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
 * перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
 * соответствующий имени, объему и температуре.
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
 * воспроизвести логику заложенную в программе.
 */
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("coffee", 100, 100));
        productList.add(new HotDrink("coffee2", 200, 50));
        productList.add(new HotDrink("coffee2", 200, 75));
        productList.add(new BottleOfWater("baikal", 300, 1));
        productList.add(new BottleOfWater("baikal", 300, 3));
        productList.add(new BottleOfWater("rosinka", 400, 2));

        HotDrinkVendingMachine vendingMachine01 = new HotDrinkVendingMachine(productList);
        // если не найдено.
        System.out.println(vendingMachine01.getProduct("baikal1"));
        // поиск по имени.
        System.out.println(vendingMachine01.getProduct("baikal"));
        // поиск по объему.
        System.out.println(vendingMachine01.getProduct("baikal", 3, 99));
        // поиск по температуре.
        System.out.println(vendingMachine01.getProduct("coffee2", 4, 50));
    }
}
