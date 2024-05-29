import javax.swing.*;
import patterns.BtnDecorator;
public class decoratorTest {
    // TESTING DECORATOR PATTERN
    decoratorTest(){
        JFrame frame = new JFrame("Bank Account");
        BtnDecorator button = new BtnDecorator(new JButton("Click Me"));
    
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    
    }
    public static void main(String[] args) {
        new decoratorTest();

    }
}

