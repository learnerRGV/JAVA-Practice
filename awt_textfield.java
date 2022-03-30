import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class Txt extends Frame implements TextListener,ActionListener{

    Label l1;
    Label l2;
    TextField tf;
    Button b;
    Txt(){
        super("Textfield demo");
        l1 = new Label("Enter something in the box");
        l2 = new Label("Hit the enter button");
        tf = new TextField(20);
        b  = new Button("Click");
        tf.addTextListener(this);
        tf.addTextListener(this);
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
        add(b);
    }
    public void textValueChanged(TextEvent e){
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent eb) {
        l2.setText(tf.getText());
        l2.setText("Done");
    }



}

public class awt_textfield {
public static void main(String[] args){
    Txt t = new Txt();
    t.setSize(400,400);
    t.setVisible(true);

}
}
