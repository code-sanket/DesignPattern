package factoryDesignPattern;

public class CurrentAccount implements BankAccount{
    @Override
    public void accountType() {
        System.out.println("Opening Current Account");
    }
}
