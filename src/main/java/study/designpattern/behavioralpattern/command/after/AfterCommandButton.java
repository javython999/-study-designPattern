package study.designpattern.behavioralpattern.command.after;

import study.designpattern.behavioralpattern.command.before.Game;
import study.designpattern.behavioralpattern.command.before.Light;

import java.util.Stack;

public class AfterCommandButton {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if(!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        AfterCommandButton button = new AfterCommandButton();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
