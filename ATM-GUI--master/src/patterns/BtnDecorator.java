package patterns;

import java.awt.*;
import java.awt.event.*;

//swing classes
import javax.swing.text.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class BtnDecorator extends Decorator {
    boolean mouseOver = false;
    JComponent thisComponent;

    public BtnDecorator(JButton c) {
        super(c);
        mouseOver = false;
        thisComponent = this;

        c.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                thisComponent.setBackground(Color.GREEN);
                thisComponent.repaint();
            }

            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                thisComponent.repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g); // first draw the parent button
        // Draw a red border if mouse is over
        if (mouseOver) {
            Dimension d = super.getSize();
            g.setColor(new Color(255, 0, 0, 100)); // Red color with transparency
            g.fillRect(0, 0, d.width, d.height);
        }
    }

    public void addActionListener(ActionListener listener) {
        ((JButton) super.getComponent(0)).addActionListener(listener);
    }

}
