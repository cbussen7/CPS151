/*
 * LispListTester.java
 * Christopher Bussen, bussenc1
 */

/*
 * Christopher Bussen
 * bussenc1
 * Programming Project 9
 *
 * Description:
 * program creates lists using the LispList interface as well as the EmptyList and
 * NonEmptyList object classes
 *
 * Bug report:
 * No bugs found - program runs as expected
 */

public class LispListTester {
    public static void main(String[] args) {

        /*
        LispList list1 = new EmptyList();
        System.out.println("[" + list1 + "]");
        System.out.println("Expected: []");

        LispList list2 = new NonEmptyList("A", new EmptyList());
        System.out.println(list2);
        System.out.println("Expected: A");

        LispList list3 = new NonEmptyList("A", new NonEmptyList("B",
                new NonEmptyList("C", new EmptyList())));
        System.out.println(list3);
        System.out.println("Expected: A B C");

        LispList list4 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");
        System.out.println(list4);
        System.out.println("Expected: A B C D E");


         */


        /*
        LispList list1 = new EmptyList();
        System.out.println(list1.length());
        System.out.println("Expected: 0");

        LispList list2 = new NonEmptyList("A", new EmptyList());
        System.out.println(list2.length());
        System.out.println("Expected: 1");

        LispList list3 = new NonEmptyList("A", new NonEmptyList("B",
                new NonEmptyList("C", new EmptyList())));
        System.out.println(list3.length());
        System.out.println("Expected: 3");

        LispList list4 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");
        System.out.println(list4.length());
        System.out.println("Expected: 5");

         */



        /*
        LispList list1 = new EmptyList();

        LispList list2 = new NonEmptyList(1, new NonEmptyList(2, new NonEmptyList(3,
                new EmptyList())));

        LispList list3 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");

        LispList list4 = list3.merge(list2);
        System.out.println(list4);
        System.out.println("Expected: A 1 B 2 C 3 D E");

        System.out.println(list2.merge(list3));
        System.out.println("Expected: 1 A 2 B 3 C D E");

        System.out.println(list1.merge(list2));
        System.out.println("Expected: 1 2 3");

        System.out.println(list2.merge(list1));
        System.out.println("Expected: 1 2 3");

        System.out.println(list2.merge(list2));
        System.out.println("Expected: 1 1 2 2 3 3");

        System.out.println("[" + list1.merge(list1) + "]");
        System.out.println("Expected: []");

         */


        /*
        LispList list1 = new EmptyList();

        LispList list2 = new NonEmptyList(2, new NonEmptyList(4,
                new EmptyList()));

        LispList list3 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");

        System.out.println(list1.contains("E"));
        System.out.println("Expected: false");
        System.out.println(list2.contains(3));
        System.out.println("Expected: false");
        System.out.println(list2.contains(4));
        System.out.println("Expected: true");
        System.out.println(list2.contains("A"));
        System.out.println("Expected: false");

        System.out.println(list3.contains("A"));
        System.out.println("Expected: true");
        System.out.println(list3.contains("D"));
        System.out.println("Expected: true");
        System.out.println(list3.contains("C"));
        System.out.println("Expected: true");
        System.out.println(list3.contains("K"));
        System.out.println("Expected: false");
        System.out.println(list3.contains("Z"));
        System.out.println("Expected: false");
        System.out.println(list3.contains(9));
        System.out.println("Expected: false");

         */



        LispList list1 = new EmptyList();
        System.out.println("[" + list1 + "]");
        System.out.println("Expected: []");

        LispList list2 = LispList.NIL.cons("E").cons("D").cons("C").cons("B").cons("A");
        System.out.println(list2);
        System.out.println("Expected: A B C D E");

        LispList list3 = LispList.NIL.cons("5").cons("4").cons("3").cons("2").cons("1");
        System.out.println(list3);
        System.out.println("Expected: 1 2 3 4 5");

        LispList list4 = list2.append(list3);
        System.out.println(list4);
        System.out.println("Expected: A B C D E 1 2 3 4 5");

        LispList list5 = list1.append(list2);
        System.out.println(list5);
        System.out.println("Expected: A B C D E");

        LispList list6 = list2.append(list1);
        System.out.println(list6);
        System.out.println("Expected: A B C D E");


    }//end main method
}//end public class LispListTester
