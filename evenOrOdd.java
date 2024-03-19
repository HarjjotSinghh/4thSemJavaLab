import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        System.out.println("Harjot Singh Rana | 11576802722 | CSE 3");
        sc.close();
    }
}
