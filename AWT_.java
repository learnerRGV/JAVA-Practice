import java.awt.*;
public class AWT_ {
    public static void main(String[] args){
        Frame f=new Frame("My first app");      //first create components then add it to layout
                                                     //choose what action is to be performed by them
        f.setLayout(new FlowLayout());

        TextField tf=new TextField(20);
        Label l =new Label("Name");
        Button b = new Button("OK");

        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
