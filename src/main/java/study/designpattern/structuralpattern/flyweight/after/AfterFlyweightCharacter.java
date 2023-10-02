package study.designpattern.structuralpattern.flyweight.after;

public class AfterFlyweightCharacter {
    private char value;
    private String color;
    private Font font;

    public AfterFlyweightCharacter(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
