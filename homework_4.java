// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        System.out.println("Выберите операцию (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        double result = 0.0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль невозможно.");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Ошибка! Некорректная операция.");
                return;
            }
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}