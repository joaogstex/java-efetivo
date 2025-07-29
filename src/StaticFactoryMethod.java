import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaticFactoryMethod {
    private String name;
    private static final Logger LOGGER = Logger.getLogger(StaticFactoryMethod.class.getName());

    private StaticFactoryMethod(String name) {
         this.name = name;
    }

    // public static String createName(String name) {
    //     return new String(name);
    // }

    public static StaticFactoryMethod createName(String name) {
        return new StaticFactoryMethod(name);
    }

    public static StaticFactoryMethod createLoggingMethod(String name) {
        LOGGER.log(Level.INFO, "Criando nome de usuário em: {0}", LocalTime.now());
        return new StaticFactoryMethod(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + getName();
    }

}
