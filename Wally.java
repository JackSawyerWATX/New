abstract class Wally extends Child {

    // Abstraction
    Wally(String name) {
        super();
    }

    @Override
    public abstract void withKite(); {
        System.out.println("I can help the Beaver fix his kite.");
    }
}