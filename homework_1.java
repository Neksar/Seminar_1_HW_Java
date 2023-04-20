// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число, основание треугольника: ");
        int num = iScanner.nextInt();
        double res = (0.5 * num) * (num + 1);
        System.out.println("n-ое число треугольника равно " + res);
        }
    }