
import java.util.Scanner;

public class sa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A, B;

        System.out.print("Get A:");
        A = scan.nextLine();
        System.out.print("Get B:");
        B = scan.nextLine();

        if (A.length() == B.length()) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}