package Interface;

public class Demo {
    public static void main(String[] args) {
        //CallBack c = new Client();
        //c.callBack(3);
        // Нельзя вызвать, тк метод не определен в интерфейсе
        //c.nonIfaceMeth();
        //CallBack ob = new AnotherClient();
        //ob.callBack(3);
        try {int d = 0;
        int a = 2;
        System.out.println(a /= d);}
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }

    }
}
