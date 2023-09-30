package study.designpattern.structuralpattern.composite.after;

public class AfterItem implements Component {

    private String name;

    private int price;

    public AfterItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
