package startAtGoogle.javaBestPracties.ch10_exceptions;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();

//        1. read from config file. if there is no file - create default one
//        // right
//        String rightFileName = "src/main/java/startAtGoogle/ch10_exceptions/config.json";
//        config.readFromFile(rightFileName);
//        System.out.println("the config map is: " + config.getMap() + "\n");
//
        // wrong
        String wrongFileName = "src/main/java/startAtGoogle/ch10_exceptions/config1.txt";
        config.readFromFile(wrongFileName);
        System.out.println("the config map is: " + config.getMap());


        // 2 - Getting the config data when not initialized
        try {
            System.out.println( config.getMap());
        } catch (NullPointerException ex) {
            System.out.println("attention! the configuration map is not initialized");
        }


        // 3 - Requesting a config key that does not exist.
        try {
            String rightFileName = "src/main/java/startAtGoogle/ch10_exceptions/config.json";
            config.readFromFile(rightFileName);

            System.out.println(config.getMap().get("app"));          // exist
            System.out.println(config.getValueOfKey("aaa"));         // doesn't exist
        } catch(IllegalArgumentException ex) {
            System.out.println("attention! the key isn't exist");
        }


    }
}
