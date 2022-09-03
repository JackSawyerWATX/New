public class June {
    String hey;
    String also;
    String and;
    
    public June() {
        hey = "Will you make martinis in the new shaker?";
        also = " I want vodka in mine please, not gin.";
        and = "Oh! And three olives please!";
    }

    public static void main(String[] args) {
        June ques = new June();
        System.out.print(ques.hey);
        System.out.println(ques.also);
        System.out.print(ques.and);
    }
    
}