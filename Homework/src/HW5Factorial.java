public class HW5Factorial {
    public static void main(String[] args){
        System.out.println(recursiveFactorial(16));
        System.out.println(iterativeFactorial(16));
    }

    public static int recursiveFactorial(int n){
        int finalNum = 0;
        if(n==0){
            finalNum = 1;
        }
        else{
            finalNum = recursiveFactorial(n-1) * n;
        }

        return finalNum;
    }

    public static int iterativeFactorial(int n){
        int finalNum = 1;
        for(int i = 1; i <= n; i++){
            finalNum = finalNum * i;
        }

        return finalNum;
    }
}
