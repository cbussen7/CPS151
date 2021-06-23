public class HW5RecursivePowerof2 {
    public static void main(String[] args){
        System.out.println(powerOf2(4));
    }

    public static int powerOf2(int n){
        int finalNum = 0;
        if(n==0){
           finalNum = 1;
        }
        else{
            finalNum = powerOf2(n-1) * 2;
        }

        return finalNum;
    }
}
