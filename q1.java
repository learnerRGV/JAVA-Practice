import java.util.Random;
public class q1
{    public static void main(String[] args)
{
    Random rand=new Random();

    int n1=rand.nextInt(10);

    int n2=rand.nextInt(100);
    System.out.println("Random Number-1:"+n1);
    System.out.println("Random Number-2:"+n2);
    System.out.println("The Minimum Of These Two Is:"+((n1<n2)?n1:n2));
}
}

