package study.designpattern.creationalpattern.abstractfactory.after;


import study.designpattern.creationalpattern.factorymethod.after.DefaultShipFactory;
import study.designpattern.creationalpattern.factorymethod.after.Ship;


public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
