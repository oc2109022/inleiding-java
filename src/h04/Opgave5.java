package h04;

import java.awt.*;
import java.applet.*;


public class Opgave5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(190, 100, 360,360,360,360);
    }
}
