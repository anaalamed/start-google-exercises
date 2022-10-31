package startAtGoogle.javaBestPracties.ch5_commonMethods;

import java.util.Objects;

public class Contact implements Cloneable, Comparable<Contact> {
    private Name name;
    private PhoneNumber phoneNumber;

    public Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!Objects.equals(name, contact.name)) return false;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static Contact copyOf(Contact contact1){
        return new Contact(contact1.name, contact1.phoneNumber );
    }

    @Override
    protected Contact clone() throws CloneNotSupportedException {
        try{
            Contact c = (Contact) super.clone();
            c.name = this.name;
            c.phoneNumber = new PhoneNumber(this.phoneNumber.getAreaCode(),this.phoneNumber.getNumber());
            return c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Contact o) {
        if(this.name.compareTo(o.name)<0)
            return -1;
        if(this.name.compareTo(o.name)>0)
            return 1;
        if (phoneNumber.compareTo(o.phoneNumber)<0)
            return -1;
        if (phoneNumber.compareTo(o.phoneNumber)>0)
            return 1;
        return 0;
    }

}
