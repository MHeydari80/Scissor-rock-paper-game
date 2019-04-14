package scissorrockpaper;

import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Scissor[0], Rock[1], Paper[2]");

        int userScore, computerScore, randomNo, userNo;

        userScore = computerScore = 0;

        while (userScore != 3 && computerScore != 3) {

            randomNo = random.nextInt(3);
            userNo = input.nextInt();

            while (userNo < 0 || userNo > 2) {

                System.out.println("You have entered a wrong number. Pick another one.");
                userNo = input.nextInt();

                if (userNo >= 0 && userNo <= 2) {

                    break;
                }

            }

            if (userNo == 0 && randomNo == 1) {

                System.out.printf("The PC is %s. You are %s. PC won.\n",
                        translator(randomNo), translator(userNo));
                computerScore++;

            } else if (userNo == 1 && randomNo == 2) {

                System.out.printf("The PC is %s. You are %s. PC won.\n",
                        translator(randomNo), translator(userNo));
                computerScore++;

            } else if (userNo == 2 && randomNo == 0) {

                System.out.printf("The PC is %s. You are %s. PC won.\n",
                        translator(randomNo), translator(userNo));
                computerScore++;

            } else if (userNo == randomNo) {

                System.out.printf("You and PC both are %s.\n", translator(randomNo));

            } else {

                System.out.printf("The PC is %s. You are %s. You won.\n",
                        translator(randomNo), translator(userNo));
                userScore++;

            }

        }
        
        if (userScore>computerScore) {
            
            System.out.println("\n\nCongratulation! You won.");
            
        }else   {
        
            System.out.println("\n\nNever mind! \t Do it over.");
        
        }
        System.out.printf("\nThe final score is:\n\n PC:%d\tUser:%d\n\n",computerScore,userScore);

    }

    public static String translator(int value) {

        String returnValue = null;

        switch (value) {

            case 0:
                returnValue = "Scissor";
                break;
            case 1:
                returnValue = "Rock";
                break;

            case 2:
                returnValue = "Paper";
                break;

            default:

                System.out.println("The input value is wrong!");
        }

        return returnValue;
    }

}
