
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

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(12, 3);
        Triangle t = new Triangle(14, 6);

        Figure figref;
        System.out.println(f.area());
        figref = r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());
        }
}
