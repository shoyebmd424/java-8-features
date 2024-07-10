import lamda.functionalInterface.MyFunctionalInterface;
import lamda.functionalInterface.SumInterface;
import lamda.functionalInterface.SumInterface;
import lamda.functionalInterfaceImpl.FunctionalInterfaceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System woring fine");
//        FunctionalInterfaceImpl obj = new FunctionalInterfaceImpl();
//        obj.sayHello();
//        MyFunctionalInterface i = new MyFunctionalInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Hello");
//            }
//
//        };
//        i.sayHello();


        MyFunctionalInterface i=()->{System.out.println("functional interface call by lamda");};
        i.sayHello();

        SumInterface sum=( a, b)->a+b;
       System.out.println(sum.sum(11,22));


    }

}

// How to Use  functional interface
// create separate class
// create announimous class
//using lamda express
