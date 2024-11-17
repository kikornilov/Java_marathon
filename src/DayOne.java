public class DayOne {
    public static void main(String[] args) {
        TasksDayOne first = new TasksDayOne();
        first.task1();
        System.out.printf("\n--------\n");
        first.task2();
        System.out.printf("\n--------\n");
        first.task3();
        System.out.println("--------");
        first.task4();
        System.out.println("--------");
        first.task5();
    }
}

class TasksDayOne{
    public void task1(){
        int i = 10;
        while ( i > 0){
            System.out.print("JAVA ");
            i--;
        }
    }

    public void task2(){
        for ( int i = 0; i < 10; i++){
            System.out.print("JAVA ");
        }
    }

    public void task3(){
        for ( int i = 0; i < 10; i++){
            System.out.println("JAVA");
        }
    }

    public void task4(){
        int year = 1980;
        while ( year <= 2020){
            System.out.println("Олимпиада "+year+" года");
            year += 4;
        }
    }

    public void task5(){
        for ( int year = 1980; year <= 2020; year+= 4){
            System.out.println("Олимпиада "+year+" года");
        }
    }

}
