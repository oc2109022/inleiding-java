package h08;

import java.awt.*;
import java.applet.*;
import java.awt.Button.*;


public class Opgave1 extends Applet {
    Button knop;
    Button knop2;

    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        knop2 = new Button();
        knop2.setLabel("Click");
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString( "ik", 20, 20 );
    }
}