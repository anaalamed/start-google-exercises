package startAtGoogle.javaBestPracties.ch10_exceptions;


import com.google.gson.Gson;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private HashMap<String, String> map;

    public Configuration() {
//        this.map = new HashMap<>();                    // not initialized for the task 2
    }

    public Map<String, String> getMap() {
        if ( map == null) {
            throw new NullPointerException("the configuration map is not initialized!");
        }
        return map;
    }

    public String getValueOfKey(String key) {
        if (map.get(key) != null) {
            return map.get(key);
        }
        throw new IllegalArgumentException("the key...");
    }

    public void readFromFile(String filename) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(filename)) {

            // Convert JSON File to HashMap
            map = gson.fromJson(reader, HashMap.class);

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException ex: "+ e);
//            writeToFile("src/main/java/startAtGoogle/ch10_exceptions/defaultConfig.json");

            map = new HashMap<>();
            map.put("id", "1");
            map.put("name", "coolName");
            map.put("version", "2.0");
            String defaultConfig = gson.toJson(map);
            writeJsonToFile("src/main/java/startAtGoogle/ch10_exceptions/defaultConfig.json", map.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static void writeToFile(String filename, String  content) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  static void writeJsonToFile(String filename, String  content) {
        Gson gson = new Gson();
        writeToFile(filename, gson.toJson(content));
    }

//    public void writeToFile(String fileName) {
//        System.out.println("writing to default file... ");
//        Gson gson = new Gson();
//
//        try (FileOutputStream fos = new FileOutputStream(fileName);
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//
//            map = new HashMap<>();
//            map.put("id", "1");
//            map.put("name", "coolName");
//            map.put("version", "2.0");
//
//            String defaultConfig = gson.toJson(map);
//            oos.writeObject(defaultConfig);
//
//            System.out.println("Successfully wrote to the file.");
//        } catch (FileNotFoundException ex) {
//            System.out.println("FileNotFoundException ex: "+ ex);
//        } catch (IOException ex) {
//            System.out.println("IOException ex: "+ ex);
//        }
//    }

}
