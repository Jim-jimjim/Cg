package elements.Sky;

import java.awt.*;
import java.util.ArrayList;

public class Sky {
    private Sky() {
    }

    public static void draw(Graphics2D g) {
        Paint old = g.getPaint();
        g.setPaint(new LinearGradientPaint(0, 0, 1280, 0,
                new float[]{0.1f, 0.5f},
                new Color[]{new Color(224, 218, 199),
                            new Color(98, 133, 178)}));
        g.fillRect(0, 0, 1280, 720);
        g.setPaint(old);

        ArrayList<Cloud> list = new ArrayList<>();
        list.add(new Cloud(325, 100, 200, Color.DARK_GRAY));
        list.add(new Cloud(94, 283, 180, Color.DARK_GRAY));
        list.add(new Cloud(86, 357, 190, Color.DARK_GRAY));
        list.add(new Cloud(42, 410, 200, Color.DARK_GRAY));
        list.add(new Cloud(328, 300, 210, Color.DARK_GRAY));
        list.add(new Cloud(400, 355, 170, Color.DARK_GRAY));
        list.add(new Cloud(535, 295, 175, Color.DARK_GRAY));
        list.add(new Cloud(582, 351, 200, Color.DARK_GRAY));
        list.add(new Cloud(743, 292, 150, Color.DARK_GRAY));
        list.add(new Cloud(808, 358, 200, Color.DARK_GRAY));
        list.add(new Cloud(857, 315, 180, Color.DARK_GRAY));
        list.add(new Cloud(910, 369, 170, Color.DARK_GRAY));
        list.add(new Cloud(970, 338, 170, Color.DARK_GRAY));
        list.add(new Cloud(1044, 398, 185, Color.DARK_GRAY));
        list.add(new Cloud(1110, 316, 200, Color.DARK_GRAY));
        list.add(new Cloud(1214, 294, 200, Color.DARK_GRAY));
        list.add(new Cloud(1174, 388, 180, Color.DARK_GRAY));
        list.add(new Cloud(0, 100, 200, new Color(148, 116, 58)));
        list.add(new Cloud(650, 75, 200, new Color(82, 78, 78)));
        list.add(new Cloud(400, -10, 150, new Color(103, 103, 103)));
        list.add(new Cloud(650, -50, 200, new Color(96, 96, 96)));
        list.add(new Cloud(-25, 0, 100, new Color(183, 174, 138)));
        list.add(new Cloud(0, 50, 100, new Color(138, 118, 56)));
        list.add(new Cloud(-10, 125, 100, new Color(124, 107, 79)));
        list.add(new Cloud(75, 0, 100, new Color(94, 89, 80)));
        list.add(new Cloud(100, 75, 100, new Color(124, 96, 82)));
        list.add(new Cloud(220, -10, 100, new Color(114, 114, 114)));
        list.add(new Cloud(250, 50, 100, new Color(119, 116, 116)));
        list.add(new Cloud(350, 25, 100, new Color(136, 132, 132)));
        list.add(new Cloud(450, 100, 150, new Color(110, 104, 104)));
        list.add(new Cloud(1000, -10, 150, new Color(115, 115, 115)));
        list.add(new Cloud(1050, 150, 125, new Color(77, 75, 75)));
        list.add(new Cloud(550, 125, 100, new Color(82, 78, 78)));
        list.add(new Cloud(750, 20, 100, new Color(82, 78, 78)));
        list.add(new Cloud(850, 200, 125, new Color(82, 78, 78)));
        list.add(new Cloud(950, 150, 50, new Color(82, 78, 78)));
        list.add(new Cloud(1050, 50, 120, new Color(82, 78, 78)));
        for (Cloud c: list) c.draw(g);

        var color = g.getColor();
        g.setColor(new Color(253, 191, 58, 121));
        g.fillOval(-30, 300, 150, 150);
        g.setColor(new Color(255, 174, 0, 199));
        g.fillOval(0, 355, 50, 50);
        g.setColor(color);
    }
}
