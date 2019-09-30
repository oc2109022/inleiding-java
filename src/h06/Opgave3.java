package h06;

import java.awt.*;
import java.applet.*;


    public class Opgave3 extends Applet {
        int a;
        int b;
        int uitkomst;

        public void init() {
            a = 10;
            b = 11;
            uitkomst = a / b;
        }

        public void paint(Graphics g) {
            g.drawString("2 positieve met 1 negatief: " + uitkomst, 20, 20);
        }
    }
