public class Task04 {
    public static void main (String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i - 1 == j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 == j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + 2 == n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i - 1 >= j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 <= j) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i + 2 <= n - j - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
