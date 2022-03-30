import java.util.*;
public class revstring {
    public static void  main(String[] args){
        String s = "abc";
//            StringBuilder f  = new StringBuilder();
        char ch ;
        String f = "";

        for (int i=s.length()-1;i>=0;i--){
            ch = s.charAt(i);
            f=f+ch;
        }
        System.out.println(f);
    }
}
