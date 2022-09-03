import java.util.Scanner;

abstract class Wally extends Child {

    // Abstraction
    Wally(String name) {
        super();
    }

    @Override
    public abstract void withKite();

    {
        System.out.println("I can help the Beaver fix his kite.");
    }

    public static void main(String[] args) {
        System.out.println("Where is Theodore?");
        String[] whereIsBeaver = { "outside", "In his room", "at school" };

        Beaver beaver = new Beaver(whereIsBeaver);
        try (Scanner scan = new Scanner(beaver)) {
        } catch (Exception x) {
            System.out.println("Tell him to come home.");
        }
    }
    
}
