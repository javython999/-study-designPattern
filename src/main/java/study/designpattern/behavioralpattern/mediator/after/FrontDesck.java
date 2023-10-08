package study.designpattern.behavioralpattern.mediator.after;

import java.time.LocalDateTime;

public class FrontDesck {

    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();

    public void getTowels(AfterMediatorGuest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels);
    }

    public static String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(AfterMediatorGuest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
