package h06;

import java.awt.*;
import java.applet.*;


public class OpgaveCijfers extends Applet {
    int a, b, c;
    double uitkomst;
    int teller;


    public void init() {
        a = 110;
        b = 3;
        c = 4;
        uitkomst = (a + b) / c;
        teller = 0;
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.drawString("We krijgen alle vier! : " + uitkomst, 40, 40);
        teller++;
    }
}