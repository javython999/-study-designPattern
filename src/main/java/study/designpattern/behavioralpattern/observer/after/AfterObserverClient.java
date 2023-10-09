package study.designpattern.behavioralpattern.observer.after;

public class AfterObserverClient {

    public static void main(String[] args) {
        AfterObserverChatServer chatServer = new AfterObserverChatServer();

        AfterObserverUser user1 = new AfterObserverUser("kim");
        AfterObserverUser user2 = new AfterObserverUser("lee");

        chatServer.register("observer-pattern", user1);
        chatServer.register("observer-pattern", user2);

        chatServer.register("design-pattern", user1);

        chatServer.sendMessage(user1, "observer-pattern", "this is observer pattern");
        chatServer.sendMessage(user2, "design-pattern", "this is design pattern?");
    }
}
