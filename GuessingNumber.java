import java.util.Scanner;
public class GuessingNumber {
    public static void playGame(){
        Scanner sc = new Scanner(System.in);
        int secretNumber = 1+(int)(100*Math.random());
        int maxAttempts = 4;
        int attempt,guess;
        System.out.println("Welcome to guessing number game");
        System.out.println("You have only 4 number of attemps"+"\n"+"And guessed number should be between the range of 1 to 100 only");
        for(attempt = 0; attempt < maxAttempts;attempt++){
            System.out.println("Your"+" "+ (attempt+1)+" "+"attempt is:");
            guess = sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Congratulations!! You have guessed the correct number");
                break;
            }else if(guess>secretNumber && attempt != maxAttempts-1){
                System.out.println("Your number is greater than the secretNumber"+"\n"+"Please guess a smaller number");
            }else if(guess<secretNumber && attempt != maxAttempts-1){
                System.out.println("Your number is lesser than the secretNumer"+"\n"+"Please guess a bigger number");
            }
        }
        
        if(attempt == maxAttempts){
            System.out.println("Sorry you have exceeded the maxAttemps");
            System.out.println("And the secretNumber is:"+secretNumber);
            System.out.println("Better luck next time");
        }
        
    }
    public static void main(String[] args){
        playGame();
    }
}