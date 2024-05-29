public class observerTest {
    public static void main(String[] args) {
        // TESTING OBSERVER PATTERN
        String tfBal = "1000.0";
        String tfAccId = "1";
        String accType = "Savings";

        double d1 = Double.parseDouble(tfBal);
        int i1 = Integer.parseInt(tfAccId);
        Account newAccount = new Account.Builder().balance(d1)
                .type(accType).accId(i1).build();

        System.out.println(newAccount);

        // Transaction Test
        double d2 = 100.0;
        int i2 = 2;
        String accType2 = "Checking";

        Bank banksingleton3 = new Bank();
        newAccount.addObserver(banksingleton3);
        newAccount.doTransaction(200.0, 30, "Withdrawal");

    }
}
