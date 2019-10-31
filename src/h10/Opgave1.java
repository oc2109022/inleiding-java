package h10;


        import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

public class Opgave1 extends Applet {
    TextField tekst1;
    Label label1;
    String s, tekst;
    int cijfers;

    public void init() {
        tekst1 = new TextField("", 20);
        label1 = new Label("Typ hier uw cijfers");
        tekst1.addActionListener( new Tekst1Listener());
        tekst = "";
        add(label1);
        add(tekst1);
    }

    public void paint (Graphics g){
        g.drawString(s, 50, 60);
    }

    class Tekst1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekst1.getText();
            cijfers = Integer.parseInt( s);
            repaint(cijfers);
        }
    }
}





