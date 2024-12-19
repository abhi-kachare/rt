import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int result = add(number1, number2);
        System.out.println("The sum is: " + result);

        input.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}