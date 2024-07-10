package lamda;

public class ThreadDemo {
    public static void main(String[] args)  {
//        First Thread Khan
        Runnable thread1=()->{
//             body of thread
            for(int i=1;i<10;i++){
            System.out.print(i+", ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t=new Thread((thread1));
        t.setName("Khan");
        t.start();

        System.out.println("\nSecond thread");
        Runnable t2=()->{
            try{
                for(int i=0;i<=20;i+=2){
                    System.out.print(i+", ");
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        };
        Thread t22=new Thread(t2);
        t22.start();
    }
}
