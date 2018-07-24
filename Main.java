import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter only numbers:");
        System.out.println("Please enter your first number: ");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        System.out.println("Please enter your second number: ");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();
        System.out.println("The larger number is " + larger1(number1, number2));
    }
    public static int larger1(int num1,int num2){
        if (num1>num2)
        {

            return num1;
        }
        else
            {
            return num2;
        }
    }
}
