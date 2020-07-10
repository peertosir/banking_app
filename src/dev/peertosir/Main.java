package dev.peertosir;

import dev.peertosir.accounts.BaseAccount;
import dev.peertosir.accounts.DebetAccount;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        DebetAccount account = new DebetAccount(200);
        account.deposit(500);
        account.withdraw(800);
        System.out.println(account.checkMoney());
        account.withdraw(200);
        System.out.println(account.checkMoney());
        DebetAccount account2 = new DebetAccount(200);
        account2.deposit(400);
        System.out.println(account2.debetAccountID);
        System.out.println(account2.checkMoney());
    }
}
