package patterns.singleton;

import patterns.singleton.BankSingleton;

public class BankTest {
    public static void main(String[] args) {
        BankSingleton banksingleton = BankSingleton.getInstance();
        System.out.println(banksingleton);
    }
}