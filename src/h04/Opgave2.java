package h04;

import java.awt.*;
import java.applet.*;


public class Opgave2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 170, 20);
        g.drawLine(270,120,170, 20);
        g.drawRect(50,120,220,120);
        g.drawRect(90,170,50,70);
        g.drawRect(210, 150, 25, 25);
    }
}