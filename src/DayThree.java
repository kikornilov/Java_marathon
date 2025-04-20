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
        for (String word = scanner.nextLine(); !word.equals("Stop"); word = scanner.nextLine()){
            switch (word) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
            }
        }
    }
