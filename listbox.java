import java.awt.TextArea;
import java.awt.event.*;
import java.awt.*;

class list extends Frame implements ItemListener,ActionListener{

    List L;
    Choice c;
    TextArea ta;
    list(){
        super("List Example");

        L = new List(3,true);
        c = new Choice();
        ta = new TextArea(20,30);

        L.add("January");
        L.add("February");
        L.add("March");
        L.add("April");
        L.add("May");
        L.add("June");
        L.add("July");
        L.add("August");
        L.add("September");
        L.add("October");
        L.add("November");
        L.add("December");

        c.add("Sunday");
        c.add("Monday");
        c.add("tuesday");
        c.add("Wednesday");
        c.add("Friday");
        c.add("Saturday");
        setLayout(new FlowLayout());
        add(L);
        add(c);
        add(ta);

        L.addItemListener(this);
        c.addItemListener(this);
        L.addActionListener(this);


    }



    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource()==L){
            ta.setText(L.getSelectedItem());
        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s[] = L.getSelectedItems();
        String txt = "";
        for (String x: s){
            txt = x+"\n";
        }

    }
}




public class listbox {
    public static void main(String[] args){
        list l = new list();
        l.setSize(500,500);
        l.setVisible(true);

    }
}
