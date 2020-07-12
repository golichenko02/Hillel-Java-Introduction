package UI;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame w = new JFrame("Окно");

        w.setSize(600,600);
        w.setBackground(Color.LIGHT_GRAY);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.setLayout(new BorderLayout(1,1));

        Draw draw = new Draw();

        w.add(draw);

        w.setVisible(true);
    }
}
