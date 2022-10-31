package startAtGoogle.javaBestPracties.ch3_creatingDestroyingObjs.footballTeam;

import java.util.*;

public class main {
    private static HashMap<String, Integer> strToHashmap(String str) {
        // enter positions data to hashmap
        HashMap<String, Integer> positionsMap = new HashMap<>();
        String[] positionsArr = str.split(",");                        // [1 - A,  4 - B, ... ]
        for (String positionStr: positionsArr) {                             // "1-A"
            String[] positionArr = positionStr.trim().split("-");      // [1, GK]
            positionsMap.put(positionArr[1].trim(), Integer.parseInt(positionArr[0].trim()));
        }
        return positionsMap;
    }

    public static void main(String[] args) {
        try {
            String positions = "1 - GK, 4 - Defense, 4 - Middlefiled, 2 - Attack";    // get the formation from the String
            HashMap<String, Integer> positionsMap = strToHashmap(positions);

            // create a team
            Team myTeam =  Team.createTeam("Ana's team", positionsMap);

            myTeam.printTeam();

            String fileName = "src/main/java/startAtGoogle/ch3_creatingDestroyingObjs/footballTeam/team.txt";
            myTeam.writeToFile(fileName);
        } catch(Exception ex) {
            System.out.println("exception ->" + ex);
        }
    }


}
