import java.math.BigDecimal;

public class Investment implements IAccount{
    private final int accountNumber;
    private BigDecimal balance;
    public Investment(int accountNumber, BigDecimal initAmount)
    {
        this.accountNumber = accountNumber;
        this. balance = initAmount;
        //System.out.println("Investement Account Number is: " +accountNumber);
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        //System.out.println("Money Deposited to account number: " +this.accountNumber + "  and the ammount is: " + this.balance);

    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        this.balance = this.balance.subtract(amount);
        //System.out.println("Money transfered from account Number: " +this.accountNumber + "  and the ammount is: " + this.balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal showBalance(){
        return  this.balance;
    }
}
