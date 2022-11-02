import java.util.Scanner;
import java.util.Random;

class Game{
    int noOfGuesses = 5;
    int randNum;

    public Game(){
        Random randomNum = new Random();
        randNum = randomNum.nextInt(100);
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        return userInput;
    }

    public String isCorrectNumber(int userInput){
        if(userInput == randNum){
            return "You Won the Game!!";
        }else{
            if(userInput > randNum){
                return "Your number is higher than the original no.";
            }else{
                return "Your number is smaller than the original no.";
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        int noOfGuesses = newGame.noOfGuesses;

        System.out.println("Ans is " + newGame.randNum);
        System.out.println("You have " + noOfGuesses + " Chances left\n");

        int userInput;
        while(true){
            noOfGuesses -= 1;
            System.out.print("Enter the No. for a Guess: ");
            userInput = newGame.takeUserInput();
            String ans = newGame.isCorrectNumber(userInput);
            System.out.println(ans);
            if (noOfGuesses < 1 || ans.equals("You Won the Game!!")){
                break;
            }
        }
    }
}