package patterns;

import java.awt.*;
//swing classes
import javax.swing.*;

public class Decorator extends JComponent {
    public Decorator(JComponent c) {
        setLayout(new FlowLayout());
        // add("Center", c);
        add(c);
    }
}
