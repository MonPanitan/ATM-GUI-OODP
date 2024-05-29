// Create a banking system with singleton pattern
package patterns.singleton;

public class BankSingleton {
    // import bank class
    private static BankSingleton bankSingleton;

    private BankSingleton() {
    }

    public static synchronized BankSingleton getInstance() {
        if (bankSingleton == null)
            bankSingleton = new BankSingleton();

        return bankSingleton;
    }

}
