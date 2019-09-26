package h04;

import java.awt.*;
import java.applet.*;


public class Opgave3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawRect(50,120,150,55);
        g.fillRect(50,120,150,55);
        g.setColor(Color.white);
        g.drawRect(50,185,150,55);
        g.fillRect(50,185,150,55);
        g.setColor(Color.red);
        g.drawRect(50,250,150,55);
        g.fillRect(50,250,150,2000);
        g.drawLine(50,120,50,400);
    }
}
