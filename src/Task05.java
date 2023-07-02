public class Task05 {
    public static void main (String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1 | i == n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 | i == n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1 | i == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                    System.out.print("*  ");
            }
            for (int j = 0; j < n; j++) {
                if (i <= n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
