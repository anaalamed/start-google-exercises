package startAtGoogle.p1_javaBestPracties.ch2_generalProgramming;
// with static factory methods

public class User {
    enum Country {ISRAEL, POLAND, GERMANY, UNITED_STATES}
    private String name;
    private String mail;
    private Country country;


    public User(String name, String mail, Country country) {
        this.name = name;
        this.mail = mail;
        this.country = country;
    }

    //    static factory methods
    public static User newIsraeliUser(String name, String email) {
        return new User(name, email, Country.ISRAEL);
    }

    public static User newUserWithRandomName(String email, Country country) {
//        return new User(randomString(), email, country);
        return new User("aaa", email, country);
    }

    public static User newUser(String name, String email, Country country) {
        return new User(name, email, country);
    }

    public static void main(String[] args) {

    }
}
