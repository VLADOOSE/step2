package step4.Statics.Config;

public class Config {
    private static String configVersion;
    static {
        configVersion = "v1.0.0";
    }
    public static void displayConfig(){
        System.out.println(configVersion);
    }
}
