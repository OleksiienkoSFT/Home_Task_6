package HomeTask_6;

public class Task_16 {
    public static void main(String[] args) {
        Dollar(10,15);

    }
    // Task 16
    // В метод передається два числа. Метод має друкувати фігурку MxN знаків долара
    public static void Dollar (int a, int b){
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                System.out.print("$ ");
            }
        }
    }
}
