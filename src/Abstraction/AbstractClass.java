package Abstraction;

abstract class AbstractClass
{
    abstract void abstractMethod1();


    abstract void abstractMethod2();


    public void nonAbstractMethod1()
    {
      System.out.println("Print non-abstract method 1");
    }

    public void nonAbstractMethod2()
    {
        System.out.println("Print non-abstract method 2");
    }

}

class concreteClass extends AbstractClass
{
    void abstractMethod1()
    {
        System.out.println("Print abstract method 1");
    }

    void abstractMethod2()
    {
        System.out.println("Print abstract method 1");
    }

    public static void main(String[] args)
    {
        concreteClass cc = new concreteClass();
        cc.abstractMethod1();
        cc.abstractMethod2();
        cc.nonAbstractMethod1();
        cc.nonAbstractMethod2();

    }

}
