import java.util.Scanner;

public class saaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B;

        System.out.print("Get A: ");
        A = scan.nextInt();
        System.out.print("Get B: ");
        B = scan.nextInt();

        int sum = A + B;

        if (sum > 0) {
            if (sum % 2 != 0) {
                System.out.println("Positive Odd");
            }
            if (sum % 2 == 0) {
                System.out.println("Positive Even");
            }
        } else if (sum < 0) {
            if (sum % 2 != 0) {
                System.out.println("Negative Odd");
            }
            if (sum % 2 == 0) {
                System.out.println("Negative Even");
            }
        } else if (sum == 0) {
            System.out.println("Zero");
        }
    }
}