class Super{
    public void meth1(){
        System.out.println("meth1");
    }
    public  void  meth2(){
        System.out.println(" super meth2");
    }
}

class sub extends Super{
    public void meth2(){
        System.out.println("sub meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
}




public class overriding {
        public static void main(String[] args){

            Super sup = new Super();
            sup.meth1();
            sup.meth2();

            System.out.println("");

            sub sub = new sub();
            sub.meth1();
            sub.meth2();
            sub.meth3();

            System.out.println("");

            Super supb = new sub();
            supb.meth1();
            supb.meth2();
//            supb.meth3();    //cant call meth3 because reference is of super class and meth3 is not in Super class


        }
    }

