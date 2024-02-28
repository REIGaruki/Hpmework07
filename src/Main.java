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
        System.out.println("Task 02");
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 03");
        int yPopulation = 12_000_000;
        int bornPerThousand = 17;
        int diedPerThousand = 8;
        int year = 0;
        for (;year < 10;) {
            yPopulation = yPopulation / 1000 * (1_000 + bornPerThousand - diedPerThousand);
            System.out.println("Через " + ++year + " лет численность населения страны Y будет равна " + yPopulation);
        }
        System.out.println("Через " + year + " лет численность населения страны Y будет равна " + yPopulation);
        System.out.println("Task 04");
        float vasiliyDeposit = 15_000f;
        int vasiliyGoal = 12_000_000;
        int monthlyPercentage = 7;
        monthNumber = 0;
        while (vasiliyDeposit < vasiliyGoal) {
            vasiliyDeposit = vasiliyDeposit / 100 * (100 + monthlyPercentage);
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений Василия равна " + vasiliyDeposit + " рублей.");
        }
        System.out.println("Task 05");
        monthNumber = 0;
        vasiliyDeposit = 15_000;
        while (vasiliyDeposit < vasiliyGoal) {
            vasiliyDeposit = vasiliyDeposit / 100 * (100 + monthlyPercentage);
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений Василия равна " + vasiliyDeposit + " рублей.");
            }
        }
    }
}