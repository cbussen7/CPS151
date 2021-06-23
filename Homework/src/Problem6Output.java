public class Problem6Output {
    public static void main(String[] args)
    {
        guessOutput(7654321);
    } // end main

    public static void guessOutput(int n)
    {
        if (n > 0) {
            System.out.print((n % 10) + " ");
            guessOutput(n / 10);
        }
    } // end guessOutput
}
