package study.designpattern.behavioralpattern.observer.after;

import study.designpattern.behavioralpattern.observer.before.ChatServer;

import java.util.List;

public class AfterObserverUser implements Subscriber {

    private String name;

    public AfterObserverUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
