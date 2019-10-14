package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave2 extends Applet {
    Button knop;
    String schermtekst;


    public void init() {
        knop = new Button();
        knop.setLabel("Reset");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
         g.drawString(schermtekst, 50, 60);
         g.drawLine( 1, 70, 400, 70);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "Ja, dit doet eindelijk wel iets";

        }
    }
}
