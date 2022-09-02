import java.util.Scanner;

abstract class Ward extends Parent {

    Ward(String martini) {
        super();
    }

    @Override
    public abstract void martini();
    {
        try (Scanner question = new Scanner(System.in)) {
            String answer;

            // Enter answer and press Enter
            System.out.println("Would you like a martini?");
            answer = question.nextLine();

            System.out.println(answer + ". Okay.");
        }
    }
    
}