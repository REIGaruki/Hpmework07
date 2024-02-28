public class Main {
    public static void main(String[] args) {
        System.out.println("Task 01");
        double deposit = 0;
        int monthlyDeposition = 15_000;
        int goal = 2_459_000;
        int yearPercentage = 12;
        int monthNumber = 1;
        while (deposit < goal) {
            deposit = deposit * (100 + yearPercentage / 12) / 100 + monthlyDeposition;
            if (monthNumber % 12 == 0){
                System.out.println("За " + monthNumber / 12 + " год сумма накоплений равна " + deposit + " рублей.");
            } else {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + deposit + " рублей.");
            }
            monthNumber++;
        }
    }
}