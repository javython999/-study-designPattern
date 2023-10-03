package study.designpattern.structuralpattern.proxy.after;


public class AfterProxyClient {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
