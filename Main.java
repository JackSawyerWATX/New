public class Main {
    public static void main(String[] args) {

        // Inheritance
        Parent parent = new Parent();
        parent.name = "Ward";
        parent.greeting();

        Child child = new Child();
        child.name = "Wally";
        child.age = 15;
        child.greeting();

        // Encapsulation
        Beaver youngest = new Beaver("Theodore Cleaver", "12", "junior high");
        youngest.setColor("red");
        System.out.println("The Beaver brought home a new " + youngest.getColor() + " kite.");
        
        // Call the whoAmI method
            youngest.whoAmI();
        // Polymorphism

    }

}