package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave4 extends Applet {
    TextField tekst1;
    Label label1;
    Label label2;
    Label label3;
    String a, tekst;


    public void init() {
        tekst1 = new TextField("", 20);
        label1 = new Label("Typ hier uw Getal");
        label2 = new Label("2de Getal hier typen");
        label3 = new Label("3de Getal hier typen");
        tekst1.addActionListener(new Tekst1Listener());
        tekst = "";
        add(label1);
        add(tekst1);
    }
    public void paint (Graphics g) {
        g.drawString("Hier Typen", 50, 70);
        g.drawString("Hier Ook Typen", 100, 70);

    }

        class Tekst1Listener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                repaint();



        }


    }
}