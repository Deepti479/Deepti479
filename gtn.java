//This code is illustration for guess the number game
import java.util.Scanner;
public class gtn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner class
        //welcome message
        System.out.println("---------------------------------WELCOME TO GUESS THE NUMBER GAME--------------------------------------");
        // number of attempts
        System.out.println("You have 3 attempts to guess the number correctly");

        //number generated by system
        int number= 1 +(int)(100*Math.random());
        //while loop
        int k=3;//signifying number of attempts
        while (k>0) {
         //number  generated by user
        System.out.println("Guess the number :");
        int guess= scanner.nextInt();

        //checking of both the numbers are equal or not
        if (number==guess) {
            System.out.println("Congratulations! You guessed the number right.");
            break;
        } else {
            System.out.println("Oops! You guessed the number wrong");
            if (number>guess) {
                System.out.println(guess+"is less than the number");
            } else {
                System.out.println(guess+"is greater than the number");
            }
            k--;
        }

    }
scanner.close();


    }
}