package step4.BankAccount;

public class BankAccount {
    private String accountNumber;
    public double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Недостаточно средств");
        }else{
            this.balance -= amount;
        }
    }
    public double getBalance(){
        return this.balance;
    }
}
