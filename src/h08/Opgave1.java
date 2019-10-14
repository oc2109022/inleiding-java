package h08;

import java.awt.*;
import java.applet.*;
import java.awt.Button.*;

 public class Opgave1 extends Applet {
     Label label;
     TextField tekst;
     Button button1;
     Button button2;

     public void init() {
         button1 =  new Button();
         button1.setLabel("Ok");
         Button1Listener bl = new Button1Listener();
         button1.addActionListener( bl );
         add(button1);
         button2 = new Button();
         button2.setLabel("Reset");
         Button2Listener bl2 = new Button2Listener();
         button2.addActionListener( bl );
         add(button2);
     }
 }


