package PrintCenter;

public class Magazine implements Printable {
    private String title;

    public Magazine() {
        this.title = "";
    }

    public Magazine(String title) {
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
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Magazines:");
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).getTitle());
            }
        }
    }
}
