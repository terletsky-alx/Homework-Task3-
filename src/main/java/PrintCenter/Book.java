package PrintCenter;

public class Book implements Printable {
    private String title;

    public Book() {
        this.title = "";
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Books:");
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println(((Book) p).getTitle());
            }
        }
    }
}
