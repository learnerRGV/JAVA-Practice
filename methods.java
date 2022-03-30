import java.util.*;
public class methods {

//     static int max(int x,int y){
////        return Math.max(x, y);
//        if(x>y){
//            return x;
//        }
//        else{
//            return y;
//        }
//    }

//    static void prime(int x){
//    for(int i=2;i<x;i++){
//        System.out.println(x % i == 0 ? x + " is not prime" : x + " is Prime");
//        break;
//    }
//}
//    static int hcf(int x,int y) {
//        while(x!=y){
//            if (x > y) {
//                x = x - y;
//            } else {
//                y = y - x;
//            }
//        }
//        return x;
//    }


//    static float area(float radius){
//        return (float) (Math.PI*radius*radius);
//    }
//    static int area(int l, int b){
//        return l*b;
//}
//    static int rev(int n){
//
//        int ld=0;
//        while(n>0){
//        ld = ld*10 + n%10;
//        n=n/10;
//        }
//        return ld;
//    }

//    static int[] rev(int[] arr){
////        int[] b =new int[arr.length];
////        for (int i=arr.length-1,j=0;i>=0;i--,j++){
////                b[j]=arr[i];
//        }
////        for(int i=0;i< arr.length-1;i++) {
//            arr[i] = arr[arr.length -(i+1)];
//        }
//        return arr;
//    }

   static  boolean valid(String a){

        return a.matches("[a-zA-Z\\s]+");

    }


    public static void main(String[] args){

String name="raghvendra ";
        System.out.println(valid(name));

    }
}
