import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
        TasksDayThree tasks = new TasksDayThree();
        tasks.task1();
    }
}

class TasksDayThree{
    public void task1(){
        System.out.println("Введите город: ");
        Scanner scanner = new Scanner(System.in);
        String stop = "Stop";
        String word;
        for(word = scanner.nextLine(); word.equals(stop); ){
            switch (word){
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
