package study.designpattern.structuralpattern.bridge.before;

public class 정복자아리 implements Champion{
    @Override
    public void move() {
        System.out.printf("정복자 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.printf("정복자 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.printf("정복자 아리 W");
    }

    @Override
    public void skillE() {
        System.out.printf("정복자 아리 E");
    }

    @Override
    public void skillR() {
        System.out.printf("정복자 아리 R");
    }
}
