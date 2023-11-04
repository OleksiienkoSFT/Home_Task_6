package HomeTask_6;

public class Task_8 {
    public static void main(String[] args) {
        Pair(5);
        Pair(569874);

    }
    // Task 8
    // Написати метод, який перевіряє чи є передане число парним.
    public static void Pair(int a){
        if (a%2==0){
            System.out.println("Число парне");
        }
        else {
            System.out.println("Ні. Число не парне.");
        }
    }

}
