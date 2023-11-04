package HomeTask_6;

public class Task_14 {
    public static void main(String[] args) {

        int [] Array = {1,2,3,4,5,6,7,8,9,10};
        NumInArr(5, Array);

    }
    // Task 14
    // Написати метод який перевіряє чи є таке число у масиві.
    public static void NumInArr (int a, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
                System.out.println("Число " + a + " є у масиві." );
            }
        }
    }
}
