import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(String.format("a (%d) is the largest", a));
            } else {
                System.out.println(String.format("c (%d) is the largest", c));
            }
        } else {
            if (b > c) {
                System.out.println(String.format("b (%d) is the largest", b));
            } else {
                System.out.println(String.format("c (%d) is the largest", c));
            }
        }
        System.out.println("Harjot Singh Rana | 11576802722 | CSE 3");
        sc.close();
    }
}