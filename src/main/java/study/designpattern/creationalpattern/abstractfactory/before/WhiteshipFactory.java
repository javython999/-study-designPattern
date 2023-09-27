package study.designpattern.creationalpattern.abstractfactory.before;


import study.designpattern.creationalpattern.factorymethod.after.DefaultShipFactory;
import study.designpattern.creationalpattern.factorymethod.after.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
