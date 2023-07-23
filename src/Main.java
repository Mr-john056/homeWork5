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
        byte clientOS = 1;
        short clientDeviceYear = 2015;
        if (clientOS ==  0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0  && clientDeviceYear >= 2015){
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        }
        if (clientOS ==  1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача 3");
        int year = 2023;
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println();
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней:"+ days);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней" + (days+1));
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней" + (days+2));
        } else {
            System.out.println("Нет доставки");
        }
        System.out.println();
    }

    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber){
            case 1,2,12 : System.out.println("Зима");
            break;
            case 3,4,5 : System.out.println("Весна");
            break;
            case 6,7,8 : System.out.println("Лето");
            break;
            case 9,10,11 : System.out.println("Осень");
            break;
            default : System.out.println("Ошибка параметра");
        }
        System.out.println();
    }
}