public class Problem16JackAndJill {
    public static void main(String[] args){
        System.out.println("10 gallons, jill starts: " + emptyWell(10, 0, false));
    }

    public static int emptyWell(int gallons, int count, boolean jackTurn){
        if(jackTurn){
            gallons--;
            count++;
            jackTurn = false;
        }
        else{
            if(gallons % 2 == 0){
                gallons = gallons - 2;
            }
            else{
                gallons--;
            }
            count++;
            jackTurn = true;
        }

        if(gallons <= 0){
            return count;
        }
        else{
            return emptyWell(gallons, count, jackTurn);
        }
    }
}
