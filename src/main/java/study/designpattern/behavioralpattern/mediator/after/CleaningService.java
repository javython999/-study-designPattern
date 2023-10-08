package study.designpattern.behavioralpattern.mediator.after;

public class CleaningService {

    public void getTowels(Integer guestId, int numberOfTowels) {
        String roomNumber  = FrontDesck.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowels + " To " + roomNumber);
    }
}
