import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    String playerName = "";
    boolean inGame = true;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    Integer computerNumber;

    public boolean playGame(){
        Integer userNumber = 0;
        computerNumber = r.nextInt(100);
        while(inGame){
            System.out.println("Im thinking of a number between 1 and 100 guess it I will tell you if its too high or too low");
                while((userNumber instanceof Integer)){
                    try {
                        userNumber = sc.nextInt();
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("you entered an invalid number try again");
                        sc.nextLine();
                    }
                }

            if(userNumber > computerNumber){
                System.out.println("too high try again");
            }else if(userNumber < computerNumber){
                System.out.println("too low try again");
            }else{
                System.out.println("You correctly guess the number: " + computerNumber);
                return true;
            }
        }
        return false;
    }


    public static void main (String [] args){
        GuessingGame g = new GuessingGame();
        System.out.println("Hello player type your name and press enter");
        g.playerName = g.sc.next();
        System.out.println("Hello: " + g.playerName);
        g.playGame();
    }
}
