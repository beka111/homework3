public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;

    }

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Insufficient funds. Account balance = ", amount);
        }
        amount -= sum;
    }

}