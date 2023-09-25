package study.designpattern.creationalpattern.factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "test@naver.com");
        client.print(new BlackShipFactory(), "blackShip", "test@naver.com");

        /*
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "test@naver.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "test@naver.com");
        System.out.println(blackShip);
        */
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
