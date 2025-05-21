package Interface;

public class AnotherClient implements CallBack {
    @Override
    public void callBack(int param) {
        System.out.println("Вызов из другого класса где возвращается квадрат значения: " + (param*param));
    }
}
