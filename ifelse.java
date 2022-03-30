
import java.util.Scanner;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class ifelse{

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int age;
         age = sc.nextInt();

//        int age = 18;
//        if(age>18){
//            System.out.println("yes you can drive");
//        }
//        else{
//            System.out.println("no you cant drive");
//        }

//        int age =19;
//        boolean cond = (age ==18);
//        if(cond){
//            System.out.println("yes you can drive ");
//
//        }
//        else{
//            System.out.println("no you cant drive");
//        }


        if(age>18 || age<22) {
            System.out.println("you are an adult");
        }
        else if ( age >22 || age < 30){
            System.out.println("you must get a job and get married now");
        }
        else if (age > 30 || age<60){
            System.out.println("Enjoy your family life ");
        }
        else if(age > 60){
            System.out.println("you must get retired now from your job and spend some Quality time");

        }

        // write your code here
    }
}
