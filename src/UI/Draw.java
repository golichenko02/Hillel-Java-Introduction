package UI;

import javax.swing.*;
import java.awt.*;

public class Draw extends JComponent {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // inputData(250, 200, 250, 400, 300, 210, 300, 380); параллельны
        // inputData(250, 200, 400, 400, 300, 210, 200, 380); пересекаются
        inputData(250, 200, 100, 400, 300, 210, 410, 380); // не пересекаются

        g2d.setColor(Color.GREEN);
        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);

        g2d.setColor(Color.RED);
        g2d.drawLine(p3.x, p3.y, p4.x, p4.y);

        g2d.setColor(Color.BLACK);
        int i = checkIntersectionOfTwoLineSegments(p1, p2, p3, p4);
        g2d.drawString("Задание: Два отрезка прямых заданные координатами концов. Определить взаимное расположение отрезков.", 5, 50);
        switch (i) {
            case 0:
                g2d.drawString("Ответ: Не пересекаются", 100, 100);
                break;
            case 1:
                g2d.drawString("Ответ : Параллельны", 100, 100);
                break;
            case 2:
                g2d.drawString("Ответ: Пересекаются", 100, 100);
                break;
        }

        super.repaint();

    }

    private void inputData(int x1, int y1, int x2, int y2, int x21, int y21, int x22, int y22) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x21, y21);
        p4 = new Point(x22, y22);
    }

    //метод, проверяющий пересекаются ли 2 отрезка [p1, p2] и [p3, p4]
    private int checkIntersectionOfTwoLineSegments(Point p1, Point p2, Point p3, Point p4) {
        if (p2.x < p1.x) {
            Point tmp = p1;
            p1 = p2;
            p2 = tmp;
        }

        if (p4.x < p3.x) {

            Point tmp = p3;
            p3 = p4;
            p4 = tmp;
        }

        if ((p2.x < p3.x) && (p1.x - p2.x == 0) && (p3.x - p4.x == 0)) {
            return 1;
        }

        if (p2.x < p3.x) {
            return 0;
        }

        if ((p1.x - p2.x == 0) && (p3.x - p4.x == 0)) {

            if (p1.x == p3.x) {

                if (!((Math.max(p1.y, p2.y) < Math.min(p3.y, p4.y)) ||
                        (Math.min(p1.y, p2.y) > Math.max(p3.y, p4.y)))) {
                    return 2;
                }
            }
            return 0;
        }

        if (p1.x - p2.x == 0) {

            double Xa = p1.x;
            double A2 = (p3.y - p4.y) / (p3.x - p4.x);
            double b2 = p3.y - A2 * p3.x;
            double Ya = A2 * Xa + b2;

            if (p3.x <= Xa && p4.x >= Xa && Math.min(p1.y, p2.y) <= Ya &&
                    Math.max(p1.y, p2.y) >= Ya) {
                return 2;
            }
            return 0;
        }

        if (p3.x - p4.x == 0) {

            double Xa = p3.x;
            double A1 = (p1.y - p2.y) / (p1.x - p2.x);
            double b1 = p1.y - A1 * p1.x;
            double Ya = A1 * Xa + b1;

            if (p1.x <= Xa && p2.x >= Xa && Math.min(p3.y, p4.y) <= Ya &&
                    Math.max(p3.y, p4.y) >= Ya) {
                return 2;
            }
            return 0;
        }

        double A1 = (p1.y - p2.y) / (p1.x - p2.x);
        double A2 = (p3.y - p4.y) / (p3.x - p4.x);
        double b1 = p1.y - A1 * p1.x;
        double b2 = p3.y - A2 * p3.x;

        if (A1 == A2) {
            return 1;
        }

        double Xa = (b2 - b1) / (A1 - A2);

        if ((Xa < Math.max(p1.x, p3.x)) || (Xa > Math.min(p2.x, p4.x))) {
            return 0;
        } else {
            return 2;
        }
    }
}
