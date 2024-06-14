package sagaPattern;

public class Main {
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement() {
            @Override
            public void debitAccount(int amount, int accountId) {
                System.out.println("Debited " + amount + "fromAccount " + accountId);
            }

            @Override
            public void creditAccount(int amount, int accountId) {
                if(accountId == 321){
                    throw new RuntimeException("the destination account is blocked");
                }
                System.out.println("CreditedAmount "+ amount + "toAccount " + accountId);

            }

            @Override
            public void refundDebit(int amount, int accountId) {
                System.out.println("Refunded " + amount + " toAccount " + accountId);
            }

            @Override
            public void undoCredit(int amount, int accountId) {
                System.out.println("Undo Credit " + amount + "fromAccount " + accountId);
            }
        };

        MoneyTransfer moneyTransferSaga = new MoneyTransfer(
                123,321,2000,accountManagement
        );

        moneyTransferSaga.execute();
    }
}
