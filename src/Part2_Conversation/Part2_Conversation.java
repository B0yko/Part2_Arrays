package Part2_Conversation;

import java.util.Scanner;
public class Part2_Conversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome, write your age and get your daily activity plan.");
        byte YourAge = Byte.parseByte(in.nextLine());
        if (YourAge >= 0 && YourAge <= 6) {
            System.out.println("Your daily activity is: home, walk and kindergarten.");
        } else if (YourAge > 6 && YourAge <= 17) {
            System.out.println("You have to go to school.");
        } else if (YourAge > 17 && YourAge <= 22) {
            System.out.println("You have to go to university.");
        } else if (YourAge > 22 && YourAge <= 60) {
            System.out.println("You have to go to work.");
        } else
            System.out.println("You are retired.");
    }
}
