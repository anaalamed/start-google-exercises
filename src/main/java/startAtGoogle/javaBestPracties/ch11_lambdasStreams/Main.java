package startAtGoogle.javaBestPracties.ch11_lambdasStreams;

import startAtGoogle.javaBestPracties.ch11_lambdasStreams.classes.Stock;

public class Main {
    public static void main(String[] args) {
        Stock itemsStock = new Stock();

        // generate items
        itemsStock.generateItems(5);
//        itemsStock.generateItem("test");
        System.out.println(itemsStock);

        // get expired items
        System.out.println("\nexpired items: \n" + itemsStock.getExpiredItems());

        // Get the item with the closest expiry date
        System.out.println("\nclosestExpiryItem is: " + itemsStock.getClosestExpiryItem());

        // Get a list of items sorted alphabetically
        System.out.println("\nsortedAlphabetically: " + itemsStock.getSortedAlphabetically());

        // Get item by name
        System.out.println("\ngetItemByName: " + "\"aaa\" " + itemsStock.getItemByName("aaa"));      // false probably
        System.out.println("getItemByName: " + "\"test\" " + itemsStock.getItemByName("test"));      // true

        // Get a list of names of items
        System.out.println("\ngetListOfNamesAboveWeight: 0.4: " + itemsStock.getListOfNamesAboveWeight(0.5));

        // Get a hash map of <type, Integer> to sum all the items according to their type
        System.out.println("\ngetHashmapTypeCount: " + itemsStock.getHashmapTypeCount() );
    }
}
