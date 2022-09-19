import elements.Field.Field;
import elements.Sky.Cloud;
import elements.Sky.Sky;
import elements.Swords.Sword;

import javax.swing.*;
import java.awt.*;

public class DrawPanel  extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
//
//        Sword sword = new Sword(0, 0, 100, Color.BLACK, false);
//        sword.draw(g);
        Sky.draw(g);
        Field.draw(g);
    }
}
