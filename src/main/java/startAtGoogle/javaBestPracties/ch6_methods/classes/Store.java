package startAtGoogle.javaBestPracties.ch6_methods.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static startAtGoogle.javaBestPracties.ch6_methods.Main.Main.maxCouponValue;

public class Store {
    private String name;
    List<Coupon> coupons = new ArrayList<>();
    public enum Use {CLOSESTDATE, MAXVALUE, RANDOM};


    public void assignCoupon(User user, Coupon couponToAdd) {
         if (!user.getCoupons().contains(couponToAdd) ) {
             user.addCoupon(couponToAdd);
         }
    }

    public void generateCoupons(User user, int length) {
//        ArrayList<Coupon> coupons = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            user.addCoupon(new Coupon(getId(), getRandomDate(), getRandomInt(maxCouponValue)));
        }

//        return coupons;
    }

    public static int getId() {
        UUID uuid = UUID.randomUUID();
        return uuid.hashCode();
    }

    public static int getRandomInt(int bound) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int randomInt = rnd.nextInt(bound) + 1 ;     // 1-10
        return randomInt;
    }

    public static LocalDate getRandomDate() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int minDay = (int) LocalDate.now().toEpochDay();
        int maxDay = (int) LocalDate.of(2025, 1, 1).toEpochDay();
        long randomDay =  random.nextInt(minDay, maxDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }

    public void useCoupon(User user, int id) {
        user.useCouponById(id);
    }

    public void useCoupon(User user, Use use) {
        switch (use) {
            case CLOSESTDATE:
                user.useCouponWithClosestExpiryDate();
                break;
            case MAXVALUE:
                user.useCouponWithHighestValue();
                break;
            default:
                user.useRandomCoupon();
                break;
        }
    }


}
