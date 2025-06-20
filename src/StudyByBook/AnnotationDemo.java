package StudyByBook;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnna{
    String str();
    int val();
}

class AnnotationDemo {
    @MyAnna(str = "Пример аннотации", val = 100)
    void myMeth(){
        AnnotationDemo ob = new AnnotationDemo();
        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnna anna = m.getAnnotation(MyAnna.class);

            System.out.println(anna.str() + " " + anna.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }
}


