//
//abstract class abs{
//    abs(){
//        System.out.println("abstract");
//    }
//    void meth1() {
//        System.out.println("abs Meth1");
//    }
//}
//class Subclass extends abs{
//    Subclass(){
//        System.out.println("Sub class");
//    }
//    void meth2(){
//        System.out.println(" sub meth2");
//    }
// }
//
//public class Abstract {
//    public static void main(String[] args){
//
////        abs a1=new abs();                 //not allowed
////        abs s = new Subclass();           //allowed
//
//        Subclass s1 =new Subclass();        //allowed
//
//
//
//    }
//}

abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class circle extends Shape{
    int radius = 5;

    double perimeter() {
        return 2*Math.PI*radius;
    }

    double area() {
        return Math.PI*radius*radius;
    }
}

class square extends Shape{
    double side = 5;
    double perimeter(){
        return 4*side;
    }
    double area(){
        return side*side;
    }
}

class Abstract{
    public static void main(String[] args){
        Shape s1 = new circle();            //---->> creating object of circle with a reference of Shape(abstract) class

        System.out.println(s1.area());
        System.out.println(s1.perimeter());


        square s2 = new square();          //---->> creating object as well as reference of square class
        System.out.println(s2.area());
        System.out.println(s2.perimeter());

    }
}


