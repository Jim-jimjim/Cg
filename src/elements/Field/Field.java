package elements.Field;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Field {
    private Field() {
    }

    public static void draw(Graphics2D g) {
        earth(g);

    }

    private static void earth(Graphics2D g) {
        g.setColor(new Color(37, 24, 13));
        GeneralPath path = new GeneralPath();
        path.moveTo(0, 450);
        path.lineTo(425, 390);
        path.curveTo(481.0, 383.0, 620.0, 350.0, 783, 386.0);
        path.lineTo(1280, 450);
        path.lineTo(1280, 720);
        path.lineTo(0, 720);
        path.closePath();
        g.fill(path);
        g.draw(path);
    }
}
