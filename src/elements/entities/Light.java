package elements.entities;

import java.awt.*;

public class Light {
    private Light () {

    }

    public static void draw(Graphics2D g) {
        var color = g.getColor();
        var paint = g.getTransform();

        g.setColor(new Color(255, 236, 166, 79));
        g.fillOval(-70, 200, 300, 300);
        g.setPaint(new LinearGradientPaint(112f, 200f, 112f, 0f,
                        new float[]{0.25f, 0.75f},
                        new Color[]{new Color(253, 191, 58, 105), new Color(0,0,0,0)}));
        g.fillRect(65, 0,30, 200);
        g.setPaint(new LinearGradientPaint(112f, 200f, 112f, -150f,
                        new float[]{0.25f, 0.75f},
                        new Color[]{new Color(253, 191, 58, 92), new Color(0,0,0,0)}));
        g.rotate(7, -70 + 150, 200 + 150);
        g.fillRect(65, -150,30, 350);
        g.setPaint(new LinearGradientPaint(112f, 200f, 112f, -750f,
                        new float[]{0.25f, 0.75f},
                        new Color[]{new Color(253, 191, 58, 100), new Color(0,0,0,0)}));
        g.rotate(0.85, -70 + 150, 200 + 150);
        g.fillRect(65, -550,30, 750);
        g.setColor(color);
        g.setTransform(paint);
    }
}
