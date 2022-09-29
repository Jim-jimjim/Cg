package elements.Field;

import elements.Swords.Sword;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private Field() {
    }

    public static void draw(Graphics2D g) {
        earth(g);
        swords(g);
    }

    private static void earth(Graphics2D g) {
        Color c = g.getColor();
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

        g.setColor(new Color(21, 13, 7));
        g.fillRect(450, 436, 150, 5);
        g.fillRect(721, 568, 150, 5);
        g.fillRect(1037, 506, 150, 5);
        g.fillRect(101, 530, 150, 5);
        g.fillRect(821, 455, 150, 5);
        g.fillRect(1052, 631, 150, 5);
        g.fillRect(214, 631, 150, 5);

        g.setColor(new Color(253, 252, 245, 137));
        GeneralPath path1 = new GeneralPath();
        path1.moveTo(553.0, 375.0);
        path1.lineTo(405.0, 679.0);
        path1.lineTo(791.0, 676.0);
        path1.lineTo(682.0, 375.0);

        g.fill(path1);
        g.draw(path1);


        g.setColor(c);
    }

    private static void swords(Graphics2D g) {
        List<Sword> swords = new ArrayList<>();
        swords.add(new Sword(350, 350,50, false));
        swords.add(new Sword(120, 600,40, false));
        swords.add(new Sword(1030, 380,60, false));
        swords.add(new Sword(750, 430,55, false));
        swords.add(new Sword(100, 450,30, false));

        swords.add(new Sword(279, 438,30, false));
        swords.add(new Sword(98, 474,30, false));
        swords.add(new Sword(32, 482,30, false));
        swords.add(new Sword(65, 551,30, false));
        swords.add(new Sword(169, 553,30, false));
        swords.add(new Sword(225, 594,30, false));
        swords.add(new Sword(335, 537,30, false));
        swords.add(new Sword(822, 429,30, false));
        swords.add(new Sword(884, 459,30, false));
        swords.add(new Sword(866, 575,30, false));
        swords.add(new Sword(1005, 586,30, false));
        swords.add(new Sword(1028, 477,30, false));
        swords.add(new Sword(1147, 531,30, false));
        swords.add(new Sword(1196, 611,30, false));

        swords.add(new Sword(796, 403,30, false));
        swords.add(new Sword(944, 421,30, false));
        swords.add(new Sword(1100, 433,30, false));
        swords.add(new Sword(1081, 527,30, false));
        swords.add(new Sword(1219, 520,30, false));
        swords.add(new Sword(307, 395,30, false));
        swords.add(new Sword(441, 383,30, false));
        swords.add(new Sword(152, 430,30, false));
        swords.add(new Sword(983, 474,30, false));
        swords.add(new Sword(1011, 417,30, false));
        swords.add(new Sword(1229, 430,30, false));

        for (Sword s : swords) s.draw(g);
        swords.clear();


        swords.add(new Sword(190, 400,60, false));
        swords.add(new Sword(900, 500, 57, true));
        swords.add(new Sword(900, 370,30, false));
        swords.add(new Sword(1160, 405,27, false));
        swords.add(new Sword(45, 540,33, false));
        swords.add(new Sword(700, 420,30, false));
        for (Sword s : swords) s.draw(g, 6);
        swords.clear();

        swords.add(new Sword(385, 400,80, true));
        swords.add(new Sword(190, 470,50, false));
        swords.add(new Sword(450, 400,40, false));
        swords.add(new Sword(840, 400,50, false));
        swords.add(new Sword(1170, 545,55, false));
        for (Sword s : swords) s.draw(g, 0.3);
        swords.clear();
    }
}
