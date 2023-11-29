package vladyslav.goit;

import java.util.Scanner;

public class InputNumber {

    public void inputNumber() {
        System.out.println("Введите порядковый номер числа Фиббоначи:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("close")) {
                break;
            } else if (!isNumerik(input)) {
                System.out.println("Введите число");

            } else {
                long startTime = System.nanoTime();
                System.out.println(DinamicFb.fibonacci(Integer.parseInt(input)));
                long endTime = System.nanoTime();
                long executionTime = (endTime - startTime) / 1000;
                System.out.println("Время выполнения: " + executionTime);
            }
        }
    }

    private boolean isNumerik(String number) {
        try {
            Integer.parseInt(String.valueOf(number));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}