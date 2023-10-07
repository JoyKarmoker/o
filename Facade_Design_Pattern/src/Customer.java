import java.math.BigDecimal;
public class Customer {
    public static void main(String[] args) {
        System.out.println();
        BankService bankService = new BankService();
        int joySavingAccount = bankService.createNewAccount("saving", new BigDecimal(1000.00));
        BigDecimal joySavingAccountBalance = bankService.showBalance(joySavingAccount);
        System.out.println("Joy Saving Account Balance is: " +joySavingAccountBalance);

        int joyInvestmentAccount = bankService.createNewAccount("investment", new BigDecimal(2000.00));
        BigDecimal joyInvestmentAccountBalance = bankService.showBalance(joyInvestmentAccount);
        System.out.println("Joy Investment Account Balance is: " +joyInvestmentAccountBalance);

        System.out.println();
        bankService.transferMoney(joyInvestmentAccount, joySavingAccount, new BigDecimal(500.00));
        joyInvestmentAccountBalance = bankService.showBalance(joyInvestmentAccount);
        joySavingAccountBalance = bankService.showBalance(joySavingAccount);
        System.out.println("After Transfer, Joy Saving Account Balance is: " + joySavingAccountBalance);
        System.out.println("After Transfer, Joy Investment Account Balance is: " + joyInvestmentAccountBalance);

        System.out.println();
        bankService.deposit(joySavingAccount, new BigDecimal(3000.00));
        joySavingAccountBalance = bankService.showBalance(joySavingAccount);
        System.out.println("After Deposit, Joy Saving Account Balance is: " +joySavingAccountBalance);
    }
}
