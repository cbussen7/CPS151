// PostcardPrinter.java
// Tester for Postcard class

public class PostcardPrinter
{
    public static void main(String[] args)
    {
        String text = "I am having a great time on\nthe island of Java. Weather\nis great. Wish you were here!";
        Postcard postcard = new Postcard(new Name("Janice", "Jones"), text);
        postcard.setRecipient(new Name("Sue", "Jackson"));
        postcard.print();
        postcard.setRecipient(new Name("Tim", "Thomkins"));
        postcard.print();
    }
}