package startAtGoogle.p1_javaBestPracties.ch11_lambdasStreams.classes;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

class Item implements Comparable<Item> {
    private final String name;
    private final Type type;
    private final LocalDate expirationDate;
    private final double weight;




    private Item(String name, Type type, LocalDate expirationDate, double weight) {
        this.name = name;
        this.type = type;
        this.expirationDate = expirationDate;
        this.weight = weight;
    }

    public static Item newRandomItem() {
         return new Item(generateRandomStr(4), Type.values()[ThreadLocalRandom.current().nextInt(Type.values().length)], getRandomDate(), getRandomDouble(1.0) );
    }


    @Override
    public int compareTo(Item o) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", expirationDate=" + expirationDate +
                ", weight=" + weight +
                '}';
    }



    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getWeight() {
        return weight;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    private static double getRandomDouble(double bound) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextDouble(bound);
    }

    private static LocalDate getRandomDate() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int minDay = (int) LocalDate.of(2022, 1,1).toEpochDay();
        int maxDay = (int) LocalDate.of(2024, 1, 1).toEpochDay();
        return LocalDate.ofEpochDay(random.nextInt(minDay, maxDay));
    }

    private static String generateRandomStr(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }


}
