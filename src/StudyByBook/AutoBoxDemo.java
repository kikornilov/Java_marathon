package StudyByBook;

public class AutoBoxDemo {
    void autoBoxDemo (){
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Исходное значение iOb: " +
                 iOb);
        ++iOb;
        System.out.println("После iOb++ : " + iOb);
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 после вычислений: " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("Результат i после вычислений: " + i);
    }
}
