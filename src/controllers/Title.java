package controllers;

import javax.swing.*;

public class Title {

    private final JFrame frame;

    public Title(JFrame frame) {
        this.frame = frame;
    }


    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
