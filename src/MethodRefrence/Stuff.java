package MethodRefrence;

public class Stuff {
    public  static  void DoStuff(){
        System.out.println("Do stuff task and inject this reference to stuff interface");
    }
public  static  void threadTask(){
        for(int i=0;i<10;i++){
            System.out.print(i+", ");
        }
}
public  void pringNumbers(){
        for (int i=0;i<10;i++)
            System.out.print(i+", ");
}
public  int sum(){
        return 2+4;
}
}
