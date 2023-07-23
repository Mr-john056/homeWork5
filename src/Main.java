public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задача 2");
    }
    public static void task3(){
        System.out.println("Задача 3");
    }
    public static void task4(){
        System.out.println("Задача 4");
    }
    public static void task5(){
        System.out.println("Задача 5");
    }
}