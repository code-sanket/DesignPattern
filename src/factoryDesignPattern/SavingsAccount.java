package factoryDesignPattern;

public class SavingsAccount implements BankAccount
{
    @Override
    public void accountType() {
        System.out.println("Opening Savings Account");
    }
}
