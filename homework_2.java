// Вычислить n! (произведение чисел от 1 до n)

public class homework_2 {
    public static void main(String[] args) {
        System.out.printf("Факториал числа равен: " + factorial(5));
    }
    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}