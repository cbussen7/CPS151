public class HW5RecursiveGift1 {
    public static void main(String[] args){
        giftBox(5);
    }

    public static void giftBox(int n) {
        if (n == 0) {
            System.out.println("gift");
        } else {
            System.out.println("box");
            giftBox(n - 1);
        }

    }
}
