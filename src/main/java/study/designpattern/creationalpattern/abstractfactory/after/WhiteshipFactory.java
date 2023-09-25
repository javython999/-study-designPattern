package study.designpattern.creationalpattern.abstractfactory.after;


import study.designpattern.creationalpattern.factorymethod.after.DefaultShipFactory;
import study.designpattern.creationalpattern.factorymethod.after.Ship;
import study.designpattern.creationalpattern.factorymethod.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
