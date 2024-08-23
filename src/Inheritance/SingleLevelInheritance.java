package Inheritance;

public class SingleLevelInheritance
{
    public void parentMethod1()
    {
       System.out.println("print parent method1");
    }

    public void parentMethod2()
    {
        System.out.println("print parent method2");
    }
}

class ChildClass extends SingleLevelInheritance
{
    public void childMethod1()
    {
        System.out.println("print child method1");
    }

    public void childMethod2()
    {
        System.out.println("print child method2");
    }

    public static void main(String[] args)
    {
        ChildClass obb =new ChildClass();
        obb.parentMethod1();
        obb.parentMethod2();
        obb.childMethod1();
        obb.childMethod2();

    }
}
