package TelescopingConstructor;

public class TelescopingConstructor {
    private final String productName;
    private final int price;
    private final String description;

    public TelescopingConstructor(String productName) {
        this(productName, 0, null);
    }

    public TelescopingConstructor(String productName, int price) {
        this(productName, price, null);
    }

    public TelescopingConstructor(String productName, int price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

class RunApp {
    public static void main(String[] args) {
        //Anti-pattern
        TelescopingConstructor tc = new TelescopingConstructor("TV");
        System.out.println(tc.getProductName() + ", " + tc.getPrice() + ", " + tc.getDescription());
        tc = new TelescopingConstructor("Table", 120);
        System.out.println(tc.getProductName() + ", " + tc.getPrice() + ", " + tc.getDescription());
        tc = new TelescopingConstructor("Microphone", 300, "You can talk");
        System.out.println(tc.getProductName() + ", " + tc.getPrice() + ", " + tc.getDescription());
    }
}
