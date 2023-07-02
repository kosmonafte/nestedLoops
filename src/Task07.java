import java.util.Scanner;

public class Task07 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int number = 0;
        while (inputNumber > 0) {
            number += inputNumber % 10;
            number *= 10;
            inputNumber /= 10;
        }
        System.out.println(number / 10);
    }
}
