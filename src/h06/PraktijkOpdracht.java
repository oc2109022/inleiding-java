package h06;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    double a, b, c;
    double uitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = a + b + c / 3;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: 6.3666666", 20, 20);
    }
}

