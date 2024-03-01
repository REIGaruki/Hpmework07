public class Main {
    public static void main(String[] args) {
        System.out.println("Task 01");
        double deposit = 0;
        int monthlyDeposition = 15_000;
        int goal = 2_459_000;
        float yearPercentage = 12f;
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
        int timeDuration = 10;
        while (year < timeDuration) {
            yPopulation += yPopulation * (bornPerThousand - diedPerThousand) / 1000;
            System.out.println("Через " + ++year + " лет численность населения страны Y будет равна " + yPopulation);
        }
        System.out.println("\nЧерез " + timeDuration + " лет численность населения страны Y будет равна " + yPopulation);
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
            vasiliyDeposit = vasiliyDeposit * (100 + monthlyPercentage) / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений Василия равна " + vasiliyDeposit + " рублей.");
            }
        }
        System.out.println("Task 06");
        monthNumber = 0;
        vasiliyDeposit = 15_000;
        int goalYears = 9;
        while (monthNumber < goalYears * 12) {
            vasiliyDeposit = vasiliyDeposit * (100 + monthlyPercentage) / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений Василия равна " + vasiliyDeposit + " рублей.");
            }
        }
        System.out.println("Task 07");
        int firstFridayDate = 3;
        int daysInMonth = 31;
        for (int date = firstFridayDate; date <= daysInMonth; date = date + 7) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Task 08");
        int firstCometAppearance = 0;
        int cometPeriod = 79;
        int currentYear = 2024;
        int minimalYear = currentYear - 200;
        int maximalYear = currentYear + 100;
        //solution 1, 301 iterations
        for (year = minimalYear; year <= maximalYear; year++) {
            if (year % cometPeriod == firstCometAppearance % cometPeriod) {
                System.out.println(year);
            }
        }
        System.out.println();
        //solution 2, 27 iterations
        for (year = firstCometAppearance; year <= maximalYear; year = year + cometPeriod) {
            if (year >= minimalYear) {
                System.out.println(year);
            }
        }
    }
}