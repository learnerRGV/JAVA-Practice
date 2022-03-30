import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.math.BigDecimal;

public class BigDecimal1 {
    public static void main(String[] args){
        System.out.println("Enter two very big Numbers :-) ");
            Scanner sc = new Scanner(System.in);
            BigDecimal _d1 = sc.nextBigDecimal();
            BigDecimal _d2 = sc.nextBigDecimal();


            System.out.println(_d1.add(_d2));
            System.out.println(_d1.multiply(_d2));
        }
    }

