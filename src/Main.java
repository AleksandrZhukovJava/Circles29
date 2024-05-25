public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Task 5");
        for (int i = 1906; i <= 2096; i += 4) {
            System.out.printf("«%s год является високосным»%n", i);
        }
        System.out.println();

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i + i) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Task 8-9");
        double total = 0;
        int deposite = 29000;
        double percentPerMonth = 1.01;
        for (int i = 1; i <= 12; i++) {
            total = (total + deposite) * percentPerMonth;
            System.out.printf("«Месяц %s, сумма накоплений равна %.2f рублей»%n", i, total);
        }
        System.out.println();

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %s = %s%n", i, i * 2);
        }
    }
}