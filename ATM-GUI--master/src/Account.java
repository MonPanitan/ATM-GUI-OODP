import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Account {
	private double balance;
	private String type;
	private int accId;
	private ArrayList<Transaction> trans;
	private TransListData transListData;

	public Account(Builder builder) {
		this.balance = builder.balance;
		this.type = builder.type;
		this.accId = builder.accId;
		trans = new ArrayList<Transaction>();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double bal) {
		this.balance = bal;
	}

	public String getType() {
		return type;
	}

	public int getAccId() {
		return accId;
	}

	public void doTransaction(double amount, int time, String type) {
		Transaction T1 = new Transaction(amount, time, type);
		trans.add(T1);
		transListData.addElement(T1);//observer pattern
	}

	@SuppressWarnings("unchecked")
	public void printTransLog() {
		try {
			PrintWriter writer = new PrintWriter("TransLog.txt");
			if (trans == null) {
				writer.println("No transactions to display ");
				writer.close();
			} else {
				writer.println("Account ID: " + accId + " " + "Balance: " + balance + " " + "Type: " + type);
				writer.flush();
				writer.println("Transcaction logs: ");
				Collections.sort(trans);

				for (int i = 0; i < trans.size(); i++) {
					writer.println("Amount: $" + trans.get(i).getAmount() + " " + "Time :" + trans.get(i).getTime()
							+ "min " + "Type: " + trans.get(i).getType());
					writer.flush();
				}
				writer.close();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	// -----------------------------------------------------------------------------------------------
	// Create builder class for Account
	public static class Builder {
		private double balance;
		private String type;
		private int accId;

		public Builder() {
		}

		public Builder balance(double balance) {
			this.balance = balance;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder accId(int accId) {
			this.accId = accId;
			return this;
		}

		public Account build() {
			return new Account(this);
		}
	}

    public void addObserver(Bank banksingleton3) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }

}
