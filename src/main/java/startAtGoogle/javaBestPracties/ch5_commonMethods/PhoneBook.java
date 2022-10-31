package startAtGoogle.javaBestPracties.ch5_commonMethods;

import java.util.ArrayList;

public class PhoneBook {
    private Name name;
    private ArrayList<Contact> contacts;



    public static void main(String[] args) {
        Contact contact1 = new Contact(new Name(Name.Prefix.MRS, "Ana", "Levit"), new PhoneNumber(972, 542308919));
        Contact contact2 = new Contact(new Name(Name.Prefix.MRS, "Ana", "Levit"), new PhoneNumber(972, 542308919));
        Contact contact3 = new Contact(new Name(Name.Prefix.MRS, "Anaa", "Levit"), new PhoneNumber(972, 542308919));
        System.out.println(contact1);
        System.out.println(contact2);
        System.out.println(contact3);

        System.out.println("1 - 2 equals: " + contact1.equals(contact2));
        System.out.println("1 - 3 equals: " + contact1.equals(contact3));

        System.out.println("hashcode1: " + contact1.hashCode());
        System.out.println("hashcode2: " + contact2.hashCode());
        System.out.println("hashcode3: " + contact3.hashCode());

        Contact contact5 = Contact.copyOf(contact1);                      // static factory method
        System.out.println(contact5);
        System.out.println("1 - 5 equals: " + contact5.equals(contact1));

        System.out.println(contact1.compareTo(contact2));
        System.out.println(contact1.compareTo(contact3));
        System.out.println(contact3.compareTo(contact1));
    }
}

