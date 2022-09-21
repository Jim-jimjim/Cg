package elements.Swords;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Sword {
    private final int x;
    private final int y;
    private final int length;
    private final int height;
    private final Color c;

    public Sword(int x, int y, int size, Color c, boolean shorty) {
        this.x = x;
        this.y = y;
        this.height = 4 * size;
        this.c = c;
        if (!shorty) {
            this.length = size / 2;
        } else {
            this.length = size;
        }
    }

    public Sword(int x, int y, int size, boolean shorty) {
        this.x = x;
        this.y = y;
        this.height = 4 * size;
        this.c = Color.BLACK;
        if (!shorty) {
            this.length = size / 2;
        } else {
            this.length = size;
        }
    }

    public void draw(Graphics2D g) {
        Color old = g.getColor();
        g.setColor(c);

        sw(g);

        g.setColor(old);
    }

    private void sw(Graphics2D g) {
        g.fillOval((int) (x + length / 2 - length * 0.25), y, (int) (length* 0.5), (int) (length * 0.5));
        g.fillRect((int) (x + length * 0.5 - length * 0.07), y + length / 2, (int) (length * 0.15), height / 4);
        g.drawArc(x,  (int) (y + length * 0.5) + height / 4, length, height / 12, 0, 180);
        g.fillRect((int) (x + length * 0.5 - length * 0.15), y + length / 2 + height / 4, (int) (length * 0.3), (int) (height / 1.5));
    }

    public void draw(Graphics2D g, double rotate) {
        Color old = g.getColor();
        g.setColor(c);
        AffineTransform a = g.getTransform();
        g.rotate(rotate, x, y);

        sw(g);

        g.setTransform(a);
        g.setColor(old);
    }
}
