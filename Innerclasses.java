class outer{

    int x = 10;

    class inner{

        int y =20;
        void innerdisplay(){
            System.out.println(x+" "+y);
        }
    }
    void outerdisplay(){
        inner i = new inner();
        System.out.println(i.y);

    }
}








public class Innerclasses {
    public static void main(String[] args){

//        outer o = new outer();
//        o.outerdisplay();
        outer.inner oi = new outer().new inner();          //directly creating object of inner class in main

        System.out.println(oi.y);
    }
}
