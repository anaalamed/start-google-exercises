package startAtGoogle.p1_javaBestPracties.ch8_reflections;


public class Player {

    private int id;
    private int grade;

    public Player(int id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString( ) {
        return "Player{" +
                "id: " + this.id +
                ", grade: " + this.grade +
                "}\n";
    }

}




