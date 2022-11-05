package startAtGoogle.p2_designPatterns.ch3_structualPatterns.simpleExamples.proxy;

public class ClubWithBouncer implements Club{
    private PublicClub publicClub = new PublicClub();

    @Override
    public void openDoor(PartyPerson partyPerson) {
        if(partyPerson.getAge()>=21){
            publicClub.openDoor(partyPerson);
        }else{
            System.out.println("Not allowed");
        }
    }
}
