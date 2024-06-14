package sagaPattern;

public interface AccountManagement {

    void debitAccount(int amount, int accountId);
    void creditAccount(int amount , int accountId);
    void refundDebit(int amount , int accountId);
    void undoCredit(int amount , int accountId);
}
