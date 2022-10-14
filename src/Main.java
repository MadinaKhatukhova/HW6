import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        int age = 30;
        int salary = 70_000;
        int standartSalary = 80_000;
        int wantedSum = 330_000;
        int maxMonthPayment = salary / 2;
        float monthPayment;
        float baseRate = 0.1f;
        float baseRateStandartSalary = baseRate - 0.007f;
        float baseRateLess23Age = baseRate + 0.01f;
        float baseRateLess30Age = baseRate + 0.005f;
        float baseRateLess23AgeStandartSalary = baseRateLess23Age - 0.007f;
        float baseRateLess30AgeStandartSalary = baseRateLess30Age - 0.007f;
        System.out.print("Максимальный платеж при ЗП " + salary + " руб. равен " + maxMonthPayment + " руб. Платеж по кредиту ");
        if (age >= 30 && salary < standartSalary) {
        } else if (age >= 30 && salary >= standartSalary) {
            baseRate = baseRateStandartSalary;
        } else if (age >= 23 && salary >= standartSalary) {
            baseRate = baseRateLess30AgeStandartSalary;
        } else if (age >= 23 && salary < standartSalary) {
            baseRate = baseRateLess30Age;
        } else if (age < 23 && salary >= standartSalary) {
            baseRate = baseRateLess23AgeStandartSalary;
        } else {
            baseRate = baseRateLess23Age;
        }
        monthPayment = (wantedSum * baseRate + wantedSum) / 12;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(monthPayment);
        System.out.print(result + " рублей. ");
        if (monthPayment >= maxMonthPayment) {
            System.out.println("Не одобрено.");
        } else {
            System.out.println("Одобрено.");





        }}}