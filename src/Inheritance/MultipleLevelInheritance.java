package Inheritance;

public class MultipleLevelInheritance
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

class Child1 extends MultipleLevelInheritance
{
    public void child1Method1()
    {
        System.out.println("print child1 method1");
    }

    public void child1Method2()
    {
        System.out.println("print child1 method2");
    }

}

class Child2 extends Child1
{
    public void child2Method1()
    {
        System.out.println("print child2 method1");
    }

    public void child2Method2()
    {
        System.out.println("print child2 method2");
    }

}

class Child3  extends Child2
{
    public void child3Method1()
    {
        System.out.println("print child3 method1");
    }

    public void child3Method2()
    {
        System.out.println("print child3 method2");
    }

    public static void main(String[] args)
    {
        Child3 ch3 = new Child3();
        ch3.parentMethod1();
        ch3.parentMethod2();
        ch3.child1Method1();
        ch3.child1Method2();
        ch3.child2Method1();
        ch3.child2Method2();
        ch3.child3Method1();
        ch3.child3Method2();


    }

}
