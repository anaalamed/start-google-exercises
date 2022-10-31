package startAtGoogle.javaBestPracties.ch6_methods.classes;

import java.time.LocalDate;

 class Coupon {
    // package private
    private final int id;
    private final LocalDate date;
    private final int value;

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Coupon(int id, LocalDate date, int value) {
        this.id = id;
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
//      Defensive Copies
        LocalDate copyDate =  LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        return copyDate;
    }

    @Override
    public String toString() {
        return "\nCoupon{" +
                "id=" + id +
                ", date=" + date +
                ", value=" + value +
                "}";
    }

    public Boolean checkCouponValidation() {
        if (this.value > 0 && this.value <= 1000) {
            System.out.println("the coupon is valid");
            return true;
        }
        System.out.println("NOT valid coupon! ");
        return false;
    }

}


