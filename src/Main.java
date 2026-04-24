import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        checkLeapYear(2022);
        //Задача №2
        System.out.println("Задача №2");
        installApplicationVersion(1, 2026);
        //Задача №3
        System.out.println("Задача №3");
        int deliveryDistance = 50;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет (свыше 100км)");
        }
    }

    public static void checkLeapYear(int year) {
        if (year > 1584) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    public static void installApplicationVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            //для iOS
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS  по ссылке");
            }
        } else if (clientOS == 1) {
            //для Android
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android  по ссылке");
            }

        }
    }

    public static int calculateDeliveryDays(int distance) {
        int days = 1;

        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

}