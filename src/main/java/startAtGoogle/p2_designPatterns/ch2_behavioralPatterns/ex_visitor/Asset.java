package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.ex_visitor;

import com.google.gson.Gson;

public class Asset implements CommonInterface{
    private int serialNum;
    private String owner;
    private double rating;

    public Asset(int serialNum, String owner, double rating) {
        this.serialNum = serialNum;
        this.owner = owner;
        this.rating = rating;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        System.out.println("convert asset");

        Gson gson = new Gson();
        String str = gson.toJson(this);
        System.out.println(str);
    }
}
