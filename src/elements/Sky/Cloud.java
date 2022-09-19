package elements.Sky;

import java.awt.*;

public class Cloud {
    private final int x;
    private final int y;
    private final int length;
    private final int height;
    private final Color c;

    public Cloud(int x, int y, int size, Color c) {
        this.x = x;
        this.y = y;
        this.length = 2 * size;
        this.height = size;
        this.c = c;
    }

    public void draw(Graphics2D g) {
        Color old = g.getColor();
        g.setColor(c);
        int r = length / 4;
        g.fillOval(x, y + height / 4, (int) (r * 1.5), (int) (r * 1.5));
        g.fillOval((int) (x + r * 1.25), y + height / 4, (int) (r * 1.5), (int) (r * 1.5));
        g.fillOval((int) (x + r * 2.5), y + height / 4, (int) (r * 1.5), (int) (r * 1.5));
        g.fillOval((int) (x + r * 0.75), y, (int) (r * 1.5), (int) (r * 1.5));
        g.fillOval(x + 2 * r, y, (int) (r * 1.5), (int) (r * 1.5));
        g.fillOval((int) (x + (1.5 * r)), (int) (y + r * 0.1), r, r);
        g.fillOval((int) (x + r * 0.75), (int) (y + height / 2.2), r, r);
        g.fillOval(x + 2 * r, (int) (y + height / 2.2), r, r);
        g.setColor(old);
    }
}
