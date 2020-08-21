package UI;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame w = new JFrame("Окно с изображением");

        w.setSize(400,400);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.setLayout(new BorderLayout(1,1));

        Canvas canvas = new Canvas();

        w.add(canvas);

        w.setVisible(true);

    }
}

class Canvas extends JComponent{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        int obj1_x1 = 100;
        int obj1_y1 = 100;
        int obj1_length = 30;
        int obj1_height = 50;

        g2d.setPaint(Color.BLUE);
        g2d.drawRect(obj1_x1,obj1_y1,obj1_length, obj1_height);

        int obj2_x1 = 100;
        int obj2_y1 = 89;
        int obj2_length = 100 ;
        int obj2_height = 10;

        g2d.setColor(Color.RED);
        g2d.fillRect(obj2_x1, obj2_y1, obj2_length,obj2_height);

        if(((obj1_x1 + obj1_length) >= obj2_x1) && (obj1_x1 <= (obj2_x1 + obj2_length)) && ((obj1_y1 + obj1_height) >= obj2_y1) && (obj1_y1 <= (obj2_y1 + obj2_height)))
        {
            g2d.drawString("Пересекаются", 10, 20);
        }else {
            g2d.drawString("Не пересекаются", 10, 20);
        }
        super.repaint();
    }
}
