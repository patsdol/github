
public class sa4 {
    public static void main(String[] args) {
        int A = 7;
        for (int i = 0; i < 7; i++) {
            A -= 1;
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (j == i && j == A) {
                    System.out.print("x ");
                }
                if (j == i && j != A) {
                    System.out.print("x ");
                }
                if (j == A && j != i) {
                    System.out.print("x ");
                }
                if (j != i && j != A) {
                    System.out.print("- ");
                }
            }
        }
    }
}