public class Problem12DisplayArrayBackwards {
    public static void main(String[] args){
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        backwardsArray(newArray, 0);
    }

    public static void backwardsArray(int[] x, int n){
        if(n < x.length){
            backwardsArray(x, n+1);
            System.out.print(x[n] + " ");
        }
    }
}