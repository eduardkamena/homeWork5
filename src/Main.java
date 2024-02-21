public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 1; // Переменная для Задачи 1 и 2
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Выберете правильную OS");
            }
        // Задача 2
        int clientDeviceYear = 2015; // Переменная clientOS оставлена из Задачи 1
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 3
        // Признаюсь, я подсмотрел решение в обсуждениях, так как не мог в правильном порядке поставить условия
        // Объясните, пожалуйста, почему они должны быть именно в такой последовательности (сначала &&, потом ||,
        // так как если я меняю местами И и ИЛИ (т.е. сначала ||, потом &&), то ничего не выходит
        // Хочу понять машинную логику, хотя она вроде простая и прямая как рельсы)) или моя логика отстает немного)))
        int year = 2200;
        if (year < 1584) {
            System.out.println("Это не високосный год");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // К вопросам выше: Почему именно такая последовательность,
            // а не (year % 4 == 0 && year % 400 == 0 || year % 100 != 0)
            // или (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1; // Сделал день доставки через переменную. Можно было как-то по-другому тут все написать?
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
        // Задача 5
        int monthNumber = 1;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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
                System.out.println("Нет такого месяца");
        }
    }
}