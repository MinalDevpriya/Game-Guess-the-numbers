//Computer picks random number
//user guesses
//computer gives clues
//we guess until we get
package GuesstheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner in=new Scanner(System.in);
    int theNumber;
    int max;

     public GuessNumber() {
        Random rand=new Random();
        max=100;
        theNumber=Math.abs(rand.nextInt())%(max+1);
    }
    public void play(){
        while(true) {
            int move = in.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it!");
            }
        }
    }


    public static void howBigIsMyNumber(int x){
        if(x>=0 && x<=10){
            System.out.println("Our number is pretty small");
        } else if (x>=11 && x<=100) {
            System.out.println("Our number is pretty big");
        }
        else{
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {
        GuessNumber guessGame=new GuessNumber();
        System.out.println("Welcome to my game. Try and guess my impossible number");
        guessGame.play();
    }

}
