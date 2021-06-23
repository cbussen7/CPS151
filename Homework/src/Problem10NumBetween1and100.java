import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem10NumBetween1and100 {
    public static void main(String[] args) {
        try {
            int number = inRange();
            System.out.println(number);
        }
        catch (InputMismatchException ex){
            System.out.println("Input must be int");
        }
    }

    public static int inRange() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 100 (inclusive): ");
        int userNum = input.nextInt();

        if(userNum < 1 || userNum > 100) {
            System.out.println("Please enter valid int");
            userNum = inRange();
        }

        return userNum;
    }
}
