package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opgave1 extends Applet {
    TextField tekst;
    Button button1;
    Button button2;
    double getal;
    String s;

    public void init() {
        tekst = new TextField();
        add(tekst);
        button1 = new Button();
        button1.setLabel("Ok");
        Button1Listener bl = new Button1Listener();
        button1.addActionListener(bl);
        add(button1);
        button2 = new Button();
        button2.setLabel("Reset");
        Button2Listener b2 = new Button2Listener();
        button2.addActionListener(b2);
        add(button2);

    }

    public void paint(Graphics g) {
        g.drawString(s, 20, 30);
        g.drawString(getal, 30,20);

    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = Double.parseDouble( s );
            String s = tekst.getText();


        }

    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }
}



