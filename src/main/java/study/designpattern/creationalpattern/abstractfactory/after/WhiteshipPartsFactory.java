package study.designpattern.creationalpattern.abstractfactory.after;


import study.designpattern.creationalpattern.abstractfactory.before.WhiteAnchor;
import study.designpattern.creationalpattern.abstractfactory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
