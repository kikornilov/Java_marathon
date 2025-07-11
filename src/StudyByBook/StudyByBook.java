package StudyByBook;

import mypackage.PacMan;
import StudyByBook.EnumDemo.AppleTwo;

import java.sql.SQLOutput;


class Box {
    double width;
    double height;
    double depth;


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    public double ras() {
        return width * height * depth;
    }
    public void printVolume() {
        System.out.println("Объем равен: " + ras());
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
class BoxColor extends Box {
    int color;
    BoxColor(double w, double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
class Factorial{
    //Рекурсивный метод
    int fact(int n){
        int result;
        if (n == 1) return 1;
        System.out.println("Выозов fact c n = " + n);
        result = fact(n - 1) * n;
        return result;
    }
}
class RecTest{
    int[] values;
    RecTest(int i){
        values = new int[i];
    }

    void printArray(int i){
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Параметры не определены");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area() {
        System.out.println("Вызов area() для Rectangle");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Вызов area() для Triangle");
        return (dim1 * dim2) / 2;
    }
}

public class StudyByBook {
    public static void main(String[] args) {

        /* упражнение с рекурсией и вызова метода fact
        Factorial f = new Factorial();

        System.out.println("Факсториал 1: " + f.fact(1));
        System.out.println("Факсториал 2: " + f.fact(2));
        System.out.println("Факсториал 3: " + f.fact(3));
        */

        /* упражнение с рекурсией вывод массива
        RecTest ob = new RecTest(10);
        for (int i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
         */

        /*
        double vol;
        Box box1 = new Box(12,3,5);
        box1.printVolume();

        BoxWeight box2 = new BoxWeight(23,4,2,12);
        vol = box2.ras();
        System.out.println("Объем второй коробки     равен: " + vol);

        BoxColor box3 = new BoxColor(20,5,7,8);
         */

        /*
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(12, 3);
        Triangle t = new Triangle(14, 6);

        Figure figref;
        System.out.println(f.area());
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
         */

        //PacMan pac = new PacMan(2,3);
        //System.out.println("Вызов класса из другого пакета: " + pac.plus());

        // Изучение вывода главного потока
        //StreamEx ex = new StreamEx();
        //ex.streamExample();

        // Изучение создание дочернего потока
        /*
        NewThread nt = new NewThread();
        nt.t.start();
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Завершение Главного потока.");

         */

        //Изучение создания потока путем расширения класса Thread
        /*
        NewThreadSec nts = new NewThreadSec();
        nts.start();
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Завершение Главного потока.");
        */

        //Изучение метода Throw в исключениях
        /*
        ExceptionDemo exc = new ExceptionDemo();
        try {
            exc.demoproc();
        } catch (NullPointerException e){
            System.out.println("Повторно перехвачено: " + e);
        }
         */

        //Изучение метода Throws в исключениях
        /*
        ExceptionDemoThrows excdt = new ExceptionDemoThrows();
        try {
            excdt.throwOne();
        } catch (IllegalAccessException e){
            System.out.println("Перехвачено " + e);
        }
         */

        // Изучение Enum
        /*
        EnumDemo ed = new EnumDemo();
        ed.appleDemo();
        System.out.println();

        EnumDemo.AppleTwo ap;
        System.out.println("Яблоки сорта Winesapp стоят: " +
                EnumDemo.AppleTwo.Winesapp.getPrice() +
                " центов. \n");
        System.out.println("Цены на все сорта яблок:");
        for(AppleTwo a : AppleTwo.values()){
            System.out.println("Яблоки сорта " + a + " стоят " +
                    a.getPrice() + " центов.");
        }
        System.out.print("\n ----- \n");

        //Демонстрация методов ordinal(), compareTo() и equals()
        AppleTwo ap2, ap3;
        System.out.println("Все константы перечисления Apple" +
                " вместе с их порядковыми номерами: ");
        for (AppleTwo a : AppleTwo.values()){
            System.out.println( a + " - " + a.ordinal());
        }
        ap = AppleTwo.RedDell;
        ap2 = AppleTwo.GoldenDell;
        ap3 = AppleTwo.RedDell;

        System.out.println();

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " находится перед " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " находится перед " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " равно " + ap3);

        System.out.println();
        if (ap.equals(ap2))
            System.out.println("Ошибка!");
        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);

         */

        //Изучение Аннотаций
        System.out.println("Привет");
    }
}
