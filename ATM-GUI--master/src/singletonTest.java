import javax.swing.JButton;
import javax.swing.JFrame;

import patterns.BtnDecorator;

public class singletonTest {
    public static void main(String[] args) {
        // TESTING SINGLETON PATTERN
        Bank banksingleton = BankSingleton.getInstance();
		banksingleton.showLoginMenu();

        // Test creating another object
		Bank banksingleton2 = BankSingleton.getInstance();
		banksingleton2.showLoginMenu();
    }
}
