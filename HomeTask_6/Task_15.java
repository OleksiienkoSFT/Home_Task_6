package HomeTask_6;


import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть два числа.");
        int Num1 = scanner.nextInt();
        int Num2 = scanner.nextInt();
        CommonDivisors(Num1, Num2);

    }
    // Task 15
    // Ввести число з клавіатури два числа.
    // Створити метод, що виводить всі спільні дільники цих чисел.
    public static void CommonDivisors (int a, int b){
        for (int i = 1; i <= a; i++) {
            if (a%i==0 && b%i==0){
                System.out.println("Спільний дільник числа " + a +" і числа " + b + " є - " + i );
            }

        }
    }
}
