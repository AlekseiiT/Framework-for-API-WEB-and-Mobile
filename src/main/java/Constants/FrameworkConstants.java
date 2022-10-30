package Constants;

public class FrameworkConstants {

    private FrameworkConstants(){}

    private final static String RESOURCE_PATH = System.getProperty("user.dir");

    public static String getResourcePath(){
        return RESOURCE_PATH;
    }

}
