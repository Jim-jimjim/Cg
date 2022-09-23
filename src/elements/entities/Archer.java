package elements.entities;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Archer {

    private static double multi = 0;

    private static Polygon drawAnimation(){
        int[] x = new int[70 * 2 + 1];
        int[] y = new int[70 * 2 + 1];
        for (int i = 0; i < 70; i++) {
            x[i]= 665 - i;
            y[i]= (int) (350 + (int)((double) 3 * Math.sin((i + multi / 2) * 0.1)) + i / (double) 10);
            x[70 * 2 - i]= 665 - 30;
            y[70 * 2 - i]= 350 - 20;
        }
        x[70] = 665 - 70 + 20;
        y[70] = 350 - 20 + (int)((double) 3 * Math.sin((70) * 0.1));

        if (multi >= -7200) multi--; else multi = 0;

        return new Polygon(x, y, 70 *2+1);
    }

    public static void draw(Graphics2D g) {
        var color = g.getColor();

        g.setColor(Color.BLACK);
        g.fillRect(618, 347, 5, 23);
        g.fillRect(625, 347, 5, 23);

        g.setColor(new Color(79, 35, 35));
        g.fillPolygon(drawAnimation());


        GeneralPath path = new GeneralPath();
        path.moveTo(614.0, 332.0);
        path.lineTo(618.0, 322.0);
        path.lineTo(630.0, 322.0);
        path.lineTo(636.0, 332.0);
        g.fill(path);
        path.reset();
        path.moveTo(618.0, 322.0);
        path.lineTo(619.0, 307.0);
        path.lineTo(623.0, 305.0);
        path.lineTo(626.0, 305.0);
        path.lineTo(629.0, 307.0);
        path.lineTo(630.0, 323.0);
        g.fill(path);
        path.reset();

        var stroke = g.getStroke();
        g.setStroke(new BasicStroke(3));
        path.moveTo(619.0, 308.0);
        path.lineTo(615, 312);
        path.lineTo(619, 317);
        g.draw(path);
        path.reset();
        path.moveTo(628.0, 307.0);
        path.lineTo(633, 313);
        path.lineTo(628, 319);
        g.draw(path);
        path.reset();
        g.setStroke(stroke);

        g.setColor(new Color(211,211,211));
        g.fillOval(622, 300, 5, 5);

        g.setColor(color);
    }

}
