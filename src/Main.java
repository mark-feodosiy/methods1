public class Main {
    public static void main(String[] args) {
// Задача № 1
        isLeapYear(2024);
        System.out.println();

        // Задача № 2
        chooseUserApp(1, 2015);
        System.out.println();

        // Задача № 3
        int deliveryDays = calculateDeliveryTime (95);
        if (deliveryDays == 0) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется количество дней: " + deliveryDays);
        }
    }
    private static void isLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    private static void chooseUserApp(int userOS, int clientDeviceYear) {
        if (userOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (userOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (userOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (userOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return 0;
        } else {
            int deliveryDays = 1;
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                deliveryDays++;}
            else if (deliveryDistance >= 60 && deliveryDistance < 80) {
                deliveryDays = deliveryDays + 2;}
            else if (deliveryDistance >= 80 && deliveryDistance < 100) {
                deliveryDays = deliveryDays + 3;}
            return deliveryDays;

        }
    }
}