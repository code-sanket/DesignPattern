package decoratorDesignPattern;

public class ButterScothIceCream extends IceCream{

    @Override
    String getDescription() {
        return "ButterScoth IceCream";
    }

    @Override
    int cost() {
        return 90;
    }
}
