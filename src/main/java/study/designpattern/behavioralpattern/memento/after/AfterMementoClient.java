package study.designpattern.behavioralpattern.memento.after;

public class AfterMementoClient {
    public static void main(String[] args) {
        AfterMementoGame game = new AfterMementoGame();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());


    }
}
