import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class awtbutton {

    static class Myframe extends Frame implements ActionListener {

        int count = 0;
        Label l;
        Button b;

        public Myframe() {
            super("Button demo");
            l = new Label("   " + count);
            b = new Button("Click");
            b.addActionListener(this);
            setLayout(new FlowLayout());
            add(l);
            add(b);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            l.setText("   " + count);
        }
    }
    public static void main(String[] args){

        Myframe fm = new Myframe();
        fm.setSize(400,400);
        fm.setVisible(true);
    }
}
