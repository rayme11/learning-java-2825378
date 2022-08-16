package ControlFlow;

import java.util.Scanner;

public class WhileLoopsChallenge {

    public static void main(String[] args) {

        String goodAnswer = "blue";
        int failedTimes = 1;

        Scanner input = new Scanner(System.in);

        while(failedTimes <= 5){
            if (failedTimes == 4) {
                System.out.println("Sorry, you tried enough,, exiting the program...");
                break;
            }
            System.out.println("Please enter your fav color");
            String answer = input.next();
            if (answer.equals(goodAnswer)){
                System.out.println("You got the perfect answer --- CONGRATS");
                break;
            }
            else {
                System.out.println("You got the wrong color - keep trying !" + " attempts made: " + failedTimes );
                failedTimes++;
            }



        }
    }
}
