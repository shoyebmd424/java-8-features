package lamda.functionalInterfaceImpl;

import lamda.functionalInterface.MyFunctionalInterface;

public class FunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void sayHello() {
        System.out.print("Hello interface");
    }
}
