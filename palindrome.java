public class palindrome {
    public static void main(String[] args){
int a = 121;
        int rev = 0;
        int c = a;
        int lastdigit = 0;
        int count = 0;
        int sum = 0;
        while(a>0){
            lastdigit = a%10;
//            System.out.println(lastdigit);

//            count  = count+1;
//            sum = (lastdigit*lastdigit*lastdigit) +sum;
            rev = rev*10 + lastdigit;
            a=a/10;
        }
//        System.out.println("Number of digits: "+count);
//        if(sum==c){
//            System.out.println("it is a armstrong number");
//        }
//        else {
//            System.out.println("it's not a armstrong number");
//        }
        System.out.println(rev);
        System.out.println(a);
        if(rev==a){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
