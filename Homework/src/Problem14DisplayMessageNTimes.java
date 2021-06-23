public class Problem14DisplayMessageNTimes {
    public static void main(String [] args){
        String message = "This is my sample message";

        displayMessage(message, 5);
    }

    public static void displayMessage(String input, int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(input);
            displayMessage(input,n-1);
        }
    }
}
