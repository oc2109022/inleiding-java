package h02;

import java.awt.*;
import java.applet.*;

public class Opgave2 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Omar", 50, 60 );
    }
}
