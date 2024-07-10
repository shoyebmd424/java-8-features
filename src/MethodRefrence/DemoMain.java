package MethodRefrence;

public class DemoMain {
    public static void main(String[] args) {

//        static Method ko refer kiya
//        ClassName::MethodName

        StuffImpl stf=Stuff::DoStuff;
        stf.doTask();
//      Runnable t=Stuff::threadTask;
//      Thread th=new Thread(t);
//      th.setName("dsjpo");
//      th.start();

      System.out.println("");
//      Reference non static method
//        object::methodName
      Stuff st3=new Stuff();
      StuffImpl st=st3::sum;


//      constructor Reference
//        ClassName::new

Provider provider=Student::new;
provider.getStudent();
        Provider provider1=Student::new;
        provider.getStudent();


    }
}
