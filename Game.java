package GuessTheNumber;
import java.util.Random;
import java.util.Scanner;




class RandomNumber{
    int number;
    Random r = new Random();

    public int random(){
        return r.nextInt(11);
    }
}




public class Game {
    public static boolean CorrectChoice(int guess,int number){
        if (guess == number){
            return true;
        }
        return false;
    }
    public static int UserInput(Scanner s){
        int x = s.nextInt();
        return x;
    }
    public static void main(String[] args) {
        int number;
        int guess;
        Scanner s = new Scanner(System.in);

        
        RandomNumber r = new RandomNumber();

        number = r.random();
        int guesses = 1;

        while (guesses <= 3){
            guesses += 1;
            //System.out.println(number);
            System.out.print("Choose a number between 0-10: ");
            guess = UserInput(s);

            if (CorrectChoice(guess,number) == true){
                System.out.println("\n\nYou Won Hurray!!!!!!\n\n");
                break;
            }
            else{
                System.out.println("\n\nWrong You Fool Ha Ha Ha!\n\n");
            }

        }

    }
}

