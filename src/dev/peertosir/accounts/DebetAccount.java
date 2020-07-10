package dev.peertosir.accounts;

public class DebetAccount extends BaseAccount {
    public int debetAccountID;

    public DebetAccount(int startDeposit) {
        super(startDeposit);
        this.debetAccountID = BaseAccount.ID;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.printf("Sorry, %.2f$ is not correct amount to withdraw\n", amount);
        } else if (amount > this.money) {
            System.out.printf("Sorry, you have not enough money on your account with ID: %d\n", debetAccountID);
        }
        else {
            this.money -= amount;
            System.out.printf("Operation completed. %.2f deposit is on your account with ID: %d\n", amount, debetAccountID);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.printf("Sorry, %.2f$ is not correct amount to deposit\n", amount);
        } else {
            this.money += amount;
            System.out.printf("Operation completed. %.2f$ deposit is on your account with ID: %d\n", amount, debetAccountID);
        }
    }

    @Override
    public String checkMoney() {
        return String.format("%.2f$", this.money);
    }

}
