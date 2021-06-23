import java.util.Scanner;

public class Problem15FMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nonnegative integer: ");
        try{
            int num = input.nextInt();
            if(num < 0){
                IllegalArgumentException ex = new IllegalArgumentException("Input must be nonnegative");
                throw ex;
            }

            System.out.print(f(num));
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Input must be nonnegative integer");
        }
    }

    public static int f(int n){
        if(n >= 0 && n <= 9){
            return n % 2;
        }
        else{
            return f(n / 10) + (n % 10) % 2;
        }
    }
}
