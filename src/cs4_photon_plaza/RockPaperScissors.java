import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Move rock = new Move("Rock");
    Move paper = new Move("Paper");
    Move scissors = new Move("Scissors");

    rock.setStrongAgainst(scissors);
    paper.setStrongAgainst(rock);
    scissors.setStrongAgainst(paper);

    int roundsToWin = 2;
    int userScore = 0;
    int computerScore = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
      System.out.println("1. Start game");
      System.out.println("2. Change number of rounds");
      System.out.println("3. Exit application");
      System.out.print("> ");

      int choice = scanner.nextInt();
      scanner.nextLine();  

      switch (choice) {
          
        case 1:
          playGame(rock, paper, scissors, roundsToWin, userScore, computerScore, scanner);
          break;
          
        case 2:
          System.out.println("Enter the new number of rounds to win:");
          roundsToWin = scanner.nextInt();
          scanner.nextLine();  
          break;
          
        case 3:
          System.out.println("Exiting application");
          return;
          default:
          System.out.println("Invalid choice.");
          
            }
        }
    }

  private static void playGame(Move rock, Move paper, Move scissors, int roundsToWin, int userScore, int computerScore, Scanner scanner) {

      System.out.println("Welcome to Rock Paper Scissors!");

      while (userScore < roundsToWin && computerScore < roundsToWin) {
        System.out.println("Enter your move: ");
        String userMove = scanner.nextLine();

        int random = (int) Math.floor(Math.random() * 3) + 1;
        Move computerMove;

        if (random == 1) computerMove = rock;
        else if (random == 2) computerMove = paper;
        else computerMove = scissors;

        System.out.println("Computer chose: " + computerMove.getName());

        int result = Move.compareMoves(rock, computerMove);

        if (result == 0) {
            System.out.println("You win this round!");
            userScore++;
          } 
          else if (result == 1) {
            System.out.println("Computer wins this round!");
            computerScore++;
          } 
          else {
            System.out.println("It's a tie!");
          }

            System.out.println("Current Score - User: " + userScore + " Computer: " + computerScore);
        }

        if (userScore == roundsToWin) {
          System.out.println("Congratulations! You won the game");
        } 
        else {
          System.out.println("L, the computer won.");
        }
    }
}
