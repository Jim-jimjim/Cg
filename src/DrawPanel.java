import elements.Field.Field;
import elements.Sky.Sky;
import elements.entities.Archer;
import elements.entities.Light;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel  extends JPanel implements ActionListener {
    Timer t = new Timer(15, this);

    public DrawPanel() {
        t.start();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Sky.draw(g);
        Field.draw(g);
        Light.draw(g);
        Archer.draw(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
