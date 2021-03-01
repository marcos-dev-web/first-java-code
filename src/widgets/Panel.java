package widgets;

import javax.swing.*;
import java.awt.*;

public class Panel {

    private final JPanel panel1 = new JPanel(new GridLayout(1, 2));
    private final JPanel panel2 = new JPanel(new GridLayout(1, 2));

    private final JLabel label1 = new JLabel("Number 1: ");
    private final JLabel label2 = new JLabel("Number 2: ");

    private final JTextField field1 = new JTextField(10);
    private final JTextField field2 = new JTextField(10);

    private final JButton button = new JButton("calc");

    public JPanel widget() {
        this.panel1.add(this.label1);
        this.panel1.add(this.field1);

        this.panel2.add(this.label2);
        this.panel2.add(this.field2);

        this.button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JPanel panel = new JPanel(new GridLayout(3,1));
        panel.add(this.panel1);
        panel.add(this.panel2);
        panel.add(this.button);
        return panel;
    }

    public JTextField getField1() {
        return field1;
    }

    public JTextField getField2() {
        return field2;
    }

    public JButton getButton() {
        return button;
    }
}
