package decoratorDesignPattern;

public class ChocolateIceCream extends IceCream{

    @Override
    String getDescription() {
        return "Chocolate IceCream";
    }

    @Override
    int cost() {
        return 70;
    }
}
