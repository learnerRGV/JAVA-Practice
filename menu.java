import sun.font.TextLabel;

import java.awt.*;
import java.awt.event.*;

class frame2 extends Frame{
    Menu file,sub;
    MenuItem open,save,insert,close,close_all;
    TextField tf;

    frame2(){
        tf=new TextField(20);
        open=new MenuItem("Open");
        save=new MenuItem("save");
        insert=new MenuItem("Insert");
        close=new MenuItem("Close");
        close_all = new MenuItem("Close all");
        file=new Menu("File");
        sub = new Menu("End");
        sub.add(close);
        sub.add(close_all);
        file.add(open);
        file.add(save);
        file.add(insert);
        file.add(sub);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae)->tf.setText("Open"));                 //using lambda expression
        save.addActionListener((ActionEvent ae)->tf.setText("Save"));                 //using lambda expression
        insert.addActionListener((ActionEvent ae)->tf.setText("Insert"));             //using lambda expression
        close.addActionListener((ActionEvent ae)->tf.setText("close"));               //using lambda expression
        close_all.addActionListener((ActionEvent ae)->tf.setText("close all"));       //using lambda expression

    }

}


public class menu {
    public static void main(String[] args) {
        frame2 f = new frame2();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}