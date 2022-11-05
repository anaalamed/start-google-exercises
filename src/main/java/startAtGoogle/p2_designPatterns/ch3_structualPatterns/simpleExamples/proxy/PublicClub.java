package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.proxy;

public class PublicClub implements Club{
    @Override
    public void openDoor(PartyPerson partyPerson) {
        System.out.println("Welcome!");
    }
}