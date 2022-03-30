import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.*;

class frame1 extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public  frame1(){
        super("Flow layout demo");
        b1 =new Button("One");
        b2 =new Button("Two");
        b3 =new Button("Three");
        b4 =new Button("Four");
        b5 =new Button("Five");
        b6 =new Button("Six");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
        gbc.gridx=1;
        gbc.gridy=1;                 //---->giving positions as constraints
        add(b1,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(b2,gbc);
        gbc.gridx=3;
        gbc.gridy=3;
        add(b3,gbc);
        gbc.gridx=4;
        gbc.gridy=4;
        add(b4,gbc);
        gbc.gridx=5;
        gbc.gridy=5;
        add(b5,gbc);
        gbc.gridx=6;
        gbc.gridy=6;
        add(b6,gbc);


//        FlowLayout fl = new FlowLayout();               //-----> used for flowlayout
//        fl.setAlignment(FlowLayout.CENTER);
//        setLayout(fl);
////        add(b1,BorderLayout.EAST);
//        add(b2,BorderLayout.WEST);
//        add(b3,BorderLayout.NORTH);                 //----->for flow+grid combo
//        add(b4,BorderLayout.SOUTH);
//        add(b5,BorderLayout.CENTER);

//        Panel p = new Panel();                       //----->panel is also like a container
//        p.setLayout(new GridLayout(3,1));
//        p.add(new Button("Jan"));
//        p.add(new Button("Feb"));
//        p.add(new Button("March"));
//        add(p,BorderLayout.EAST);
////        add(b6);
    }
}

public class layout {
    public static void main(String[] args){
          frame1 f = new frame1();
          f.setSize(500,500);
          f.setVisible(true);

    }
}
