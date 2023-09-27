package study.designpattern.creationalpattern.builder.after;

import study.designpattern.creationalpattern.builder.before.TourPlan;

public class AfterApp {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();

        cancunTrip.toString();
    }
}
/**/