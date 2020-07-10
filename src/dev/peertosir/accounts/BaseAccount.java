package dev.peertosir.accounts;

public abstract class BaseAccount {
    public static int ID;
    protected double money;

    public BaseAccount(int startDeposit) {
        this.money = Math.max(startDeposit, 0);
        ID++;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public abstract String checkMoney();

}
