public class Main {
    public static void main(String[] args) {

        int deliveryDistance = 100;
        int deliveryDays = 1;
        int distanceAddDays = 40; // Шаг расстояния, при котором увеличивается доставка на СУТКИ
        int remainingDistance = deliveryDistance - 20; // Если разница <= 0, то выведем СУТКИ на доставку, если больше, то ИНАЧЕ
        System.out.print("Потребуется дней: ");
        if (remainingDistance <= 0) {
            System.out.println(deliveryDays);
        } else if (remainingDistance % distanceAddDays != 0) {
            System.out.println((deliveryDays += remainingDistance / distanceAddDays + 1));
        } else {
            System.out.println((deliveryDays += remainingDistance / distanceAddDays));
        }
    }}



