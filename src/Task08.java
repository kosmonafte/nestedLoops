import java.util.Scanner;

public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int count = 0;
        int sum = 0;
        while (inputNumber > 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
            count++;
        }
        System.out.printf("Сумма всех цифр - %d, количество цифр - %d", sum, count);
    }
}
