import java.util.Scanner;
import java.lang.Math;
public class triangle_area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //by base and height
//        System.out.println("Enter base and height");
//        float base ;
//        float height;
//        base = sc.nextFloat();
//        height = sc.nextFloat();
//        float area = (1/2f)*(base*height);
//        System.out.println(area);

        //by sides of a triangle
        System.out.println("Enter the side of the triangle");
        int  s1 ;
        int  s2;
        int  s3;
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        int s = (s1+s2+s3)/2;
        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println(area);

    }
}
