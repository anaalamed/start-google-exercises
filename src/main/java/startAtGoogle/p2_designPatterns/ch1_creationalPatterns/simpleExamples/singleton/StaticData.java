package startAtGoogle.p2_designPatterns.ch1_creationalPatterns.simpleExamples.singleton;

import java.util.Arrays;
import java.util.List;

public class StaticData {
    private List<String> notes;
    private static StaticData instance;

    public static StaticData getInstance(){
        if(instance==null){
            instance = new StaticData();
        }
        return instance;
    }

    private StaticData(){
        notes = Arrays.asList("do","re","me","fa","sol","la","si");
    }

    public List<String> getNotes(int count){
        if(count>notes.size()-1){
            throw new IndexOutOfBoundsException();
        }
        return notes.subList(0,count-1);
    }
}