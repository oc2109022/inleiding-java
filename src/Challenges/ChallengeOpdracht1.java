package Challenges;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class ChallengeOpdracht1 extends Applet {
    TextField tekst;
    TextField tekst2;
    TextField tekst3;
    Button knop;
    Color Colourfill;
    int Breedte;
    int HoogteV;
    int HoogteJ;
    int HoogteH;
    Label label1;
    Label label2;
    Label label3;

    public void init() {
        Colourfill = Color.red;
        Breedte = 90;
        knop = new Button("Toon");
        knop.addActionListener ( new KnopListener() );
        add(knop);
        tekst = new TextField("Type hier", 20);
        tekst2 = new TextField( "Type hier", 20);
        tekst3 = new TextField( "Type hier", 20);
        label1 = new Label("Valerie");
        add(label1);
        label2 = new Label("Jeroen");
        add(label2);
        label3 = new Label ("Hans");
        add(tekst);
    }

    public void paint(Graphics g) {
        g.setColor(Colourfill);
        g.fillRect(100, 200, Breedte, HoogteV);
        g.setColor(Colourfill);
        g.fillRect(150, 200, Breedte, HoogteJ);
        g.setColor(Colourfill);
        g.fillRect(200, 200, Breedte, HoogteH);
        g.setColor(Colourfill);
        g.drawLine(20, 80, 20, 200);
        g.drawLine(20, 180, 25, 180);
        g.drawLine(20, 160, 25, 160);
        g.drawLine(20, 140, 25, 140);
        g.drawLine(20, 120, 25, 120);
        g.drawLine(20, 100, 25, 100);
        g.drawLine(20, 80, 25, 80);
        g.drawString("20", 20, 180);
        g.drawString("40", 20, 160);
        g.drawString("60", 20, 140);
        g.drawString("80", 20, 120);
        g.drawString("100", 20, 100);
        g.drawString("120", 20, 80);
    }
        class KnopListener implements ActionListener	{
            public void actionPerformed( ActionEvent e ) {
                String s = tekst.getText();
                String w = tekst2.getText();
                String r = tekst3.getText();
                HoogteH = Integer.parseInt(s);
                HoogteJ = Integer.parseInt(w);
                HoogteV = Integer.parseInt(r);
            }



    }
}
