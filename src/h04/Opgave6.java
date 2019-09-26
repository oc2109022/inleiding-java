package h04;

import java.awt.*;
import java.applet.*;


public class Opgave6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.fillOval(70,80,140,320);
        g.setColor(Color.red);
        g.fillOval(100,100,80,80);
        g.setColor(Color.yellow);
        g.fillOval(100,200,80,80);
        g.setColor(Color.green);
        g.fillOval(100,300,80,80);
    }
}
