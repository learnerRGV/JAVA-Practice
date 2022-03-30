import java.lang.Math;
import java.util.Scanner;

public class roots_of_quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first, second, and last coefficient of equation respectively");
        int a;
        int b;
        int c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = Math.sqrt(b*b - 4*a*c);
        double r1 = (-b + d)/2*a;
        double r2 = (-b - d)/2*a;
        System.out.println("Roots of the equation are: "+r1+" , "+r2);
    }
}
