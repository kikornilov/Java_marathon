package StudyByBook;

public class StreamEx {

    void streamExample() {
        Thread t = Thread.currentThread();
        System.out.println(("Teкущий поток: " + t));
        t.setName("Му Thread");
        System.out.println("Пocлe изменения имени: " + t);
        try {
            for (int n = 5; n > 0; n--)
                System.out.println(n);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Дочерний поток: " + t);
    }

    public void run(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Завершение дочернего потока.");
    }
}

class NewThreadSec extends Thread{
    NewThreadSec(){
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);
    }

    public void run(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Завершение дочернего потока.");
    }

}