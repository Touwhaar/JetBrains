package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is FarmDreamBot.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        
        int invoer = scanner.nextInt();

        for (int i =0; i <= invoer; i++ ){
            System.out.println(i + "!");
        }
        System.out.println("Let's test your iq level.");
        System.out.println("What is the best way to live out your days?");
        System.out.println("1. Working my 9 to 5 in the office.");
        System.out.println("2. Working own my own farm property and providing with my own produce.");
        System.out.println("3. Working remotely as a freelancer in different country.");

        while (scanner.nextInt() != 2) {
            System.out.println("Please try again");
        }
            System.out.println("Congratulations, have a nice day!");





    }
}
