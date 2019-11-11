package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave3 extends Applet {
    TextField tekst1;
    Label label1;
    String a, tekst;


        public void init() {
        tekst1 = new TextField("", 20);
        label1 = new Label("Typ hier uw Getal");
        tekst1.addActionListener(new Tekst1Listener());
        tekst = "";
        add(label1);
        add(tekst1);
    }
        public void paint (Graphics g) {

            g.drawString("Hier", 50, 70);
        }

        class Tekst1Listener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
               if ( s > 10 ) {



                }


        }
    }





























}
