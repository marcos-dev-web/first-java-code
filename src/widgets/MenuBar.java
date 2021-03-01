package widgets;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class MenuBar extends JMenuBar {
    private final JMenuItem sum = new JMenuItem("Sum");
    private final JMenuItem times = new JMenuItem("Times");
    private final JMenuItem divide = new JMenuItem("Divide");
    private final JMenuItem sub = new JMenuItem("Subtract");

    public JMenuBar widget() {
        //creating the menu Options
        JMenu menuFile = new JMenu("Options");

        //adding item in menu Options
        menuFile.add(this.sum);
        menuFile.add(this.times);
        menuFile.add(this.divide);
        menuFile.add(this.sub);


        //adding menuBar in the window
        this.add(menuFile);

        return this;
    }

    public JMenuItem getSum() {
        return sum;
    }

    public JMenuItem getTimes() {
        return times;
    }

    public JMenuItem getDivide() {
        return divide;
    }

    public JMenuItem getSub() {
        return sub;
    }
}
