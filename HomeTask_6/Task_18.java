package HomeTask_6;

public class Task_18 {
    public static void main(String[] args) {
        // Task 18
        // Напишіть метод, який сортує масив
        int [] arr = {4,6,9,2,4,1,8,10,11};
        SorrtArr(arr);
    }

    public static void SorrtArr (int [] arr){
        int v;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    v = arr[i];
                    arr[i]=arr[j];
                    arr[j]=v;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
