public class Problem13DisplayStringBackwards {
    public static void main(String[] args){
        String input = "mi pizzeria";
        backwardsString(input, input.length()-1 );
    }

    public static void backwardsString(String x, int stringLength){
        if(stringLength >= 0){
            System.out.print(x.charAt(stringLength));
            backwardsString(x, stringLength-1);
        }
    }
}