import java.util.Scanner;

class StonePaperScissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        infinteloop:
        for (;;)
        {
            System.out.println("***** Welcome ******");
            System.out.println("1. Stone  2. Paper  3. Scissor");
            System.out.println("Enter your response");

            int dgtUser = sc.nextInt();
            String user = "";

            if (dgtUser == 1) user = "Stone";
            else if (dgtUser == 2) user = "Paper";
            else if (dgtUser == 3) user = "Scissor";
            else
            {
                System.out.println("\nInvalid Response");
                continue infinteloop;
            }

            // bot implementation
            int dgtbot;
            do
            {
                dgtbot = (int)(Math.random() * 10);
            }
            while (dgtbot < 1 || dgtbot > 3);

            String bot = "";
            if (dgtbot == 1) bot = "Stone";
            else if (dgtbot == 2) bot = "Paper";
            else bot = "Scissor";

            System.out.printf("%n%10s  %8s", "BOT", "USER");
            System.out.printf("%n%10s  %8s%n", bot, user);

            if (
                (bot.equals("Stone") && user.equals("Paper")) ||
                (bot.equals("Paper") && user.equals("Scissor")) ||
                (bot.equals("Scissor") && user.equals("Stone"))
            )
            {
                System.out.println("***** USER WON *****");
            }
            else if (
                (bot.equals("Stone") && user.equals("Scissor")) ||
                (bot.equals("Paper") && user.equals("Stone")) ||
                (bot.equals("Scissor") && user.equals("Paper"))
            )
            {
                System.out.println("***** BOT WON *****");
            }
            else
            {
                System.out.println("***** IT'S A DRAW *****");
            }
        }
    }
}
