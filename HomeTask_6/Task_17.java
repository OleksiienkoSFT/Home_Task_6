package HomeTask_6;

public class Task_17 {
    public static void main(String[] args) {
        //назва літака, тип літака
        //назва літака, тип літака, кількість місць економ класу
        //назва літака, тип літака, кількість місць економ класу, кількість місць бізнес класу

        buildAirplane("Винищувач", "F-16");
        buildAirplane("Пасажирський літак #1", "AN-2", 10);
        buildAirplane("Пасажирський літак #2", "AN-5", 20, 50);

    }
    // Task 17
    //Літаки:
    //Авіакомпанія виготовляє три типи літаків:

    //Винищувачі - не мають пасажирських місць
    //Пасажирські літаки #1 - мають місця тільки економ класу
    //Пасажирські літаки #2 - мають місця економ і бізнес класу

    //Потрібно зробити три методи з однаковою назвою buildAirplane(), який робитиме літаки всіх трьох типів.

    //На вхід кожен метод прийматиме різну кількість параметрів:

    //назва літака, тип літака
    //назва літака, тип літака, кількість місць економ класу
    //назва літака, тип літака, кількість місць економ класу, кількість місць бізнес класу
   public static void buildAirplane (String name, String type){
       System.out.println(name + " " + type);

   }
    public static void buildAirplane (String name, String type, int plasesEco){
        System.out.println(name + " " + type + " has Econom class - " + plasesEco);

    }
    public static void buildAirplane (String name, String type, int plasesEco, int PlasesBusines){
        System.out.println(name + " " + type + " has Econom class - " + plasesEco + " and Business class  - " + PlasesBusines );
    }
}
