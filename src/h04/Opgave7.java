package h04;

import java.awt.*;
import java.applet.*;


public class Opgave7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(120, 120, 400, 400, 85, 85);
        g.fillOval(140, 400, 100, 100);
        g.fillOval(140, 160, 100, 100);
        g.fillOval(385, 160, 100, 100);
        g.fillOval(385, 400, 100, 100);
        g.fillOval(270,290,100,100);

    }
}