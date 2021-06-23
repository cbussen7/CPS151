/*
 * VendingMachineTester.java
 * Christopher Bussen, bussenc1
 */

public class VendingMachineTester {
    public static void main(String[] args) {
        VendingMachine machine1 = new VendingMachine(); // machine 1 initially has 10 cans
        machine1.fillUp(10); // Fill up with ten cans
        machine1.insertToken();
        machine1.insertToken();
        System.out.print("Token count: ");
        System.out.println(machine1.getTokenCount());
        System.out.println("Expected: 2 tokens");
        System.out.print("Can count: ");
        System.out.println(machine1.getCanCount());
        System.out.println("Expected: 18 cans");

        VendingMachine machine2 = new VendingMachine(); // 10 cans already in machine 2
        machine2.fillUp(15); // Add 5 more cans to the machine
        machine2.insertToken();
        machine2.insertToken();
        machine2.insertToken();
        System.out.print("Token count: ");
        System.out.println(machine2.getTokenCount());
        System.out.println("Expected: 3 tokens");
        System.out.print("Can count: ");
        System.out.println(machine2.getCanCount());
        System.out.println("Expected: 22 cans");
    }//end main method
}//end public class VendingMachineTester
