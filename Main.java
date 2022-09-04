import java.util.HashSet;

public class Main {
    /**
     * @param args
     */
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

        String day = "Thursday";
        switch (day) {
            case "Sunday", "Saturday":
                System.out.println("Enjoy your weekend!");
                break;
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Get ready for school!");
                break;
            default:
                System.out.println("What do you want from breakfast?");
        }

        HashSet<String> classes = new HashSet<String>();
            classes.add("math");
            classes.add("english");
            classes.add("history");
            classes.add("science");
            classes.add("music");
            classes.add("art");
            classes.add("physical education");
        System.out.println(classes);
            classes.remove("art");
        System.out.println(classes);
            classes.add("government");
        System.out.println(classes);

        for (String ele : classes) {
            System.out.println(ele + " ");
        }
    }
}