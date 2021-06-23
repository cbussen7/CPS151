/*
 * BClass.java
 * Christopher Bussen, bussenc1
 */

/*
 *
 * Name: Christopher Bussen
 *
 * CPS 151
 * Algorithms & Programming II
 *
 * Lab Project: What can I access? (Java Member Access Modifiers)
 *
 * BClass.java source code file
 *
 */

public class BClass
{
    private int bprivate;
    protected int bprotected;
    public int bpublic;
    int bpackage;

    /**
     Constructor for objects of class BClass.
     */
    public BClass()
    {
        // Initialize instance variables
        bprivate = 1;
        bprotected = 2;
        bpublic = 3;
        bpackage = 4;
    }

    public int addem()
    {
        return bprivate + bprotected + bpublic + bpackage;
    }
}