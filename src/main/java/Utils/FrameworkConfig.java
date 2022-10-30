package Utils;

import org.aeonbits.owner.Config;

import java.util.ArrayList;

@Config.Sources(value="file:./src/test/resources/FrameworkConfig.properties")
public interface FrameworkConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    Long timeout();
    boolean isScreenshotNeeded();
    ArrayList<String> tools();

}
