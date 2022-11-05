package startAtGoogle.p1_javaBestPracties.ch5_commonMethods;

import java.util.Objects;

public class Name implements Cloneable, Comparable<Name> {
    enum Prefix {MR, MRS};
    private Prefix prefix;
    private String firstName;
    private String lastName;

    public Name(Prefix prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Name)) return false;

        Name name = (Name) o;

        if (prefix != name.prefix) return false;
        if (!Objects.equals(firstName, name.firstName)) return false;
        return Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        int result = prefix != null ? prefix.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Name{" +
                "prefix=" + prefix +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    protected Name clone() {
        try {
            Name clone = (Name) super.clone();
            clone.prefix = this.prefix;
            clone.firstName = this.firstName;
            clone.lastName = this.lastName;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // static factory
    public static Name copyOf(Name name){
        return new Name(name.prefix, name.firstName, name.lastName);
    }

    @Override
    public int compareTo(Name o) {
        if(this.prefix.compareTo(o.prefix) < 0)
            return -1;
        if(this.prefix.compareTo(o.prefix) > 0)
            return 1;
        if(this.firstName.compareTo(o.firstName) < 0)
            return -1;
        if(this.firstName.compareTo(o.firstName) > 0)
            return 1;
        if(this.lastName.compareTo(o.lastName) < 0)
            return -1;
        if(this.lastName.compareTo(o.lastName) > 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        //        name
        Name name1 = new Name(Name.Prefix.MRS, "Ana", "Levit");
        Name name2 = new Name(Name.Prefix.MRS, "Ana", "Levit");
        Name name3 = new Name(Name.Prefix.MRS, "Anna", "Levit");

        System.out.println("Name implementations: ");
        System.out.println("name1: " + name1);
        System.out.println("name2: " + name2);
        System.out.println("name3: " + name3);
        System.out.println("1 - 2 equals: " + name1.equals(name2));
        System.out.println("1 - 3 equals: " + name1.equals(name3));
        System.out.println("hashcode1: " + name1.hashCode());
        System.out.println("hashcode2: " + name2.hashCode());
        System.out.println("hashcode3: " + name3.hashCode());

        Name name4 = name1.clone();                           // clone
        System.out.println("name4 - clone of 1: " + name4);
        System.out.println("1 - 4 equals: " + name1.equals(name4));

        Name name5 = Name.copyOf(name1);                      // static factory method
        System.out.println("name5 - copyOf 1: " + name5);
        System.out.println("1 - 5 equals: " + name1.equals(name5));

        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareTo(name3));
    }




}

