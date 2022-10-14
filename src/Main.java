public class Main {
    public static void main(String[] args) {

        int age = 25;
        int standartAge = 23;
        int salary = 30_000;
        int standardSalary = 50_000;
        int moreStandartSalary = 80_000;
        int limitYoung = salary * 2;
        int limitAdult = salary * 3;
        float creditLimit;
        System.out.print("Мы готовы выдать Вам кредитную карту с лимитом ");
        if (age >= standartAge && salary >= moreStandartSalary) {
            creditLimit = limitAdult * 1.5f;
        } else if (age >= standartAge && salary >= standardSalary) {
            creditLimit = limitAdult * 1.2f;
        } else if (age >= standartAge && salary < standardSalary) {
            creditLimit = limitAdult;
        } else if (age < standartAge && salary >= moreStandartSalary) {
            creditLimit = limitYoung * 1.5f;
        } else if (age < standartAge && salary >= standardSalary) {
            creditLimit = limitYoung * 1.2f;
        } else {
            creditLimit = limitYoung;
        }
        System.out.println(creditLimit + " рублей.");
    }}


