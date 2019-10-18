import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /*//String word;
        //System.out.println("Pick a word.");
        //Scanner mrScanner = new Scanner(System.in);
        //word = mrScanner.next();
        //int num = mrScanner.nextInt();
        //System.out.println("The word is: " + word);
        //System.out.println("The number is: " + num);
        //System.out.println(word);
        //System.out.println(num);
        //double randomNumber = (int)(Math.random()*3+1);
        //System.out.println(randomNumber);*/
        boolean game_running = true;

        while (game_running) {
            int playerchoice;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Rock, Paper, Scissors!");
            System.out.println("(Please select 1, 2 or 3)");
            int rock = 1;
            int paper = 2;
            int scissors = 3;
            playerchoice = scanner.nextInt();
            int com = (int) (Math.random() * 3 + 1);

            if (com == rock) {
                if (playerchoice == paper) {
                    System.out.println("Computer chose rock...");
                    System.out.println("You chose paper...");
                    System.out.println("You won!");
                } else if (playerchoice == rock) {
                    System.out.println("Computer chose rock...");
                    System.out.println("You chose rock...");
                    System.out.println("You tied!");
                } else if (playerchoice == scissors) {
                    System.out.println("Computer chose rock...");
                    System.out.println("You chose scissors...");
                    System.out.println("You lost!");
                }
            } else if (com == paper) {
                if (playerchoice == rock) {
                    System.out.println("Computer chose paper...");
                    System.out.println("You chose rock...");
                    System.out.println("You lost!");
                } else if (playerchoice == paper) {
                    System.out.println("Computer chose paper...");
                    System.out.println("You chose paper...");
                    System.out.println("You tied!");
                } else if (playerchoice == scissors) {
                    System.out.println("Computer chose paper...");
                    System.out.println("You chose scissors...");
                    System.out.println("You won!");
                }
            } else if (com == scissors) {
                if (playerchoice == rock) {
                    System.out.println("Computer chose scissors...");
                    System.out.println("You chose rock...");
                    System.out.println("You won!");
                } else if (playerchoice == scissors) {
                    System.out.println("Computer chose scissors...");
                    System.out.println("You chose scissors...");
                    System.out.println("You tied!");
                } else if (playerchoice == paper) {
                    System.out.println("Computer chose scissors...");
                    System.out.println("You chose paper...");
                    System.out.println("You lost!");

                }

            }

        }

    }
}




