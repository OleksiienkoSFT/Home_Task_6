package HomeTask_6;

public class Task_11 {
    public static void main(String[] args) {
    Power(5, 1);
    }
    // Task 11
    // Написати метод, який возводить число у ступінь
    public static void Power (int a, int Stepin ){
        int power = 1;
        for (int i = 0; i < Stepin; i++) {
            power *= a;
        }
        System.out.println("Число " + a + " у степені " + Stepin + " = " + power);
    }
}
