import java.awt.*;
import java.awt.event.*;

 class key_ev extends Frame implements KeyListener{
    Label l1,l2,l3;
    key_ev(){
        super("Key event demo");
        l1=new Label("Hit any key to Know it's ASCII Code");
        l2=new Label("");
        l3=new Label("");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        l1.setBounds(150,40,190,60);
        l2.setBounds(190,100,190,30);
        l3.setBounds(190,150,100,30);
        addKeyListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e){
                dispose();
            }
        });

    }

     @Override
     public void keyTyped(KeyEvent e) {

     }

     @Override
     public void keyPressed(KeyEvent e) {
        l2.setText("Key pressed: "+e.getKeyChar());
        l3.setText("ASCII code:  "+e.getKeyCode());
     }

     @Override
     public void keyReleased(KeyEvent e) {
//      l1.setText("");
     }
 }
public class key_event {
    public static void main(String[] args){

        key_ev k = new key_ev();
        k.setSize(500,500);
        k.setVisible(true);
    }
}
