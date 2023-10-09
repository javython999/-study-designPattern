package study.designpattern.behavioralpattern.visitor.after;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
