package workingWithGenerics;

import java.util.ArrayList;

public class SimpleQueue<T> {
    private final ArrayList<T> list = new ArrayList<>();
    private final int limit;

    public SimpleQueue(int limit) {
        this.limit = limit;
    }

    public void set(T item) {
        if (list.size() >= limit) {
            throw new RuntimeException("The queue is overcrowded.");
        }
        list.add(item);
    }

    public T get() {
        if (list.isEmpty()) {
            throw new RuntimeException("The queue is empty");
        }
        return list.remove(0);
    }

    public static void main(String[] args) {
        SimpleQueue<String> strQueue = new SimpleQueue<>(2);
        strQueue.set("Hello");
        strQueue.set("Java");
        String text = strQueue.get();
        System.out.println(text);

        SimpleQueue<Object> anyQueue = new SimpleQueue<>(2);
        anyQueue.set(67);
        anyQueue.set("Some text");
        System.out.println(anyQueue.get());
        System.out.println(anyQueue.get());
    }
}