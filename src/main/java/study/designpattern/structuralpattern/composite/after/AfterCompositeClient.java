package study.designpattern.structuralpattern.composite.after;

public class AfterCompositeClient {

    public static void main(String[] args) {
        AfterItem doranBlade = new AfterItem("도란검", 450);
        AfterItem healPotion = new AfterItem("체력 물약", 50);

        AfterBag bag = new AfterBag();
        bag.add(doranBlade);
        bag.add(healPotion);

        AfterCompositeClient client = new AfterCompositeClient();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
