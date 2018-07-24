import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        System.out.println("Welcome to the password creator.");
        System.out.println("Please enter your new password: ");
        Scanner scan1 = new Scanner(System.in);
        String password1 = scan1.nextLine();
        System.out.println("Please enter your password again: ");
        Scanner scan2 = new Scanner(System.in);
        String password2 = scan2.nextLine();
        System.out.println("The two passwords match!" + passwordCheck(password1, password2));
    }
    public static boolean passwordCheck(String pass1, String pass2) {
        return pass1.equals(pass2);


    }
    }

