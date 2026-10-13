package workingWithGenerics;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, String> checkNumber = n ->
                n > 0 ? "Положительное число" : (n < 0 ? "Отрицательное число" : "Ноль");


        System.out.println(checkNumber.apply(10));
        System.out.println(checkNumber.apply(-7));
        System.out.println(checkNumber.apply(0));
    }
}