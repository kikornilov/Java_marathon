package StudyByBook;

public class EnumDemo {
    enum Apple{
        Jonathan, GoldenDel , RedDel , Winesap , Cortland
    }
    void appleDemo(){
        Apple ap;
        System.out.println("Все константы перечисления Apple: ");
        for (Apple a : Apple.values()){
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("ap содержит: " + ap);
    }

    enum AppleTwo{
        Jonathann(10), GoldenDell(9), RedDell(), Winesapp(15), Cortlandd(8);
        private int price;

        AppleTwo(int p){
            price = p;
        }

        AppleTwo(){
            price = -1;
        }

        int getPrice(){
            return price;
        }
    }
}
