import java.util.Scanner;
public class radix_of_num {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String b ;
        b = sc.nextLine();
        if (b.matches("[01]+")) {
            System.out.println("Number is binary");
        } else if (b.matches("[0-7]+")) {
            System.out.println("Number is octal");
        } else if (b.matches("[0-9]+")) {
            System.out.println("Number is decimal");
        }
        else if (b.matches("[0-9A-F]+")) {
            System.out.println("Number is hexadecimal");
        }
        else{
            System.out.println("Number is invalid");
        }

    }
}
