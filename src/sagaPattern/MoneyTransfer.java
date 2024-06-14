package sagaPattern;

import java.util.Stack;

public class MoneyTransfer {

    private final int sourceAccountId;
    private final int destinationAccountId;
    private final int amount;
    private final AccountManagement accountManagement;
    private final Stack<Runnable> fallbackStack;

    public MoneyTransfer(int sourceAccountId,
                         int destinationAccountId,
                         int amount,
                         AccountManagement accountManagement
                         ) {
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.amount = amount;
        this.accountManagement = accountManagement;
        this.fallbackStack = new Stack<>();
    }

    public void execute(){
        try {
            debitSourceAccount();
            creditDestinationAccount();
        }catch (Exception e){
            System.out.println("Transaction Failed : " +  e.getMessage());
            rollback();
        }
    }

    private void debitSourceAccount(){ // debit the amount from source account and also push its fallback method in the stack
        this.accountManagement.debitAccount(amount , sourceAccountId);
        fallbackStack.push(() -> accountManagement.refundDebit(amount , sourceAccountId));
    }

    private void creditDestinationAccount(){ // credit the amount in dest account id and push the rollback method for the case if it fails
        this.accountManagement.creditAccount(amount, destinationAccountId);
        fallbackStack.push(()->this.accountManagement.undoCredit(amount, destinationAccountId));
    }

    private void rollback(){
        while(!fallbackStack.isEmpty()){
            try {
                Runnable fallback = this.fallbackStack.pop();
                fallback.run();
            }catch (Exception e){
                System.out.println("Error while fallback " + e.getMessage());
            }
        }
    }
}
