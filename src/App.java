public class App {
    public static void main(String[] args) throws Exception {
        StaticFactoryMethod name = StaticFactoryMethod.createName("João Gustavo");
        StaticFactoryMethod logger = StaticFactoryMethod.createLoggingMethod("João Gustavoooo");
        name.setName("Douglas");
        System.out.println(name);
        System.out.println(logger);
    }
}
