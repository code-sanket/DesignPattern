package decoratorDesignPattern;

public class RainbowSprinkleDecorator extends IceCreamDecorator{

    IceCream iceCream;

    public RainbowSprinkleDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + "with rainbow sprinkle";
    }

    @Override
    int cost() {
        return iceCream.cost() + 40;
    }
}
