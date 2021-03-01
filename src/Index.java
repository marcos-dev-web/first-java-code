import javax.swing.*;
import java.awt.*;

import widgets.Panel;
import widgets.MenuBar;

import controllers.Title;
import controllers.Inputs;
import controllers.ListenMenu;
import controllers.Type;

public class Index {
    public static void main(String[] args) {

        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final double HEIGHT = screenSize.getHeight();
        final double WIDTH = screenSize.getWidth();

        JFrame frame = new JFrame("Calculator");
        Type type = new Type();
        Title title = new Title(frame);
        String t = type.getType();
        title.setTitle((!t.equals("error") && !t.equals("not-found")) ? t : "Calculator");

        frame.setSize(400, 400);

        double widthFrame = frame.getWidth();
        double heightFrame = frame.getHeight();

        int x = (int) (WIDTH / 2) - (int) (widthFrame / 2);
        int y = (int) (HEIGHT / 2) - (int) (heightFrame / 2);

        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        JPanel center = new JPanel(new GridBagLayout());
        center.setPreferredSize(frame.getSize());

        Panel panel = new widgets.Panel();

        Inputs inputs = new Inputs(frame, panel.getButton(), panel.getField1(), panel.getField2());
        inputs.listener();

        MenuBar menuBar = new widgets.MenuBar();
        JMenuBar menuBarWidget = menuBar.widget();

        ListenMenu menuItemsListen = new ListenMenu(frame, menuBar.getSum(), menuBar.getTimes(), menuBar.getDivide(), menuBar.getSub());
        menuItemsListen.listener();

        panel.widget().setPreferredSize(new Dimension(frame.getWidth(), 300));
        panel.widget().setBackground(Color.yellow);

        center.add(panel.widget());

        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.getContentPane().add(BorderLayout.NORTH, menuBarWidget);
        frame.setVisible(true);
    }
}
