/*
 * AClass.java
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
 * AClass.java source code file
 *
 */

import temp.CClass;

public class AClass
{
    private int aprivate;
    protected int aprotected;
    public int apublic;
    int apackage;
    static int noAObjects = 0;

    /**
     Think about these declarations
     */
    BClass bobj = new BClass();
    CClass cobj = new CClass();

    /**
     Constructor for objects of class AClass.
     */
    public AClass()
    {
        // Initialize instance variables
        aprivate = 1;
        aprotected = 2;
        apublic = 3;
        apackage = 4;
        noAObjects ++;
    }

    public int addem()
    {
        //System.out.println(bobj.bprivate);
        //the above statement won't compile because bprivate is a private int variable, so only BClass can directly access it
        System.out.println(bobj.bprotected);
        //the above statement will compile because bprotected is a protected variable, and AClass is in the same package as BClass
        System.out.println(bobj.bpublic);
        //the above statement will compile because bpublic is a public variable, so any class can access it
        System.out.println(bobj.bpackage);
        //the above statement will compile because bpackage is a variable with default access, and AClass is in the same package as BClass
        //System.out.println(cobj.cprivate);
        //the above statement won't compile because cprivate is a private int variable, so only CClass can directly access it
        //System.out.println(cobj.cprotected);
        //the above statement won't compile because cprotected is a protected int variable, and AClass is not a subclass of CClass nor is it in the same package
        System.out.println(cobj.cpublic);
        //the above statement will compile because cpublic is a public variable, so any class can access it
        //System.out.println(cobj.cpackage);
        //the above statement won't compile because cpackage is an int variable with package (default) access, so only classes in the same package can directly access it (CClass is in temp package, AClass isn't)
        return aprivate + aprotected + apublic + apackage;
    }
}