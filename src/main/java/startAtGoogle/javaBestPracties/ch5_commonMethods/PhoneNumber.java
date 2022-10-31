package startAtGoogle.javaBestPracties.ch5_commonMethods;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
    private int areaCode;
    private int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (areaCode != that.areaCode) return false;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        int result = areaCode;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            PhoneNumber number = (PhoneNumber) super.clone();
            number.areaCode = this.areaCode;
            number.number = this.number;
            return number;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(PhoneNumber o) {
        if(this.areaCode < o.areaCode)
            return -1;
        if(this.areaCode > o.areaCode)
            return 1;
        if (this.number < o.number)
            return -1;
        if (this.number > o.number)
            return 1;
        return 0;
    }

    public static PhoneNumber copyOf(PhoneNumber num){
        return new PhoneNumber(num.areaCode, num.number);
    }

    public static void main(String[] args) {
        //        name
        PhoneNumber num1 = new PhoneNumber(972, 542308919);
        PhoneNumber num2 = new PhoneNumber(972, 542308919);
        PhoneNumber num3 = new PhoneNumber(972, 542308900);


        System.out.println("Number implementations: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("1 - 2 equals: " + num1.equals(num2));
        System.out.println("1 - 3 equals: " + num1.equals(num3));
        System.out.println("hashcode1: " + num1.hashCode());
        System.out.println("hashcode2: " + num2.hashCode());
        System.out.println("hashcode3: " + num3.hashCode());

//        PhoneNumber num4 = num1.clone();                           // clone
//        System.out.println("num4 - clone of 1: " + num4);
//        System.out.println("1 - 4 equals: " + num1.equals(num4));

        PhoneNumber num5 = PhoneNumber.copyOf(num1);                      // static factory method
        System.out.println("name5 - copyOf 1: " + num5);
        System.out.println("1 - 5 equals: " + num1.equals(num5));

        System.out.println(num1.compareTo(num2));
        System.out.println(num2.compareTo(num3));
    }

}
