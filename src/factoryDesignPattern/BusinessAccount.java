package factoryDesignPattern;

public class BusinessAccount implements BankAccount{
    @Override
    public void accountType() {
        System.out.println("Opening Business Account");
    }
}
