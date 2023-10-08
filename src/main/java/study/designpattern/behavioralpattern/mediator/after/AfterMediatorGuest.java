package study.designpattern.behavioralpattern.mediator.after;

import java.time.LocalDateTime;

public class AfterMediatorGuest {

    private Integer Id;

    private FrontDesck frontDesck = new FrontDesck();

    public void getTowels(int numberOfTowels) {
        frontDesck.getTowels(this, numberOfTowels);
    }

    public void dinner(LocalDateTime dateTime) {
        frontDesck.dinner(this, dateTime);
    }
    public Integer getId() {
        return Id;
    }
}
