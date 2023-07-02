import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int n = scanner.nextInt();
        int l = 0;
        int m = input - 1;
        for (int k = 0; k < input; k++) {
            for (int i = 0; i < n + l; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < n + l; j++) {
                    if (i >= n + l - j - 1 | i == n + l - 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                for (int j = 0; j < n + l; j++) {
                    if (i - 1 >= j | i == n + l - 1 & j != n + l - 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
            l++;
            m--;
        }

    }
}
