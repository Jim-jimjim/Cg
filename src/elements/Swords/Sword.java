package elements.Swords;

import java.awt.*;

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

    public void draw(Graphics2D g) {
        g.drawRect(x,y,length,height);

        g.fillOval((int) (x + length / 2 - length * 0.25), y, (int) (length* 0.5), (int) (length * 0.5));
        g.fillRect((int) (x - length * 0.15), y + length / 2, (int) (length * 0.15), height / 4);
    }
}
