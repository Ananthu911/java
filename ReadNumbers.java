import java.util.Scanner;
public class ReadNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative number entered");
                break;
            }
            if (num == 0) {
                continue;
            }
            System.out.println("You entered: " + num);
        }

    }
}
