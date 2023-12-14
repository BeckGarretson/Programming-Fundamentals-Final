//From 100s List: Make an educational game
//Becker "The Juice" Garretson
import java.util.Scanner;
//Becker "The Juice" Garretson
public class Final{
  //Becker "The Juice" Garretson
  //this method asks if the user wants to play the game or not
  public static void main(String arg[]){
    //Becker "The Juice" Garretson
    Scanner input = new Scanner(System.in);
    //Becker "The Juice" Garretson
    //Asks the user if they'd like to play
    System.out.print("Would you like to play an educational game? (y/n): ");
    //Becker "The Juice" Garretson
    String playOrNah = input.nextLine();
    //Becker "The Juice" Garretson
    //calls on the play method
    if(playOrNah.equals("y")){
      //Becker "The Juice" Garretson
      play();
      //Becker "The Juice" Garretson
      System.out.println("Thanks for trying!");
      //Becker "The Juice" Garretson
    }
    //Becker "The Juice" Garretson
    //berates them for running the program but not playing
    else System.out.println("WHY WOULD YOU RUN THE PROGRAM AND NOT PLAY?!?!.");
    //Becker "The Juice" Garretson
    input.close();
    //Becker "The Juice" Garretson
  }
//where the game is programmed. It is meant to give quick, random math problems that the user has a small amount of time to solve or else
  public static void play(){
    //Becker "The Juice" Garretson
    Scanner scanner = new Scanner (System.in);
    //Becker "The Juice" Garretson
    //Asks user which problem type they want to try
    System.out.println("Which problems would you like to see? a = Addition, s = Subtraction, m = Multiplication, d = Division.");
    //Becker "The Juice" Garretson
    //calls on the MathGame class and its problem type methods.
    String problemType = scanner.nextLine();
    //Becker "The Juice" Garretson
    if(problemType.equals("a")) MathGame.addition();
    //Becker "The Juice" Garretson
    else if(problemType.equals("s")) MathGame.subtraction();
    //Becker "The Juice" Garretson
    else if(problemType.equals("m")) MathGame.multiplication();
    //Becker "The Juice" Garretson
    else if(problemType.equals("d")) MathGame.division();
    //Becker "The Juice" Garretson
    else System.out.println("Invalid Choice");
    //Becker "The Juice" Garretson
  }
  
}
