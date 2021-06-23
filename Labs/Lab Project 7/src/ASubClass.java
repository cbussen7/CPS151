/*
 * ASubClass.java
 * Christopher Bussen, bussenc1
 */

/*
 *
 * Name: Christopher Bussen
 *
 * CPS 151
 * Algorithms & Programming II
 *
 * Lab Project: What can I access?
 *
 * ASubClass.java source code file
 *
 */

import temp.CClass;

public class ASubClass extends AClass
{
    private int asprivate;
    protected int asprotected;
    public int aspublic;
    int aspackage;

    /**
     Think about these declarations
     */
    BClass bobj = new BClass();
    CClass cobj = new CClass();

    /**
     Constructor for objects of class ASubClass
     */
    public ASubClass()
    {
        // Initialize instance variables
        asprivate = 1;
        asprotected = 2;
        aspublic = 3;
        aspackage = 4;
    }

    public int addem()
    {
        //System.out.println(bobj.bprivate);
        //the statement above won't compile because bprivate is a private variable, so only BClass can directly access it
        System.out.println(bobj.bprotected);
        //the statement above will compile because bprotected is a protected variable, and ASubClass is in the same package as BClass
        System.out.println(bobj.bpublic);
        //the statement above will compile because bpublic is a public variable, so any class can access it
        System.out.println(bobj.bpackage);
        //the statement above will compile because bpackage is a variable with default access, and ASubClass is in the same package as BClass
        //System.out.println(cobj.cprivate);
        //the statement above will not compile because cprivate is a private variable, so only CClass can directly access it
        //System.out.println(cobj.cprotected);
        //the statement above will not compile because cprotected is a protected variable, and ASubClass is not in the same package nor is it a subclass of CClass
        System.out.println(cobj.cpublic);
        //the statement above will compile because cpublic is a public variable, so any class can access it
        //System.out.println(cobj.cpackage);
        //the statement above will not compile because cpackage is a variable with default access, and ASubClass is not in the same package as CClass
        //System.out.println(aprivate);
        //the statement above will not compile because aprivate is a private variable, so only AClass can access it
        System.out.println(aprotected);
        //the statement above will compile because aprotected is a protected variable, and ASubClass is a subclass of AClass
        System.out.println(apublic);
        //the statement above will compile because apublic is a public variable, so any class can access it
        System.out.println(apackage);
        //the statement above will compile because apackage is a variable with default access, and ASubClass is in the same package as AClass
        return asprivate + asprotected + aspublic + aspackage
                + aprotected + apublic + apackage;
    }
}