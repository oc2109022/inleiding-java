package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;


public class Opgave1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 170, 20);
        g.drawLine(270,120,170, 20);
    }
}

