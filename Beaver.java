public class Beaver {

    // Encapsulation
    private String color;
    private String name;
    private String age;
    private String school;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Beaver(String name, String age, String school) {
        //super(name, age, school);
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void whoAmI() {
    System.out.println("I am " + this.name + ". My family calls me Beaver. I am " + this.age + " years old and I am in " + this.school + ".");
   }
}