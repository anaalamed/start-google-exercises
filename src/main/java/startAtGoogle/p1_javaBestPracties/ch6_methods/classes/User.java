package startAtGoogle.p1_javaBestPracties.ch6_methods.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class User {
    private final String name;
    private final List<Coupon> coupons;

    public User(String name) {
        this.name = name;
        this.coupons = new ArrayList<>();
    }

    public ArrayList<Coupon> getCoupons() {
        return (ArrayList<Coupon>) coupons;
    }

    public String getName() {
        return name;
    }

    public void addCoupon(Coupon coupon) {
        this.coupons.add(coupon);
    }

    public void useCoupon(Coupon coupon) {
        this.coupons.add(coupon);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", coupons=" + coupons +
                "}\n";
    }

    public void useCouponById(int id) {
        if (coupons.isEmpty()) {
            System.out.println("the user doesn't have any coupons");
            return;
        }

        for (int i = 0; i < coupons.size(); i++) {
            if (coupons.get(i).getId() == id && coupons.get(i).checkCouponValidation() ) {
                System.out.println("useCouponById: the coupon was used! id: " + id);
                coupons.remove(coupons.get(i));
                return;
            }
        }
        System.out.println("the user doen't have this coupon! id:" + id);
    }

    public void useCouponWithHighestValue() {
        if (coupons.isEmpty()) {
            System.out.println("useCouponWithHighestValue: the user doesn't have any coupons");
            return;
        }

        Coupon couponToUse = coupons.get(0);
        int max = 0;
        for ( Coupon coupon: coupons ) {
            if (coupon.getValue() > max) {
                max = coupon.getValue();
                couponToUse = coupon;
            }
        }

        // validation
        if (couponToUse.checkCouponValidation()) {
            coupons.remove(couponToUse);
            System.out.println("useCouponWithHighestValue: the coupon was used: " + couponToUse);
        }
    }

    public void useCouponWithClosestExpiryDate() {
        if (coupons.isEmpty()) {
            System.out.println("the user doesn't have any coupons");
            return;
        }

        Coupon couponToUse = coupons.get(0);

        for (Coupon coupon:coupons) {
            if (coupon.getDate().compareTo(couponToUse.getDate()) < 0) {
                couponToUse = coupon;
            }
        }

        if (couponToUse.checkCouponValidation()) {
            coupons.remove(couponToUse);
            System.out.println("useCouponWithClosestExpiryDate: the coupon was used: " + couponToUse);
        }
    }

    public void useRandomCoupon() {
        if (coupons.isEmpty()) {
            System.out.println("useRandomCoupon: the user doesn't have any coupons");
            return;
        }

        int index = ThreadLocalRandom.current().nextInt(coupons.size());
        Coupon couponToUse = coupons.get(index);

        if (couponToUse.checkCouponValidation()) {
            coupons.remove(couponToUse);
            System.out.println("useRandomCoupon: the coupon was used: " + couponToUse);
        }
    }




}
