package study.designpattern.creationalpattern.singleton;

public class App {
    public static void main(String[] args) {
        //생성자가 private으로 선언되어있어 new Setteings()로 인스턴스를 생성할 수 없게 된다.
        //Settings settings = new Settings();
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2); // true
    }
}
