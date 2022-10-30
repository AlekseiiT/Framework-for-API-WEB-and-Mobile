import Utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;

public class Main {
    public static void main(String[] args) {
        FrameworkConfig propertyConfig = ConfigFactory.create(FrameworkConfig.class);

        System.out.println(propertyConfig.browser());
        System.out.println(propertyConfig.tools());
    }
}
