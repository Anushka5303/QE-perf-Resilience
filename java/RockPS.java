import java.util.Random;
import java.util.Scanner;

public class RockPS { 
    static String getChoice(int n) {
        if (n == 1) return "Stone";
        if (n == 2) return "Paper";
        return "Scissor";
    }
    public static void main(String[] args) {

        String stone_stone = "Stone = Stone (Tie)";
        String stone_paper = "Stone < Paper (Paper wins)";
        String stone_scissor = "Stone > Scissor (Stone wins)";

        String paper_stone = "Paper > Stone (Paper wins)";
        String paper_paper = "Paper = Paper (Tie)";
        String paper_scissor = "Paper < Scissor (Scissor wins)";

        String scissor_stone = "Scissor < Stone (Stone wins)";
        String scissor_paper = "Scissor > Paper (Scissor wins)";
        String scissor_scissor = "Scissor = Scissor (Tie)";
        
        Scanner sc = new Scanner(System.in);


        System.out.println("1)2 player \n2)1 player");

        

        System.out.print("Enter 1 or 2: ");
        int num = sc.nextInt();

        if(num==1)
        {
            System.out.println("1.Rock || 2.Paper || 3.Scissor");
            int a = sc.nextInt();
            if(a!=1 && a!=2 && a!=3)
            {
                System.out.println("Enter valid option");
            }else{
                Random random = new Random();

                int b = random.nextInt(3) + 1; 

                
                System.out.println("You chose: " + getChoice(a));
                System.out.println("Computer chose: " + getChoice(b));

                // ---- Result ----
                if (a == 1 && b == 1) System.out.println(stone_stone);
                else if (a == 1 && b == 2) System.out.println(stone_paper);
                else if (a == 1 && b == 3) System.out.println(stone_scissor);

                else if (a == 2 && b == 1) System.out.println(paper_stone);
                else if (a == 2 && b == 2) System.out.println(paper_paper);
                else if (a == 2 && b == 3) System.out.println(paper_scissor);

                else if (a == 3 && b == 1) System.out.println(scissor_stone);
                else if (a == 3 && b == 2) System.out.println(scissor_paper);
                else if (a == 3 && b == 3) System.out.println(scissor_scissor);
                
            }
        }
        else{
            System.out.println("1.Rock || 2.Paper || 3.Scissor");
            System.out.println("Player1: ");
            int a = sc.nextInt();
            
            System.out.println("Player2: ");
            int b = sc.nextInt();

            String p1 = getChoice(a);
            String p2 = getChoice(b);
            // ---- Result ----
                if (a == 1 && b == 1) System.out.println(stone_stone);
                else if (a == 1 && b == 2) System.out.println(stone_paper);
                else if (a == 1 && b == 3) System.out.println(stone_scissor);

                else if (a == 2 && b == 1) System.out.println(paper_stone);
                else if (a == 2 && b == 2) System.out.println(paper_paper);
                else if (a == 2 && b == 3) System.out.println(paper_scissor);

                else if (a == 3 && b == 1) System.out.println(scissor_stone);
                else if (a == 3 && b == 2) System.out.println(scissor_paper);
                else if (a == 3 && b == 3) System.out.println(scissor_scissor);
        }
    }
}
