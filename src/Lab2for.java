import java.util.Scanner;
public class Lab2for {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число х:");
            int x = sc.nextInt();
            System.out.println("Введите число n:");
            int n = sc.nextInt();
            for(; n < 15; n++){
                System.out.println("Число x в степени=" + Math.pow(x, n));
            }
        }
    }


