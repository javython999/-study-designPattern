package study.designpattern.behavioralpattern.command.after;

import study.designpattern.behavioralpattern.command.before.Game;

public class AfterCommandMyApp {
    private Command command;

    public AfterCommandMyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        AfterCommandMyApp myApp = new AfterCommandMyApp(new GameStartCommand(new Game()));
        myApp.press();
    }
}
