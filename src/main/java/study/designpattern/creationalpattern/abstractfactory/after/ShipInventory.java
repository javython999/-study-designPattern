package study.designpattern.creationalpattern.abstractfactory.after;


import study.designpattern.creationalpattern.factorymethod.after.Ship;
import study.designpattern.creationalpattern.factorymethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
