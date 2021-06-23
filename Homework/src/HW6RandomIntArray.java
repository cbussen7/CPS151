import java.util.Arrays;
import java.util.Scanner;

public class HW6RandomIntArray {
    public static void main(String[] args){
        int[] numArray = new int[100];
        for(int i = 0; i < 100; i++){
            numArray[i] = (int) (Math.random() * 1000) + 1;
        }

        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }

        System.out.println();

        Arrays.sort(numArray);
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }

        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int keyValue = input.nextInt();
        int index = Arrays.binarySearch(numArray, keyValue);
        if(index >= 0){
            System.out.println("Value found at index " + index);
        }
        else{
            System.out.println("Value should be added at position " + ((index * -1) - 1));
        }

    }
}
