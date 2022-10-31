package startAtGoogle.utility.random;

import java.time.LocalDate;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static int getId() {
        UUID uuid = UUID.randomUUID();
        return uuid.hashCode();
    }

    // int
    public static int getRandomInt(int bound) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int randomInt = rnd.nextInt(bound) + 1 ;     // 1-10
        return randomInt;
    }

    // double
    public static double getRandomDouble(double bound) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return rnd.nextDouble(bound) + 1 ;     // 1-10
    }

    // date
    public static LocalDate getRandomDate() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int minDay = (int) LocalDate.of(2021, 1,1).toEpochDay();
        int maxDay = (int) LocalDate.of(2025, 1, 1).toEpochDay();
        return LocalDate.ofEpochDay(random.nextInt(minDay, maxDay));
    }

    // str
    public static String generateRandomStr(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }










}
