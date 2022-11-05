package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns;

import com.google.gson.Gson;

public class User implements CommonInterface {
    private int id;
    private String name;
    private String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        System.out.println("convert user");

        Gson gson = new Gson();
        String str = gson.toJson(this);
        System.out.println(str);
    }

}
