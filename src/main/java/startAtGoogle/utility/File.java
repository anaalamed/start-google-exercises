package startAtGoogle.utility;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {

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
}
