package startAtGoogle.javaBestPracties.ch11_lambdasStreams.classes;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class Stock {
    private List<Item> items;

    public Stock() {
        this.items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "items=" + items +
                '}';
    }

    public void generateItem() {
        items.add(Item.newRandomItem());
        this.sortByExpirationDate();
    }

    public void generateItem(String name) {
//        items.add(new Item("test"));
        this.sortByExpirationDate();
    }

    public void generateItems(int length) {
        for (int i = 0; i < length; i++) {
            items.add(Item.newRandomItem());
        }
        this.sortByExpirationDate();
    }

    public void sortByExpirationDate() {
        Collections.sort(items, (o1, o2) -> o1.getExpirationDate().compareTo(o2.getExpirationDate()));
    }

    public List<Item> getExpiredItems() {
        return items.stream().filter(item -> item.getExpirationDate().compareTo(LocalDate.now()) < 0)
                .collect(Collectors.toList());
    }

    public Optional<Item> getClosestExpiryItem() {
        return items.stream().filter(item -> item.getExpirationDate().compareTo(LocalDate.now()) >= 0)
            .findFirst();
    }

    public List<Item> getSortedAlphabetically() {
        return items.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName())))
            .collect(Collectors.toList());
    }

    public Optional<Item> getItemByName(String name) {
        return items.stream().filter(item -> item.getName() ==  name)
                .findFirst();
    }

    public List<String> getListOfNamesAboveWeight(double weight) {
         return items.stream().filter(item -> item.getWeight() > weight)
                 .map(Item::getName)
                 .collect(Collectors.toList());
    }

    public Map<Type, Integer> getHashmapTypeCount() {
//    public HashMap<Type, Long> getHashmapTypeCount() {
        // 3 not good enough solutions

        // 1- initial map for each enum value [Type - 0] + stream on items to update according to Type
//        HashMap<Type, Integer> map = new HashMap<>();
//
//        for (Type type: Type.values()) {
//            map.put(type, 0);
//        }
//        items.stream().forEach(item -> map.put( item.getType(), (map.get(item.getType()))+1));
//        return map;


        // 2- initial map stream on items [item.type -0] (merging function) + stream on items to update + casting
//        Map<Type, Integer> map1 = items.stream()
//                .collect(Collectors.toMap(Item::getType, item -> (Integer)0, (type1, type2) -> {return type1;}));
//
//        items.stream().forEach(item -> map1.put(item.getType(), (map1.get(item.getType()))+1 ));
//        return (HashMap<Type, Integer>) map1;

//        // 3- groupBy - Long
//        Map<Type, Long> test = items.stream()
//                .collect(Collectors.groupingBy( item -> item.getType(), Collectors.counting()) );
//        return (HashMap)test;

        return items.stream().collect(groupingBy(Item::getType, summingInt(e -> 1)));
    }



}
