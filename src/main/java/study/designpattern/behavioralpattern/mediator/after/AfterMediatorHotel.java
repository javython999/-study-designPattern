package study.designpattern.behavioralpattern.mediator.after;

import java.time.LocalDateTime;

public class AfterMediatorHotel {

    public static void main(String[] args) {
        AfterMediatorGuest guest = new AfterMediatorGuest();
        guest.getTowels(3);

        LocalDateTime dinnerTime = LocalDateTime.parse("2023-10-08T18:00:00.000");
        guest.dinner(dinnerTime);

    }
}
