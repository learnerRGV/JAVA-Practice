//interface inter{
//    void meth1();
//    void meth2();
////    void New_method();                 //cant declare a method directly here...
//    default void New_method(){};         //this is valid by using default
//}
//
//class My implements inter{
//     public void meth1(){
//        System.out.println("meth1 of sub class");
//    }
//    public void meth2(){
//        System.out.println("meth2 of sub class");
//    }
//
//    public void meth3(){
//        System.out.println("meth3 of sub class");
//    }
//}
//
//public class Interfaces {
//    public static void main(String[] args) {
//
//        inter i = new My();
//        i.meth1();
//        i.meth2();
////        i.meth3();    //--->> cant be called here because reference id an interface, that doesn't include meth3
//
//    }
//
//}

interface music_player{
    void play();
    void pause();
}
interface camera{
    void click();
    void record();
}

class smartphone implements music_player,camera{

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("paused music");
    }

    @Override
    public void click() {
        System.out.println("Clicking picture");
    }

    @Override
    public void record() {
        System.out.println("Recording video");
    }
}

class Interfaces{
    public static void main(String[] args){

        smartphone iphone = new smartphone();
        iphone.click();
        iphone.record();
        iphone.play();
        iphone.pause();

//        music_player ipod = new smartphone();
//            ipod.pause();
//            ipod.play();                   //----->>now as here reference is music player then we are
//                                          //        only aloud to use methods of music player play and pause
//                                         //         not any other methods like click

    }
}