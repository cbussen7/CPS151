public class Problem11DisplayArrayBackwards {
    public static void main(String[] args){
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        backwardsArray(newArray, newArray.length-1);
    }

    public static void backwardsArray(int[] x, int arraySize){
        if(arraySize >= 0){
            System.out.print(x[arraySize] + " ");
            backwardsArray(x, arraySize-1);
        }
    }
}
