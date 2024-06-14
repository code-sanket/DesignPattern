package factoryDesignPattern;

public class BankFactory {
    // Use getAccount method to get an object of type BankAccount
    public BankAccount getAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("CURRENT")) {
            return new CurrentAccount();
        } else if (accountType.equalsIgnoreCase("Business")) {
            return new BusinessAccount();
        }
        return null;
    }
}
