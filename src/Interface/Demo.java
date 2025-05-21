package Interface;

public class Demo {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callBack(3);
        // Нельзя вызвать, тк метод не определен в интерфейсе
        //c.nonIfaceMeth();
    }
}
