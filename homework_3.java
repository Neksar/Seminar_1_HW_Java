// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

import java.util.Arrays;

public class homework_3 {
    public static void main(String[] args) {
        primeNumbers();
    }
    public static void primeNumbers() {
        boolean[] numbers = new boolean[1001];
        Arrays.fill(numbers, true);
        numbers[0] = numbers[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (numbers[i]) {
                for (int j = i * 2; j <= 1000; j += i) {
                    numbers[j] = false;
                }
            }
        }
        for (int i = 2; i <= 1000; i++) {
            if (numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
