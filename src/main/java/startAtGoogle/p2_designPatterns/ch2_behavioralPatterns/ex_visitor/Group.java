package startAtGoogle.p2_designPatterns.ch2_behavioralPatterns.ex_visitor;

import com.google.gson.Gson;

public class Group implements CommonInterface{
    private int id;
    private int size;

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        System.out.println("convert group");

        Gson gson = new Gson();
        String str = gson.toJson(this);
        System.out.println(str);
    }
}
