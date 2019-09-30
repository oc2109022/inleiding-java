package h05;

import java.awt.*;
import java.applet.*;

public class Opgave1 extends Applet {

    public void init() {
        setBackground(Color.white);


    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.drawRect(10, 30, 300, 200);
        g.drawString("Een Rechthoek",120, 245);
        g.setColor(Color.magenta);
        g.fillRect(400, 30, 300, 200);
        g.setColor(Color.BLACK);
        g.drawOval(400, 30, 299, 199);
        g.drawString("Een Ovaal met een magenta rechthoek",  450, 250);
        g.drawLine(5, 5, 300, 5);
        g.drawString("Een Lijn/Streep", 120, 20);
        g.drawRoundRect( 10, 250, 300, 200, 50, 50);
        g.drawString("een Afgeronde rechthoek", 100, 465);
        g.setColor(Color.magenta);
        g.fillOval(400, 260, 300, 200);
        g.setColor(Color.black);
        g.drawString("Dit is een Gevulde Ovaal",480, 475);
        g.drawOval(850, 260, 200, 200);
        g.drawString("Een Cirkel",920, 480);
        g.drawOval(850,30,300,200);
        g.fillArc(915,40,235,220,360,90);
        g.drawString("Dit is een taartpunt",905, 250);

     }
}
