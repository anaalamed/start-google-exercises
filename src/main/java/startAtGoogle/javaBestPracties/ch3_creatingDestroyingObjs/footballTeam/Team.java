package startAtGoogle.javaBestPracties.ch3_creatingDestroyingObjs.footballTeam;

import java.io.*;
import java.util.*;

import static java.lang.System.out;
import static startAtGoogle.javaBestPracties.ch3_creatingDestroyingObjs.footballTeam.Player.getRandomGrade;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    private Team(String name, ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public static Team createTeam(String name, HashMap<String, Integer> positions) {
        try {
            ArrayList<Player> players = new ArrayList<>();
            ArrayList<Integer> jerseyArr = getUniqueJerseyNumberArr(11);        // get the shuffled array of numbers for the unique jersey number
            NameGenerator names1 = new NameGenerator("names1");              // for constructor

            for (Map.Entry<String, Integer> position : positions.entrySet()) {        // position: Attack=2
                for (int i = 0; i < position.getValue(); i++) {                       // loop for every position
//                Player newPlayer = new Player(names1.getRandomNameFromBank(), jerseyArr.get(0), getRandomGrade(), position.getKey());   // constructor
                    Player newPlayer = Player.createNewPlayerByPosition(jerseyArr.get(0), position.getKey());         // static factory methods
                    players.add(newPlayer);
                    jerseyArr.remove(0);                                         // the player get the first number from the arr and then first number is removed
                }
            }
            return new Team(name, players);
        } catch (Exception ex) {
            out.println("createTeam exception -> " + ex);
            return null;
        }
    }

    public static ArrayList<Integer> getUniqueJerseyNumberArr(int length) {
        // get shuffled arr: {1, 2, 3, ... length}
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            numbers.add(i+1);               // start from 1
        }

        Collections.shuffle(numbers);
        return numbers;
    }

    public void printTeam() {
        out.println("\nTeam name: " + this.getName() );
        out.println("Team players: " );
        for (Player player: this.getPlayers()) {
            out.print(player.toString());
        }
    }

    public void writeToFile(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            out.println("\nwriting to file... ");

            oos.writeObject("the team name:" + this.name +"\n" + "the players: \n");

            for (Player player: this.getPlayers()) {
                oos.writeObject(player.toString());
            }

            out.println("Successfully wrote to the file.");
        } catch (FileNotFoundException ex) {
           out.println("error ->, " + ex);
        } catch (IOException ex) {
            out.println("error ->, " + ex);
        }
    }

}