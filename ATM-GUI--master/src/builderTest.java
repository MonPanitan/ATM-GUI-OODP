public class builderTest {
    public static void main(String[] args) {
                // TESTING BUILDER PATTERN
                String tfBal = "1000.0";
                String tfAccId = "1";
                String accType = "Savings";
        
                double d1 = Double.parseDouble(tfBal);
                int i1 = Integer.parseInt(tfAccId);
                Account newAccount = new Account.Builder().balance(d1)
                                                .type(accType).accId(i1).build();
        
                System.out.println(newAccount);
    }
}
