package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.proxy;

public class Main {
    public static void main(String[] args) {
        PartyPerson tooYoung = new PartyPerson(20);
        PartyPerson old = new PartyPerson(30);

        PublicClub publicClub = new PublicClub();
        System.out.println("Public club:");
        publicClub.openDoor(tooYoung);
        publicClub.openDoor(old);

        // ClubWithBouncer is a proxy
        ClubWithBouncer clubWithBouncer = new ClubWithBouncer();
        System.out.println("Club with bouncer:");
        clubWithBouncer.openDoor(tooYoung);
        clubWithBouncer.openDoor(old);
    }
}
