import java.util.Stack;

public class HW7Q8PushAndPopAlphabet {
    public static void main(String[] args){
        Stack<String> alphabet = new Stack<>();
        Stack<String> alphabet2 = new Stack<>();

        alphabet.push("a");
        alphabet.push("b");
        alphabet.push("c");
        alphabet.push("d");
        alphabet.push("e");
        alphabet.push("f");
        alphabet.push("g");
        alphabet.push("h");
        alphabet.push("i");
        alphabet.push("j");
        alphabet.push("k");
        alphabet.push("l");
        alphabet.push("m");
        alphabet.push("n");
        alphabet.push("o");
        alphabet.push("p");
        alphabet.push("q");
        alphabet.push("r");
        alphabet.push("s");
        alphabet.push("t");
        alphabet.push("u");
        alphabet.push("v");
        alphabet.push("w");
        alphabet.push("x");
        alphabet.push("y");
        alphabet.push("z");

        while(!alphabet.isEmpty()){
            alphabet2.push(alphabet.peek());
            alphabet.pop();
        }

        while(!alphabet2.isEmpty()){
            System.out.print(alphabet2.pop() + " ");
        }
    }
}
