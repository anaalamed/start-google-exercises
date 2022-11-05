package startAtGoogle.p1_javaBestPracties.ch3_creatingDestroyingObjs.footballTeam;

import java.util.*;


public class Player {

    private String name;
    private int id;
    private int grade;
    private String position;

    public Player(String name, int id, int grade, String position) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.position = position;
    }


    @Override
    public String toString( ) {
        return "Player{" +
                "id: " + this.id +
                ", name: "+ this.name +
                ", grade: " + this.grade +
                ", position: " + this.position +
                "}\n";
    }

    public static int getRandomGrade() {
        Random rnd = new Random();
        int randomGrade = rnd.nextInt(9) + 1 ;     // 1-10
        return randomGrade;
    }

    // Static Factory Methods
    public static Player createNewPlayerByPosition( Integer id, String position ){
        try {

            // Dependency Injection
            NameGenerator names1 = new NameGenerator("names1");
            NameGenerator names2 = new NameGenerator("names2");
            switch (position) {
                case "GK":
                    return new Player(names2.getRandomNameFromBank(), id, getRandomGrade(), "GK");
                case "Defense":
                    return new Player(names2.getRandomNameFromBank(), id, getRandomGrade(), "Defense");
                case "Middlefiled":
                    return new Player(names1.getRandomNameFromBank(), id, getRandomGrade(), "Middlefiled");
                default:
                    return new Player(names1.getRandomNameFromBank(), id, getRandomGrade(), "Attacker");
            }
        } catch (Exception e) {
            System.out.println("createNewPlayerByPosition exception -> " + e);
            return null;
        }
    }

}




