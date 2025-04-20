public class Stack {
    public static void main(String[] args) {
        StackIam myStack1 = new StackIam();
        StackIam myStack2 = new StackIam();

        // Помещение чисел в стек
        for(int i = 0; i < 10; i++) myStack1.push(i);
        for(int i = 20; i < 25; i++) myStack2.push(i);

        // Извлеч стек
        System.out.println("Анюта маленькая  девочка)");
        for(int i = 0; i < 10; i++) {
            System.out.print(" " + myStack1.pop());
            if(i == 9) System.out.println();
        }
        System.out.println("Стек 2: ");
        for(int i = 20; i < 25; i++) {
            System.out.print(" " + myStack2.pop());
        }
    }
}

class StackIam{
    int [] stck = new int[10];
    int tos;

    StackIam(){
        tos = -1;
    }
    // Поместить элемент в стек
    void push(int item){
        if(tos == 9)
            System.out.println("Стек полон.");
        else stck[++tos] = item;
    }
    // Извлечь элемент из стека
    int pop(){
        if(tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
