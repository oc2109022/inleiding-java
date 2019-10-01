package h06;


import java.awt.*;
import java.applet.*;


public class Opgave2 extends Applet {
    int a, b, c;
    double Seconden;
    double Minuut;
    double Uur;


    public void init() {
        a = 60;
        b = 60;
        c = 24;
        Seconden = a;
        Minuut = b;
        Uur = c;
    }

    public void paint(Graphics g) {
        g.drawString("1 minuut is: " + Seconden , 20, 20);
        g.drawString("1 uur is: " + Minuut , 40, 40);
        g.drawString("1 dag is: " + Uur , 60, 60);
        System.out.println("Hello World!");
    }
}
