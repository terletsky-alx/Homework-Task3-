package PrintCenter;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("War and Peace"),
                new Magazine("Forbes"),
                new Book("Java Basics"),
                new Magazine("Vogue")
        };

        System.out.println("-- print() for all --");
        for (Printable p : printables) {
            p.print();
        }

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
