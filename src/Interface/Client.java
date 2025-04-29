package Interface;

public class Client implements CallBack{
    // Реализовать метод интерфейса CallBack

    @Override
    public void callBack(int p) {
        System.out.println(" callBack() вызывается с " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Другой метод в классе использующий интерфейс ");
    }
}
