public class Problem9CharacterRow {
    public static void main(String[] args){
        displayRowOfCharacters('*', 5);
    }

    public static void displayRowOfCharacters(char x, int y){
        if (y >= 1) {
            System.out.print(x);
            displayRowOfCharacters(x, y - 1);
        }
    }
}
