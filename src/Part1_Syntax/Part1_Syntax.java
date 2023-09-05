package Part1_Syntax;

import java.util.Scanner;
public class Part1_Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Recaptcha. Enter 'JksDf' to continue.");
        String Recaptcha = "JksDf";
        String YourAttempt = in.nextLine();
        if (Recaptcha.equals(YourAttempt)) {
            System.out.println("True, now you can continue.");
        }
        if (!(Recaptcha.equals(YourAttempt))) {
            System.out.println("False, try again.");
            System.exit(0);
        }
        //if, else demonstration
        System.out.println("Hello, now we will determine who you are by your age.");
        System.out.println("How old are you?");
        byte age = Byte.parseByte(in.nextLine());
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 12 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 3 && age < 12) {
            System.out.println("You are a kid.");
        } else if (age >= 0 && age < 3) {
            System.out.println("You are a newborn.");
        } else
            System.out.println("You dont exist.");
        //Another relation operators demonstration.
        System.out.println("Let's check who is older.");
        System.out.println("I am 17 years old, how old are you?");
        byte MyAge = 17;
        byte YourAge = Byte.parseByte(in.nextLine());
        if (MyAge == YourAge) {
            System.out.println("We are the same age.");
        } else if (MyAge > YourAge) {
            System.out.println("I am older than you.");
        } else if (MyAge < YourAge) {
            System.out.println("You are older than me.");
        }
        //switch demonstration
        System.out.println("Write the first letter of your city.");
        String FirstLetter = in.nextLine();
        switch (FirstLetter) {
            case "A":
                System.out.println("Are you from Amsterdam?");
                break;
            case "B":
                System.out.println("Are you from Berlin?");
                break;
            case "C":
                System.out.println("Are you from Cairo?");
                break;
            case "D":
                System.out.println("Are you from Dnipro?");
            default:
                System.out.println("I don't know where you are from.");
        }
    }
}