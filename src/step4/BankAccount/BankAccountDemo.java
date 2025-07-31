package step4.BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1201342523", 250000.0);
        bankAccount.deposit(100000);
        bankAccount.withdraw(400000);
        bankAccount.withdraw(349000);
        System.out.println(bankAccount.getBalance());
    }
}
