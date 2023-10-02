package study.designpattern.structuralpattern.flyweight.after;

public class AfterFlyweightClient {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        AfterFlyweightCharacter c1 = new AfterFlyweightCharacter('h', "white", fontFactory.getFont("nanum:12"));
        AfterFlyweightCharacter c2 = new AfterFlyweightCharacter('e', "white", fontFactory.getFont("nanum:12"));
        AfterFlyweightCharacter c3 = new AfterFlyweightCharacter('l', "white", fontFactory.getFont("nanum:12"));
        AfterFlyweightCharacter c4 = new AfterFlyweightCharacter('o', "white", fontFactory.getFont("nanum:12"));
    }
}
