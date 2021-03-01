
package controllers;


import models.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Inputs {
    final Component frame;
    final JButton button;
    final JTextField field1;
    final JTextField field2;

    public Inputs(Component frame, JButton button, JTextField field1, JTextField field2) {
        this.frame = frame;
        this.button = button;
        this.field1 = field1;
        this.field2 = field2;
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void listener() {
        this.button.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String n1 = field1.getText();
                    String n2 = field2.getText();

                    ArrayList<String> errors = new ArrayList<String>();

                    if (n1.isEmpty() || n2.isEmpty() || n1.isBlank() || n2.isBlank()) {
                        errors.add("some field is empty");
                    }
                    if (!isNumeric(n1) || !isNumeric(n2)) {
                        errors.add("type only numbers");
                    }

                    if (errors.size() > 0) {
                        for (String error : errors) {
                            JOptionPane.showMessageDialog(frame, error);
                        }
                        errors.clear();
                    } else {
                        double dn1 = Double.parseDouble(n1);
                        double dn2 = Double.parseDouble(n2);

                        Calculator calc = new Calculator(dn1, dn2);

                        Type type = new Type();

                        switch (type.getType()) {
                            case "not-found" -> JOptionPane.showMessageDialog(frame, "choose an operator in the menu options");
                            case "error" -> JOptionPane.showMessageDialog(frame, "error in the app, please restart");
                            case "sum" -> JOptionPane.showMessageDialog(frame, calc.sum());
                            case "times" -> JOptionPane.showMessageDialog(frame, calc.times());
                            case "subtract" -> JOptionPane.showMessageDialog(frame, calc.subtract());
                            case "divide" -> JOptionPane.showMessageDialog(frame, calc.divide());
                        }
                    }
                }
            }
        );
    }
}
