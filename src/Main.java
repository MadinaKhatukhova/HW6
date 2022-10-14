public class Main {
    public static void main(String[] args) {

            int clientOS = 3; // 0 — iOS, 1 — Android
            int clientDeviceYear = 2014;
            if (clientDeviceYear >= 2015 && clientOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке.");
            } else if (clientDeviceYear <= 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientDeviceYear >= 2015 && clientOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке.");
            } else if (clientDeviceYear <= 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else System.out.println("К сожалению, для Вашего устройства нет приложения.");
        } }