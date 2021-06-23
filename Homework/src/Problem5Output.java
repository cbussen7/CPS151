public class Problem5Output {
    public static void main(String[] args)
    {
        System.out.println("Sum = " + guessResult(4));
    } // end main

    public static int guessResult(int n)
    {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = n + guessResult(n - 1);
        }
        return result;
    } // end guessOutput
} // end Exercise5

