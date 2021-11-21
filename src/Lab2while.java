import java.util.Scanner;
public class Lab2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число х:");
        int x = sc.nextInt();
        System.out.println("Введите число n:");
        int n = sc.nextInt();
        do {
            System.out.println("Число x в степени=" + Math.pow(x, n));
            n++;
        } while (n < 15);

    }
}

