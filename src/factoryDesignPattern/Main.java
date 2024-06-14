package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cirlceShape = shapeFactory.getShape("CIRCLE");
        cirlceShape.createShape();

        Shape square = shapeFactory.getShape("SQUARE");
        square.createShape();


        BankFactory bankFactory = new BankFactory();
        BankAccount savingAccount = bankFactory.getAccount("Savings");
        savingAccount.accountType();
        BankAccount businessAccount =bankFactory.getAccount("Business");
        businessAccount.accountType();
        BankAccount currentAccount = bankFactory.getAccount("Current");
        currentAccount.accountType();

    }
}
