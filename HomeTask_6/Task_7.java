package HomeTask_6;
public class Task_7 {
    public static void main(String[] args) {
        System.out.println(Less(12, 50));

    }
    // Task 7
    // Необхідно написати метод, який би повертав із 2 чисел менше число.
    public static int Less (int a, int b){
        if(a>b){
            return a;
        }
       else
           return b;
    }
}
