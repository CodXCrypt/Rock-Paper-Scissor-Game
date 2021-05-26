import java.util.*;
public class Main
{
    enum Move {
        ROCK,
        PAPER,
        SCISSORS
    }
 
    public static String getPlayerMove()
    {
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        String playerChoice = choice.toUpperCase();
        scan.close();
        if(playerChoice.equals("ROCK") || playerChoice.equals("PAPER") || playerChoice.equals("SCISSORS")){
            return playerChoice;
        }else{
            System.out.println("This is not Valid Move, Try again!");
            return "Bad Input";
        }
 
    }
 
    public static String getComputerMove()
    {
        String computerChoice;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1) {
            computerChoice = Move.ROCK.name();
        }
        else if(input == 2) {
            computerChoice = Move.PAPER.name();
        }
        else {
            computerChoice = Move.SCISSORS.name();
        }
        return computerChoice;    
    }
 
    public static void main(String args[]) 
    {
        System.out.println("Welcome to Rock Paper Game! \nYour's Game partner is Computer. \nEnter Your Move:  ");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSORS");
 
        String playerMove = getPlayerMove();
        System.out.println("Your move is: "+ playerMove);
        if(!playerMove.equals("Bad Input")) {
            String computerMove = getComputerMove();
            System.out.println("Computer move is: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("Game is Tie !!");
            }
            // If playerMove is ROCK         
            else if (playerMove.equals(Move.ROCK.name())) {
                if(computerMove.equals(Move.PAPER.name())) {
                    System.out.println("Computer Wins");
                    System.out.println("Better Luck Next Time!");
                }else {
                    System.out.println("You Win!");
                    System.out.println("OOhhOO, Congratulations!!! ");
                }
            }
            // If playerMove is PAPER
            else if (playerMove.equals(Move.PAPER.name())) {
                if(computerMove.equals(Move.SCISSORS.name())) { 
                    System.out.println("Computer Wins");
                    System.out.println("Better Luck Next Time!");
                }
                else { 
                    System.out.println("You Win!");
                    System.out.println("OOhhOO, Congratulations!!! ");
                }
            }
            // If playerMove is SCISSORS    
            else {
                if(computerMove.equals(Move.ROCK.name())) {
                    System.out.println("Computer Wins");
                    System.out.println("Better Luck Next Time!");
                }
                else { 
                    System.out.println("You Win!");
                    System.out.println("OOhhOO, Congratulations!!! ");
                }
            }
        }
    }
}