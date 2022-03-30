
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {

        //solid rectangle
//        int n = 4;
//        int m = 5;
//        for (int i = 1; i <= 4 ; i++){
//            for (int j =1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        hollow rectangle

//        int n = 4;
//        int m = 5;
//
//            for (int i = 1; i <= 4; i++) {
//                for (int j = 1; j <= 5; j++) {
//                    if (i == 1 || j == 1 || i == n || j == m) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }



//        half pyramid

//        int n = 4;
//        for (int i = 1; i<=n ; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        inverted half pyramid

//        int n=4;
//        for (int i = n ; i >=1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// rotated inverted half pyramid


//        int n =4;
//        for (int i =1;i<=n;i++){
//            for (int j = 1; j<=n-i;j++) {
//                System.out.print(" ");
//            }
//
//
//                for (int j =1 ; j <=i ; j++){
//                    System.out.print("*");
//                }
//            System.out.println();
//    }


//        half pyramid with numbers

//        int n = 5;
//        for (int i = 1; i<=n ; i++){
//            for (int j =1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        inverted rotated number pyramid
//        int n =5;
//        int number = 1;
//        for (int i = n; i>=1 ; i--){
//            for(int j =1; j<=i ; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        floyd's triangle

//        int n = 5;
//        int number = 1;
//        for (int i =1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(number++);
//
//            }
//            System.out.println();
//        }

//        0 - 1 triangle

//        int n =5 ;
//        for (int i = 1; i <=n; i++){
//            for (int j =1; j<=i ; j++){
//                int sum = i+j;
//                if (sum%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }

//        butterfly pattern
//        int n =4;
//        for (int i =1; i<=n ; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//             int spaces = 2*(n-i);
//            for (int j = 1; j<=spaces ; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i =n; i>=1 ; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//             int spaces = 2*(n-i);
//            for (int j = 1; j<=spaces ; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        solid rhombus

//        int n = 8;
//        for (int i =1 ; i <=n;i++){
//            int spaces = n-i;
//            for (int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for (int j =1 ; j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        number pyramid

//        int n = 6;
//        for (int i =1; i<=n ; i++){
//            for (int j = 1; j <=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j =1; j<=i; j++){
//                System.out.print(n);
//            }
//            for(int j =1; j<=i-1; j++){
//                System.out.print(n);
//            }
//            System.out.println();
//        }
        int n = 8;
        for(int i=0;i<n/2;i++) {

            for(int k=0;k<1;k++) {
                System.out.print("*\n* *\n  *");
            }

            for(int j=0;j<1;j++) {
                System.out.print("    ");
            }
//            System.out.println("");

        }










    }
}