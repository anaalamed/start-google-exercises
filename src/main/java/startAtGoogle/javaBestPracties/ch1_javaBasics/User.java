package startAtGoogle.javaBestPracties.ch1_javaBasics;

import java.util.*;

public class User {
    private String name;
    private int id;
    private boolean isActivated;

    public User(String name, int id, boolean isActivated) {
        this.name = name;
        this.id = id;
        this.isActivated = isActivated;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }



    // ---------- extra functions to move ---------------
    public static String generateRandomStr(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public static boolean generateRandomBoolean() {
        Random rd = new Random(); // creating Random object
        boolean generatedBoolean = rd.nextBoolean();
        return generatedBoolean;
    }



    // ----------  functions ---------------
    private static void printUser(User user) {
        System.out.println("id: " + user.id + ", name: "+ user.name + ", isActivated: " + user.isActivated );
    }

    public static List createUsers( int length) {
        System.out.println("creating list of "+length+" users\n");

        List<User> users = new ArrayList<>(); // declare users arrayList

        for (int i = 1; i <= length ; i++) {
            users.add( new User(generateRandomStr(6), i, generateRandomBoolean()));
        }
        return users;
    }

    public static User findUserById( List<User> users, int id) {
        for (User user: users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    public static int countActivatedUsers( List<User> users) {
        int count = 0;
        for (User user: users) {
            if (user.isActivated == true) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println("start main\n");

        // create random users
        List<User> users = createUsers(10);

        // create hashMap
        Map<Integer, User> usersById = new HashMap<>();
        for (User user:users) {
            usersById.put(user.getId(), user);
        }


        // print users list
        System.out.println("print the list of users:");
        for (User user: users ) {
            printUser(user);
        }

//        findUserById
        int id = 10;
        System.out.println("\nfindUserById: "+ id);           // List
        User userFoundById = findUserById(users, id);
        System.out.print("List: ");
        printUser(userFoundById);

        User userFoundByIdArrHashMap = usersById.get(id);     // HashMap
        System.out.print("HashMap: ");
        printUser(userFoundByIdArrHashMap);

//        countActivatedUsers
        int countActivated = countActivatedUsers(users);
        System.out.println("\ncountActivatedUsers: " + countActivated);
    }
}
