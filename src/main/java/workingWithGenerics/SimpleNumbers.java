package workingWithGenerics;

public class SimpleNumbers<T extends Number, U extends Number> {
    private T first;
    private U second;

    public SimpleNumbers(T first, U second){
        this.first = first;
        this.second = second;
    }

    public SimpleNumbers(){}

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    public static boolean compareArrays(Number[] array1, Number[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].doubleValue() != array2[i].doubleValue()) {
                return false;
            }
        }
        return true;
    }

    public static double[] findMinMax(Number[] array){
        double min = array[0].doubleValue();
        double max = array[0].doubleValue();

        for (Number num : array) {
            double val = num.doubleValue();
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new double[]{min, max};
    }

    public static void main(String[] args) {
        SimpleNumbers<Integer, Double> numbers = new SimpleNumbers<>(10, 4.5);
        System.out.println("Сумма: " + numbers.sum());

        Integer[] ints = {1, 2, 3};
        Double[] doubles = {1.0, 23.0, 3.0};
        System.out.println("Массивы равны: " + compareArrays(ints, doubles));


        double[] minMax = findMinMax(doubles);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
    }

}
