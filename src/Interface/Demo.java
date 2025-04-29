package Interface;

public class Demo {
    public static void main(String[] args) {
        Client c = new Client();
        c.callBack(3);
        c.nonIfaceMeth();
    }
}
