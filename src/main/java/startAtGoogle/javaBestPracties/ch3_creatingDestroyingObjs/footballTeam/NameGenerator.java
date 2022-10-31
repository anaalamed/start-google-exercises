package startAtGoogle.javaBestPracties.ch3_creatingDestroyingObjs.footballTeam;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class NameGenerator {
    private String nameBank;

    public NameGenerator(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getRandomNameFromBank() {
        try {
            String sourse;
            if (this.nameBank == "names1") {
                sourse = "src/main/java/startAtGoogle/utility/namesBank/names1.txt";
            } else {
                sourse = "src/main/java/startAtGoogle/utility/namesBank/names2.txt";
            }

            ArrayList<String> names = getNamesFromFile(sourse);

            Random rnd = new Random();
            int randomIndex = rnd.nextInt(names.toArray().length);
            String randomName = names.toArray()[randomIndex].toString();
            return randomName;
        } catch (Exception ex) {
            System.out.println("getRandomNameFromBank exception -> " + ex);
        }
        return null;
    }

    public ArrayList<String> getNamesFromFile(String filename) throws FileNotFoundException {
        try (FileInputStream fin = new FileInputStream(filename);
             BufferedReader r = new BufferedReader( new InputStreamReader(fin, StandardCharsets.UTF_8))) {

            String str = null;
            ArrayList<String> namesBank = new ArrayList<>();
            while ((str = r.readLine()) != null) {
                namesBank.add(str);
            }

            return namesBank;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}