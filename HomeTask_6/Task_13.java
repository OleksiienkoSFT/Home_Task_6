package HomeTask_6;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        double Resalt =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число.");
        double Num1 = scanner.nextInt();
        System.out.println("Введіть друге число.");
        double Num2 = scanner.nextInt();
        System.out.println("Введіть оператор (+, -, *, /.)");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+': Resalt = Num1+Num2;
            break;
            case '-': Resalt = Num1-Num2;
            break;
            case '*': Resalt = Num1*Num2;
            break;
            case '/': Resalt = Num1/Num2;
            break;
            default:
                System.out.println("Помилка. Введена не корректна операція.");
        }
        System.out.println(Num1 + " " + operator + " " + Num2 + " = " + Resalt);

    }
}
