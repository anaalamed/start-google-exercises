package startAtGoogle.javaBestPracties.ch2_generalProgramming.footballTeam;

import java.util.*;

public class Player {
//    enum Position {Goal_Keeper, Defender, Midfielder, Attacker}

    private String name;
private int id;
private int grade;
private String position;
//private Position position;

    public Player(String name, int id, int grade, String position) {
//    public Player(String name, int id, int grade, Position position) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.position = position;
    }

    private static void printPlayer(Player player) {
        System.out.println("id: " + player.id + ", name: "+ player.name + ", grade: " + player.grade + ", position: " + player.position );
    }

    private static String getRandomName() {
        Collection<String> realNames = Arrays.asList("James", "John", "Robert", "Michael","William","David","Richard","Charles","Joseph","Thomas","Christopher","Daniel","Paul","Mark","Donald","George","Kenneth","Steven","Edward","Brian","Ronald","Anthony","Kevin","Jason","Matthew","Gary","Timothy","Jose","Larry","Jeffrey","Frank","Scott","Eric","Stephen","Andrew","Raymond","Gregory","Joshua","Jerry","Dennis","Walter","Patrick","Peter","Harold","Douglas","Henry","Carl","Arthur","Ryan","Roger","Joe","Juan","Jack","Albert","Jonathan","Justin","Terry","Gerald","Keith","Samuel","Willie","Ralph","Lawrence","Nicholas","Roy","Benjamin","Bruce","Brandon","Adam","Harry","Fred","Wayne","Billy","Steve","Louis","Jeremy","Aaron","Randy","Howard","Eugene","Carlos","Russell","Bobby","Victor","Martin","Ernest","Phillip","Todd","Jesse","Craig","Alan","Shawn","Clarence","Sean","Philip","Chris","Johnny","Earl","Jimmy","Antonio","Danny","Bryan","Tony","Luis","Mike","Stanley","Leonard","Nathan","Dale","Manuel","Rodney","Curtis","Norman","Allen","Marvin","Vincent","Glenn","Jeffery","Travis","Jeff","Chad","Jacob","Lee","Melvin","Alfred","Kyle","Francis","Bradley","Jesus","Herbert","Frederick","Ray","Joel","Edwin","Don","Eddie","Ricky","Troy","Randall","Barry","Alexander","Bernard","Mario","Leroy","Francisco","Marcus","Micheal","Theodore","Clifford","Miguel","Oscar","Jay","Jim","Tom","Calvin","Alex","Jon","Ronnie","Bill","Lloyd","Tommy","Leon","Derek","Warren","Darrell","Jerome","Floyd","Leo","Alvin","Tim","Wesley","Gordon","Dean","Greg","Jorge","Dustin","Pedro","Derrick","Dan","Lewis","Zachary","Corey","Herman","Maurice","Vernon","Roberto","Clyde","Glen","Hector","Shane","Ricardo","Sam","Rick","Lester","Brent","Ramon","Charlie","Tyler","Gilbert","Gene","Marc","Reginald","Ruben","Brett","Angel","Nathaniel","Rafael","Leslie","Julio","Kelly","Kurt","Allan","Nelson","Guy","Clayton","Hugh","Max","Dwayne","Dwight","Armando","Felix","Jimmie","Everett","Jordan","Ian","Wallace","Ken","Bob","Jaime","Casey","Alfredo","Alberto","Dave","Ivan","Johnnie","Sidney","Byron","Julian","Isaac","Morris","Clifton","Willard","Daryl","Ross","Virgil","Andy","Marshall","Salvador","Perry","Kirk","Sergio","Marion","Tracy","Seth");
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(realNames.toArray().length-1);
        String randomName = realNames.toArray()[randomIndex].toString();
        return randomName;
    }

    static int uniqueId = 1;
    static int getUniqueId() {
        return uniqueId++;
    }

    private static int getRandomGrade() {
        Random rnd = new Random();
        int randomGrade = rnd.nextInt(9) +1;
        return randomGrade;
    }

    private static String getRandomPosition(List positions) {
//        System.out.println(positions.size());

        Random rnd = new Random();
        int randomIndexPosition = rnd.nextInt(positions.size());
        String randomPosition = positions.get(randomIndexPosition).toString();
//        System.out.println(randomPosition);
        positions.remove(randomIndexPosition);

        return randomPosition;
    }

    private static String addRandomPosition() {
        String[] positions  = {"Defender", "Midfielder", "Attacker"};
        Random rnd = new Random();
        int randomIndexPosition = rnd.nextInt(2);
        String randomPosition = positions[randomIndexPosition];
        return randomPosition;
    }

    private static List buildPostionsArray() {
        List<String> teamPositions = new ArrayList<>(List.of("Goal Keeper", "Defender", "Defender", "Midfielder", "Midfielder", "Attacker", "Attacker"));

        for (int i = 0; i < 4; i++) {
            String randomPosition = addRandomPosition();
//            System.out.println( randomPosition);
            teamPositions.add(randomPosition);
        }

        return teamPositions;
    }

    static int a, b = 0;
    private static List createTeam(int length, List positions) {
        List<Player> players = new ArrayList<>();

        for (int i = 1; i <= length ; i++) {
            players.add( new Player(getRandomName(), getUniqueId(), getRandomGrade(), getRandomPosition(positions)));
        }
        return players;
    }

    public static void main(String[] args) {
        List teamPositions = buildPostionsArray();
        System.out.println( teamPositions);

        List<Player> players = createTeam(11, teamPositions);
        for (Player player: players ) {
            printPlayer(player);
        }


//        getRandomPosition(teamPositions);
//        getRandomPosition(teamPositions);

    }
}




