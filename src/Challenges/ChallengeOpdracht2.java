package Challenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class ChallengeOpdracht2 extends Applet{
    Button button;
    double Fris;
    double Bier;
    double Wijn;
    double Koffie;
    double Binngedist;
    double Buitgedist;
    double bestelingdag;
    double totaldag;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    String besttotal;
    String totdag;

    public void init() {
        button = new Button();
        button.setLabel("Fris");
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);
        add(button);
        button2 = new Button();
        button2.setLabel("Bier");
        add(button2);
        button3 = new Button();
        button3.setLabel("Wijn");
        add(button3);
        button4 = new Button();
        button4.setLabel("Koffie");
        add(button4);
        button5 = new Button();
        button5.setLabel("Binn Gedist.");
        add(button5);
        button6 = new Button();
        button6.setLabel("Buit Gedist.");
        add(button6);
        button7 = new Button();
        button7.setLabel("Nieuwe Bestelling");;
        add(button7);

        Fris = 2.25;
        Bier = 2.50;
        Wijn = 2.75;
        Koffie = 2;
        Binngedist = 3;
        Buitgedist = 3.75;
}

    public void paint(Graphics g) {
        g.drawString("Bestelling Totaal:" + besttotal, 50, 110);
        g.drawString("Totaal dagomzet:" + totdag, 50, 80);
    }


    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            besttotal = ("" + Fris);
            besttotal = ("" + Bier);
            besttotal = ("" + Wijn);
            besttotal = ("" + Binngedist);
            besttotal = ("" + Buitgedist);
            totdag = ("" + besttotal);
        }

    }

}


