
import java.util.Scanner;
public class revrese {
    public static void main(String[] args) {
//        int a = 123;
//        int lastdigit;
//        int sum=0;
//        while(a>0) {
//            lastdigit = a % 10;
//            a=a/10;
//            sum = sum + lastdigit;
//        }
//        System.out.println(sum);
//    }
      Scanner sc = new Scanner(System.in);

        int a;
        a=sc.nextInt();
        int number=0;
        int lastdigit = 0;

        while(a>0){
            lastdigit=a%10;
            number=number*10 + lastdigit;
            a=a/10;
        }
        System.out.println(number);

    }
}