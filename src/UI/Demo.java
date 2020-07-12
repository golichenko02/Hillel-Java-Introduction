package UI;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame w = new JFrame("Laba 7");

        w.setSize(600,600);
        w.setBackground(Color.LIGHT_GRAY);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.setLayout(new BorderLayout(1,1));

        Canv canv = new Canv();

        w.add(canv);

        w.setVisible(true);
    }
}

class Canv extends JComponent {
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        int x1 = 250;
        int y1 = 250;
        int length = 100;
        int height = 100;

        g2d.setPaint(Color.orange);
        g2d.drawRect(x1, y1, length, height);

        int x2 = 100;
        int y2 = 150;
        int x3 = 400;
        int y3 = 350;

        g2d.setColor(Color.RED);
        g2d.drawLine(x2,y2,x3,y3);

        g2d.setColor(Color.BLACK);
        g2d.drawString("Задание: задано прямоугольные координаты вершин квадрата и концов отрезка.",130,50);
        g2d.drawString(" Определить взаимное расположение отрезка и квадрата.",130,70);
        if( (x2 <= x1) && (x3>=x1) && (y2 <= y1) && (y3 >= y1)){
           g2d.drawString("Ответ: пересекаются", 130,90);
       }else {
            g2d.drawString("Ответ: не пересекаются", 130,90);
        }

        super.repaint();
    }
}
