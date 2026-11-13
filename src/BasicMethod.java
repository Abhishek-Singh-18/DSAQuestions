import java.util.Scanner;

public class BasicMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greets(name);

        System.out.print("Enter first number: ");
        int a= scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int result = sum(a, b);
        System.out.println("The sum is: " + result);

        System.out.println("Swapping numbers...");

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        WTV(a, b);
        boolean isArmstrong = armstrong(153);
        System.out.println("Is 153 an Armstrong number? " + isArmstrong);
    }
    public static void greets(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static void swap(int  a,int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped numbers: a = " + a + ", b = " + b);
    }

    public static void WTV(int a,int b){
       a=a^b;
         b=a^b;
         a=a^b;

         System.out.println("Swapped numbers: a = " + a + ", b = " + b);
    }

    public static boolean armstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;

        }
        return sum == originalNumber;
    }

}
