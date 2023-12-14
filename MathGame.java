import java.util.Random;
import java.util.Scanner;

public class MathGame {
    private static boolean answer = true;
    //Becker "The Juice" Garretson
    public static void addition(){
        Scanner input = new Scanner(System.in);
        //Source used to find random numbers: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        Random rand = new Random();
        //Finds two random numbers
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        //Loop that asks the question, checks for correctness, and if correct gives a new question
        while(true){
            //Asks addition question
            System.out.println("What is "+rand_int1+" + "+rand_int2+"?");
            //checks if answer is correct
            if(input.nextInt()==(rand_int1+rand_int2)){
                input.nextLine();
                System.out.println("Correct!");
            //if not correct, this breaks the user from the loop
            }else{
                input.nextLine();
                System.out.println("Incorrect!");
                break;
            }
            //changes the two random numbers
            rand_int1 = rand.nextInt(1000);
            //Becker "The Juice" Garretson
            rand_int2 = rand.nextInt(1000);
        }
        input.close();
    }

    public static void subtraction(){
        Scanner input = new Scanner(System.in);
        //Source used to find random numbers: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        Random rand = new Random();
        //Finds two random numbers
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        //Becker "The Juice" Garretson
        //Loop that asks the question, checks for correctness, and if correct gives a new question
        while(true){
            //Asks subtraction question
            System.out.println("What is "+rand_int1+" - "+rand_int2+"?");
            //checks if answer is correct
            if(input.nextInt()==(rand_int1-rand_int2)){
                input.nextLine();
                System.out.println("Correct!");
            //if not correct, this breaks the user from the loop
            }else{
                input.nextLine();
                System.out.println("Incorrect!");
                break;
            }
            //changes the two random numbers
            rand_int1 = rand.nextInt(1000);
            rand_int2 = rand.nextInt(1000);
        }
        input.close();
    }

    public static void multiplication(){
        Scanner input = new Scanner(System.in);
        //Source used to find random numbers: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        Random rand = new Random();
        //Finds two random numbers
        int rand_int1 = rand.nextInt(15);
        //Becker "The Juice" Garretson
        int rand_int2 = rand.nextInt(15);
        //Loop that asks the question, checks for correctness, and if correct gives a new question
        while(true){
            //Asks multiplication question
            System.out.println("What is "+rand_int1+" * "+rand_int2+"?");
            //checks if answer is correct
            if(input.nextInt()==(rand_int1*rand_int2)){
                input.nextLine();
                System.out.println("Correct!");
            //if not correct, this breaks the user from the loop
            }else{
                input.nextLine();
                System.out.println("Incorrect!");
                break;
                //Becker "The Juice" Garretson
            }
            //changes the two random numbers
            rand_int1 = rand.nextInt(15);
            rand_int2 = rand.nextInt(15);
        }
        input.close();
    }
    
    public static void division(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //makes an array of integers with a length of 11
        int[] number = new int[11];
        //adds numbers 0 - 10 to the array
        for(int num = 0; num <= 10; num++){
            number[num] = num;
        }
        int numerator = rand.nextInt(10);
        int denominator = rand.nextInt(3);
        //Becker "The Juice" Garretson
        while(true){
            //gets a random numerator from 
            System.out.println("What is "+number[numerator]+" / "+(number[denominator]+1)+"? (No remainders)");
            if(input.nextInt()==(numerator/(number[denominator]+1))){
                input.nextLine();
                System.out.println("Correct!");
            }else{
                input.nextLine();
                //Becker "The Juice" Garretson
                System.out.println("Incorrect!");
                break;
            }
            numerator = rand.nextInt(10);
            denominator = rand.nextInt(10);
        }
        input.close();
    }
    
}
