package h02;

import java.awt.*;
import java.applet.*;

public class Opgave3 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.blue);
        g.drawString("Omar", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Chabab", 50, 120);
    }
}
