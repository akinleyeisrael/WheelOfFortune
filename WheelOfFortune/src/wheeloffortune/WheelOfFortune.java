package wheeloffortune;

import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WheelOfFortune {
	//how the game works
    //to get a random number -- rolling the wheel
    //you have to buy a vowel
    //first player plays until he say he does not want to go again
    //if he says no.he gets message if he wants to continue
    //then pases on to the next player2
    //guess buys a vowel of 250 dollars to complete the word
    //if the money is less than 250 dollars reject it

    public static void Welcome() {

        String players[] = new String[2];
        int currentPlayer = 0;
        
        for (int i = 1; i <= 2; i++) {

//    	while (play == 1) {
            int RollTheWheel = 0;
            Random rand = new Random();   //Generate the random number from 100 to 1000
            RollTheWheel = rand.nextInt(900) + 100;

            System.out.println("your money is" + RollTheWheel);

            Object[] options = {"Yes",
                "No",};
            int choice = JOptionPane.showOptionDialog(null,
                    "Do you want to buys a vowel?",
                    "Enjoyed the game",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    null);
            if (choice == 0) {
                int AmountLeft = RollTheWheel - 250;
                System.out.println("Your money remains" + AmountLeft);

            } else if (RollTheWheel < 250) {
                JOptionPane.showMessageDialog(null, "sorry you dont have enough money for the game");
          
            } 
            else{
                break;
            }
        }
    }
//    	}
    //next to add money

    public static void main(String[] args) {
  //      Welcome();
        System.out.println("Welcome to the wheel of fortune");
        int Players[] = new int[]{2};
        int Player = 1;
      
            System.out.println("Welcome player one");
            String puzzle[] = {"p", "r", "i", "n", "c", "e"};
            String display[] = {"_", "_", "_", "_", "_", "_"};
            boolean RightGuess;
            boolean Puzzled = false;
            int score = 0;
            do {
                String guess = JOptionPane.showInputDialog("Guess a letter in the puzzle");
                RightGuess = false;
                for (int i = 0; i < puzzle.length; i++) {
                    if (puzzle[i].equals(guess)) {
                        display[i] = guess;
                        score = i + 10;
                        System.out.println("You have received 10 point ");
                        RightGuess = true;
                    }
                   
                }

                if (RightGuess == true) {   //if the right guess is true
                    JOptionPane.showMessageDialog(null, "cool");
                } else if (RightGuess == false) {
                    System.out.println("The letter is invalid");
                } else {
                  
                    RightGuess = false;
                }
                if (Arrays.equals(puzzle, display)) {
                    JOptionPane.showMessageDialog(null, "You have matched and complted the word successfully");
                    System.exit(0);
                }
            } while (Puzzled == false);
      
        }  //for loop ends here

    //how the game works
    //to get a random number -- rolling the wheel
    //you have to buy a vowel
    //first player plays until he say he does not want to go again
    //if he says no.he gets message if he wants to continue
    //then pases on to the next player2
    //guess buys a vowel of 250 dollars to complete the word
    //if the money is less than 250 dollars reject it
    //next to add money
    public static void show(String display[]) {  //method to show the letter
        for (int i = 0; i < display.length; i++) {
            System.out.print(display[i] + " ");
        }
        System.out.println("");
    }
}
