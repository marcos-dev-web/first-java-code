package controllers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenMenu {
    private final JFrame frame;
    private final JMenuItem sum;
    private final JMenuItem times;
    private final JMenuItem divide;
    private final JMenuItem subtract;

    private final Type type = new Type();

    public ListenMenu(JFrame frame, JMenuItem sum, JMenuItem times, JMenuItem divide, JMenuItem subtract) {
        this.frame = frame;
        this.sum = sum;
        this.times = times;
        this.divide = divide;
        this.subtract = subtract;
    }

    public void listener() {
        Title title = new Title(frame);
        this.sum.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setType("sum");
                    title.setTitle("sum");
                }
            }
        );
        this.times.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setType("times");
                    title.setTitle("times");
                }
            }
        );
        this.divide.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setType("divide");
                    title.setTitle("divide");
                }
            }
        );
        this.subtract.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    type.setType("subtract");
                    title.setTitle("subtract");
                }
            }
        );
    }
}
