package study.designpattern.structuralpattern.proxy.before;

public class BeforeProxyClient {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
