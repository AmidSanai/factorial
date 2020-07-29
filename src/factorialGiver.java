import java.util.Scanner;

public class factorialGiver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number to get the Factorial.");
        int number = scan.nextInt();
        int factorial = 1;

        for (int a = 1; a <= number; a++){

            factorial = factorial * a;

        }

        System.out.println(number + "! is: " + factorial);

    }

}
