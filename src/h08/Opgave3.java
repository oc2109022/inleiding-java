package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave3 extends Applet {
    Button knop;
    TextField tekst;


    public void init() {
        tekst = new TextField("", 20);
        knop = new Button();
        knop.addActionListener( new KnopListener() );
        knop.setLabel("Ok");
        add(tekst);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("2", 20, 20);
    }

    class KnopListener implements ActionListener {
     public void actionPerformed( ActionEvent e ) {


      }
     }
}
