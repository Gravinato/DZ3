public class Main {
    public static void main(String[] args) {
// Задание 1
    int clientOs = 1;
    if (clientOs == 0) {
        System.out.println("Установите версию приложения для IOS по ссылке");
    } else if (clientOs == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Под такую ОС нет приложения");
    }

//Задание 2
    int clientDeviceYear = 2016;
    if (clientOs == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите новую прошивку для Ios");
    } else if (clientOs == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите старую прошивку для Ios");
    } else if (clientOs == 1 && clientDeviceYear >= 2015){
        System.out.println("Установите новую прошивку для Android");
    } else if (clientOs == 1 && clientDeviceYear < 2015){
        System.out.println("Установите старую прошивку для Android");
    } else{
        System.out.println("Ваше устройство не поддерживается");
    }

// Задание 3
    int year = 2022;
    if ((year % 4 == 0) && (year % 100 != 0) || year % 400 ==0){
        System.out.println(year + "- это високосный год");
    }else {
        System.out.println(year + "- это не високосный год ");
    }


// Задание 4
    int deliveryDistance = 95;
    if(deliveryDistance <= 20){
        System.out.println("На доставку уйдёт 1 день");
    } else if(deliveryDistance <= 60){
        System.out.println("На доставку уйдёт 2 день");
    }else if(deliveryDistance <= 100){
        System.out.println("На доставку уйдёт 3 день");
    }else{
        System.out.println("Доставка невозможна");
    }

//    Задание 5

    int monthNumber = 12;
    switch (monthNumber){
        case 12:
        case 1:
        case 2:
            System.out.println("Сейчас зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Сейчас весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Сейчас лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Сейчас осень");
            break;
        default:
            System.out.println("Неверный номер месяца");
    }
    }}
