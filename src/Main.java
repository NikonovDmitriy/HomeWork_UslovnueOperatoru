public class Main {
    public static void main(String[] args) {


        //Задание 1
        int clientOS = 1;
        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        //Задание 2
        int clientDeviceYear = 2015;
        int client = 0;
        if (client==1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else  if (client==1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (client==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (client==0 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        //Задание 3
        int year = 2000;
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }


        //Задание 4
        int deliveryDistance = 20;
        if (deliveryDistance<20){
            System.out.println("Потребуется 1 сутки");
        }else if (deliveryDistance>=20 && deliveryDistance<60){
            System.out.println("Потребуется 2 суток");
        }
        else if (deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("Потребуется 3 суток");
        }


        //Задание 5
        int monthNumber = 1;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");


        }





    }
}