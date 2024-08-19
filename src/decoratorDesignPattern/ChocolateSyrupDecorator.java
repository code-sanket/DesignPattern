package decoratorDesignPattern;

public class ChocolateSyrupDecorator extends  IceCreamDecorator{

    IceCream iceCream;

    public ChocolateSyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + "with chocolate syrup";
    }

    @Override
    int cost() {
        return iceCream.cost() + 30;
    }
}
