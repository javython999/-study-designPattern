package study.designpattern.behavioralpattern.mediator.after;

import java.time.LocalDateTime;

public class Restaurant {

    public void dinner(Integer id, LocalDateTime dateTime) {
        String roomNumber = FrontDesck.getRoomNumberFor(id);
        System.out.println("dinner reservation for Room " + roomNumber + " at " + dateTime);
    }
}
