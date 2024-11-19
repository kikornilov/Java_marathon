import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        TasksDayTwo tasks = new TasksDayTwo();
        //tasks.task1();
        //tasks.task2();
        //tasks.task3();
        tasks.task4();
    }
}

class TasksDayTwo{
    String floor;

    public void task1(){
        System.out.print("Введите количество этажей: ");
        Scanner scanner = new Scanner(System.in);
        floor = scanner.nextLine();
        int integer = Integer.parseInt(floor.trim());
        if (integer <= 0){
            System.out.println("Ошибка ввода!");
        }
        else if (1 <= integer && integer <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (5 <= integer && integer <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else System.out.println("Многоэтажный дом");
    }

    public void task2(){
        System.out.print("Введите числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        for (int i = a; i<=b; i++){
            if (i % 5 == 0 && i % 10 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public void task3(){
        System.out.print("Введите числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        while (a <= b){
            if (a % 5 == 0 && a % 10 != 0){
                System.out.print(a + " ");
            }
            a++;
        }
    }

    public void task4(){
        System.out.print("Введите значение x: ");
        Scanner scanner = new Scanner(System.in);
        double y;
        double x = scanner.nextDouble();
        if (x >= 5){
            y = (x*x - 10)/(x + 7);
            System.out.println("Значение y при x >= 5: y= "+y);
        }
        else if(x < 5 && x > 3){
            y = (x + 3)*(x*x - 2);
            System.out.println("Значение y при 3 < x < 5: y= "+y);
        }
        else {
            y = 420;
            System.out.println("Значение y при x <= 3: y= "+y);
        }
    }
}
