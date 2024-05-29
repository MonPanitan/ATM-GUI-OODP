// Create a banking system with singleton pattern

public class BankSingleton {
    // import bank class
    // private static BankSingleton bankSingleton;
    private static Bank bankSingleton;

    private BankSingleton() {
    }

    public static synchronized Bank getInstance() {
        if (bankSingleton == null) {
            bankSingleton = new Bank();
        } else {
            throw new IllegalStateException("BankSingleton already initialized");
        }
        return bankSingleton;
    }

}
