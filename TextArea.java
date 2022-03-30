import java.awt.*;
import java.awt.event.*;

class myframe extends Frame {

     TextArea ta;

    myframe() {
        ta = new TextArea();
        setLayout(new FlowLayout());
    }

}
public class TextArea {
public static void main(String[] args){
    myframe f = new myframe();
    f.setSize(500,500);
    f.setVisible(true);
}



}
