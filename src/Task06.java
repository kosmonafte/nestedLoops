import java.util.Scanner;

public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int n = input * 2;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j + k/2) {
                    if ( i % 2 == 0) {
                        System.out.print("***");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            k++;
            System.out.println();;
        }
    }
}
