package fruits;

public class FruitStore {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple(1.5),
                new Apple(2.0),
                new Pear(0.8),
                new Pear(1.2),
                new Plum(0.5),
                new Plum(1.0)
        };

        double totalPrice = 0.0;
        double applesPrice = 0.0;
        double pearsPrice = 0.0;
        double plumsPrice = 0.0;

        for (Fruit fruit : fruits) {
            double price = fruit.returnPrice();
            totalPrice += price;

            if (fruit instanceof Apple) {
                applesPrice += price;
            } else if (fruit instanceof Pear) {
                pearsPrice += price;
            } else if (fruit instanceof Plum) {
                plumsPrice += price;
            }
        }

        System.out.print("Производитель: ");
        fruits[0].printManufacturerInfo();

        System.out.printf("Общая стоимость яблок: %.2f руб.%n", applesPrice);
        System.out.printf("Общая стоимость груш:  %.2f руб.%n", pearsPrice);
        System.out.printf("Общая стоимость слив:  %.2f руб.%n", plumsPrice);
        System.out.println("-------------------------------------");
        System.out.printf("ИТОГО общая стоимость: %.2f руб.%n", totalPrice);
    }
}