
import java.lang.*;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int count = 1;
//        int n= 5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for(int b = 1; b<i-1;b++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        int[] a = {4,5,1,7,65,343322 ,4343};
//        int sum = 0;
//        int key = 7;
//        int max = 0;
//        int secmax = 0;
//        int index = 0;
//        for (int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//                index = i;
//            }


//            if(a[i]==key){
//                System.out.println("Yes 7 is present in array on index "+i);
//            }
//            sum = sum + a[i];

//        for(int i=0;i<index;i++){
//            if(a[i]>max){
//                max=a[i];
//
//            }
//        }
//        System.out.println(max+" is max element");
//        System.out.println(sum);
//        int[] arr ={1,2,3,4,5};
//        int temp= arr[0] ;
//        for(int x:arr) {
//            System.out.print(x+" ");
//        }
//        System.out.println("");
//        for (int i = 1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//        arr[(arr.length -1)] = temp;
//        for(int x:arr) {
//            System.out.print(x+" ");
//        }

        //--->Inserting element in an array
//        int[] a  = new int[10];
//        int n = 6;
//        for (int i= 0;i<n;i++){
//            a[i] = i+1;                       //assigning value to array
//        }
//        for(int x:a){
//            System.out.print(x+" ");
//        }
//        System.out.println("");
//        int key = 5;
//        int index = 2;
//        for (int i =n;i>index;i--) {
//            a[i] = a[i - 1];                //shifting value
//        }
//    a[index]=key;
//        for(int x:a) {
//            System.out.print(x + " ");
//        }
//          ---> deleting an element
//        int[] a = {1, 2, 3, 4, 5};
//        int index = 1;
//        for (int i = index;i<a.length-1;i++){
//            a[i] = a[i+1];
//        }
//        a[a.length-1] = 0;
//        for (int x:a){
//            System.out.print(x+" ");
//        }
          //---> copying and copying reversing an array
//        int[] a = {1,2,3,4,5};
//        int[] b =new int[a.length];
//        for (int i=0;i<a.length;i++){
//            b[i] = a[a.length -(i+1)];
//        }
//        for(int x:a){
//            System.out.print(x+" ");
//        }
//        System.out.println("");
//        for(int x:b){
//            System.out.print(x+" ");
//        }

        //---> increasing size of an array
//        int[] a = {1,2,3,4,5,6};
//        int[] b = new int[2*a.length];
//        System.out.println(a.length);
//        for (int i=0;i<a.length;i++){
//            b[i] = a[i];
//        }
//        a=b;
//        b=null;
//        System.out.println(a.length);
//

        //--->2-D arrays

//        int[][] a = new int[4][3];
//        a = new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
//        for(int x[]:a){
//            for(int y:x){
//                System.out.print(y);
//            }
//            System.out.println("");
//        }
//        for (int i =0; i<a.length;i++){
//            for (int j = 0;j<a[0].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println("");
//        }

        //--->jagged array
//        int[][] a =new int[3][];
//        a[0] = new int[5];
//        a[1] = new int[3];
//        a[2] = new int[7];
//
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] b = {{1,0,0},{0,1,0},{0,0,1}};
//        int [][] c = new int[3][3];
//        for (int i =0;i<a.length;i++){
//            for (int j=0;j<b.length;j++){
//                c[i][j]=0;
//                for (int k=0;k<a.length;k++){
//                    c = a[i]}
//            }
//        }

//        int[] arr = {1,2,3,55,33,104};
//        int[] arr = {33,22,11,5};
//        int max = 0;
//        int sec = 0;
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//        }
//        for (int k : arr){
//            if(k!=max){
//                if(k>sec){
//                    sec = k;
//                }
//            }
//        }
//        System.out.println(sec);

        int[] arr = {10,10,10};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]!=max){
                System.out.println(arr[i]);
                break;
            }

        }
//        System.out.println(arr[arr.length-2]);
    }
}