package JavaBeans;

public class JavaBeans {
    private String title;
    private String author;
    private String description;
    private int price;
    private int isbn;

    public JavaBeans() {}

    public void display() {
        System.out.println(title + ", " + author + ", " + description + ", "
        + price + ", " + isbn);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}

class RunApp {
    public static void main(String[] args) {
        JavaBeans bookShop = new JavaBeans();
        bookShop.setAuthor("JK Rowlings");
        bookShop.setPrice(79);
        bookShop.setTitle("Harry Potter and the idiots");
        bookShop.setDescription("Harry Potter runs with the idiots");
        bookShop.setIsbn(123123123);
        bookShop.display();
    }
}