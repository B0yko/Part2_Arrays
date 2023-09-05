package Part3_ImprConversation;

import java.util.Scanner;

public class Part3_ImprConversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Greeting text, instructions and genres list.
        System.out.println();
        System.out.println("Welcome to our book store!");
        System.out.println("Enter your age and genre so we can find the right book for you.");
        System.out.println();
        System.out.println("These are all the genres you can choose from:");
        System.out.println("1. Adventure");
        System.out.println("2. Classics");
        System.out.println("3. Comics");
        System.out.println("4. Detective");
        System.out.println("5. Fantasy");
        System.out.println("6. Historical fiction");
        System.out.println("7. Horror.");
        System.out.println("8. Non-fiction");
        System.out.println("9. Science fiction");
        System.out.println("10. Westerns");
        System.out.println();

        //Age and genre input.
        System.out.println("Enter your age:");
        byte age = Byte.parseByte(in.nextLine());
        System.out.println("Enter your genre:");
        String genre = in.nextLine();

        if (age <= 0) {
            System.out.println("Invalid age");

        } else if (age >= 0 && age < 6) {
            System.out.println("You're too young to read on your own");

        } else if (age >= 6 && age <= 12 && genre.contains("Adventure")) {
            System.out.println("You're definitely gonna love 'Karlson on the Roof' by Astrid Lindgren," +
                    " 'The Adventures of Tom Sawyer' by Mark Twain or 'Toreadory z Vasiukivki' by Vsevolod " +
                    "Nestayko");

        } else if (age >= 6 && age <= 12 && genre.contains("Classics")) {
            System.out.println("You're definitely gonna love 'Alice's Adventures in Wonderland' by Lewis Carroll " +
                    "or 'The Wonderful Wizard Of Oz' by L. Frank Baum");

        } else if (age >= 6 && age <= 12 && genre.contains("Comics")) {
            System.out.println("You're definitely gonna love 'Teenage Mutant Ninja Turtles' by Mirage Studious " +
                    "or 'The Amazing Spiderman' by Stan Lee");

        } else if (age >= 6 && age <= 12 && genre.contains("Detective")) {
            System.out.println("You're definitely gonna love 'Kalle Blomquist' series by Astrid Lindgren");

        } else if (age >= 6 && age <= 12 && genre.contains("Fantasy")) {
            System.out.println("You're definitely gonna love 'Harry Potter' series by J.K.Rowling");

        } else if (age >= 6 && age <= 12 && genre.contains("Historical fiction")) {
            System.out.println("You're definitely gonna love 'The Three Musketeers' by Alexandre Dumas");

        } else if (age >= 6 && age <= 12 && genre.contains("Horror")) {
            System.out.println("You're definitely gonna love 'Frankenstein - Kid Classics' by Mary Shelley");

        } else if (age >= 6 && age <= 12 && genre.contains("Non-fiction")) {
            System.out.println("You're definitely gonna love 'The Way Things Work' by David Macaulay");

        } else if (age >= 6 && age <= 12 && genre.contains("Science fiction")) {
            System.out.println("You're definitely gonna love 'Ender’s Game' by Orson Scott Card " +
                    "or 'The Little Prince' by Antoine de Saint-Exupery");

        } else if (age >= 6 && age <= 12 && genre.contains("Westerns")) {
            System.out.println("You're definitely gonna love 'Cowboy Camp' by Tammi Sauer");

        } else if (age > 12 && age <= 17 && genre.contains("Adventure")) {
            System.out.println("You're definitely gonna love 'Vingt mille lieues sous les mers' by Verne " +
                    "or 'Treasure Island' by Robert Louis Stevenson");

        } else if (age > 12 && age <= 17 && genre.contains("Classics")) {
            System.out.println("You're definitely gonna love 'Romeo and Juliet' by William Shakespeare");

        } else if (age > 12 && age <= 17 && genre.contains("Comics")) {
            System.out.println("You're definitely gonna love 'Avengers' series by Stan Lee");

        } else if (age > 12 && age <= 17 && genre.contains("Detective")) {
            System.out.println("You're definitely gonna love 'Sherlock Holmes' series by Arthur Conan Doyle");

        } else if (age > 12 && age <= 17 && genre.contains("Fantasy")) {
            System.out.println("You're definitely gonna love 'The Witcher' by Andrzej Sapkowski");

        } else if (age > 12 && age <= 17 && genre.contains("Historical fiction")) {
            System.out.println("You're definitely gonna love 'he Boy in the Striped Pyjamas' by John Boyne");

        } else if (age > 12 && age <= 17 && genre.contains("Horror")) {
            System.out.println("You're definitely gonna love 'Pet Sematary' by Stephen King");

        } else if (age > 12 && age <= 17 && genre.contains("Non-fiction")) {
            System.out.println("You're definitely gonna love 'Sapiens. A Brief History of Humankind' " +
                    "by Yuval Noah Harari");

        } else if (age > 12 && age <= 17 && genre.contains("Science fiction")) {
            System.out.println("You're definitely gonna love 'City' by Clifford Simak " +
                    "or 'Brave New World' by Aldous Huxley");

        } else if (age > 12 && age <= 17 && genre.contains("Westerns")) {
            System.out.println("You're definitely gonna love 'The Last of the Mohicans' by James Cooper");

        } else if (age > 17 && genre.contains("Adventure")) {
            System.out.println("You're definitely gonna love 'The Sea-Wolf' by Jake London " +
                    "or 'The Count of Monte Cristo' by Alexandre Dumas");

        } else if (age > 17 && genre.contains("Classics")) {
            System.out.println("You're definitely gonna love 'Divine Comedy' by Dante Alighieri " +
                    "or 'The Picture of Dorian Gray' by Oskar Wilde");

        } else if (age > 17 && genre.contains("Comics")) {
            System.out.println("You're definitely gonna love 'The Walking Dead' by Image Comics");

        } else if (age > 17 && genre.contains("Detective")) {
            System.out.println("You're definitely gonna love 'Murder on the Orient Express' " +
                    "by Agatha Christie");

        } else if (age > 17 && genre.contains("Fantasy")) {
            System.out.println("You're definitely gonna love 'The Lord of the Rings' by R. R.Tolkien");

        } else if (age > 17 && genre.contains("Historical fiction")) {
            System.out.println("You're definitely gonna love 'All quite on the Western Front' " +
                    "by ErichRemarque");

        } else if (age > 17 && genre.contains("Horror")) {
            System.out.println("You're definitely gonna love 'The Shining' or 'It' by Stephen King");

        } else if (age > 17 && genre.contains("Non-fiction")) {
            System.out.println("You're definitely gonna love 'Scary Smart' by Mo Gawdat");

        } else if (age > 17 && genre.contains("Science fiction")) {
            System.out.println("You're definitely gonna love 'Ring Around the Sun'" +
                    " by Clifford Simak or '1984' by George Orwell");

        } else if (age > 17 && genre.contains("Westerns")) {
            System.out.println("You're definitely gonna love 'The Ox-Bow Incident' " +
                    "by Walter Van Tilburg Clark or 'Hondo' by Louis L’Amour");
        }
    }
}

