package StudyByBook;

public class ExceptionDemoThrows {
    void throwOne() throws IllegalAccessException{
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("Демонстрация");
    }
}
