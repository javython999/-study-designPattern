package study.designpattern.structuralpattern.proxy.after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();

        if(gameService == null) {
            this.gameService = new DefalutGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
