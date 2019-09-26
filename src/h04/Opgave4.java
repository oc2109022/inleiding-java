package h04;

import java.awt.*;
import java.applet.*;


public class Opgave4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.orange);
        g.fillRect(50,50,100,400);
        g.setColor(Color.red);
        g.fillRect(150,100,100,350);
        g.setColor(Color.magenta);
        g.fillRect(250,210,100,240);
        g.setColor(Color.black);
        g.drawString("Jeroen 100KG",60, 430);
        g.drawString("Hans 80KG",170,430);
        g.drawString("Valerie 40KG", 270, 430);
    }
}