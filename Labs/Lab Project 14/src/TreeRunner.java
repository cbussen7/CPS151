/*
 * TreeRunner.java
 * Christopher Bussen, bussenc1
 */

public class TreeRunner {
    public static void main(String[] args){
        //create a Tree object for the main tree
        Tree mainTree = new Tree("a");

        //create Tree objects for the second level of the tree
        Tree secondLevelLeft = new Tree("b");
        Tree secondLevelRight = new Tree("c");

        //create Tree objects for the third level of the tree
        Tree thirdLevelLeftLeft = new Tree("d");
        Tree thirdLevelLeftRight = new Tree("e");
        Tree thirdLevelRightLeft = new Tree("f");
        Tree thirdLevelRightRight = new Tree("g");

        //add the second level of the tree to the main tree
        mainTree.addSubtree(secondLevelLeft);
        mainTree.addSubtree(secondLevelRight);

        //add the left part of the third level of the tree to the left part of the second level
        secondLevelLeft.addSubtree(thirdLevelLeftLeft);
        secondLevelLeft.addSubtree(thirdLevelLeftRight);

        //add the right part of the third level of the tree to the right part of the second level
        secondLevelRight.addSubtree(thirdLevelRightLeft);
        secondLevelRight.addSubtree(thirdLevelRightRight);

        //print the tree using the toString method
        String treeResult = mainTree.toString();
        System.out.println(treeResult);
    }
}
