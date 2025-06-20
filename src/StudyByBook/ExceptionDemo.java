package StudyByBook;

public class ExceptionDemo {
    void demoproc(){
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e){
            System.out.println("Перехвачено внутри demoproc().");
            throw e;
        }
    }
}
