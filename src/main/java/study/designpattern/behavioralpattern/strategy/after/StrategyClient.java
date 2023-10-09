package study.designpattern.behavioralpattern.strategy.after;

public class StrategyClient {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();

        game.blueLight(new Normal());
        game.redLight(new Faster());
    }
}
