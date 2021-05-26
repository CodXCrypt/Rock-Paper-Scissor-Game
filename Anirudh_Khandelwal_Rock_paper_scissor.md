
//Anirudh Khandelwal

package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0:ROCK 1:PAPER 2:SCISSOR");
        int userinput = sc.nextInt();


        Random random = new Random();
        int computerinput = random.nextInt(2);
        System.out.print("Computer Entered ");
        System.out.println(computerinput);

        if (computerinput==userinput){
            System.out.println("Draw");
        }
        else if(computerinput==0&&userinput==2 || computerinput==1&&userinput==0 || computerinput==2&&userinput==1){
            System.out.println("Computer Wins !!");
        }
        else{
            System.out.println("You Win !!");
        }

    }
}