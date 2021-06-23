public class Problem7FixErrors {
    public static void main(String[] args)
    {
        guessOutput(7654321);
    } // end main

    public static void guessOutput(int n) {
        if (n != 0) {
            System.out.println(n);
            guessOutput(n / 10);
        } // end if
    }
}
