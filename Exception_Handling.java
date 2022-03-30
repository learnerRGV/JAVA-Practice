import java.io.EOFException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Exception_Handling {

//    static int fun3(int a , int b){
//        int c = a/b;
//        return c;
//    }
//    static void fun2(){
//        fun3(10,0);
//    }

    static int area(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("sides of Rectangle cant be negative");
        }
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc ;
//try {
//    int a = 5;
//    int b = 0;
//    int c = a / b;
//    System.out.println("program is ended");
//    System.out.println("Bye");
//}
//catch(Exception e){
//    System.out.println("Invalid input, Cant divide by zero " );
//    System.out.println(e);                                //automatically calls e.String method of Exception class
//    System.out.println(e);                //automatically calls e.String method of Exception class
//        fun2();

//        try {
//            System.out.println(area(-10, 5));
//        } catch (Exception e) {
//            System.out.println( e.getMessage());
//
//        }
        try {
            FileInputStream fi;
//            sc = new Scanner(fi);
//
            fi = new FileInputStream("rgvv.txt");
//            int a = sc.nextInt();
//            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }
}
