package Abstraction;

abstract class AbstractToAbstractClass
{
    abstract void parentAbstract1();
    abstract void parentAbstract2();
    abstract void parentAbstract3();
}

abstract class ChildClass1 extends AbstractToAbstractClass
{
    abstract void ChildClass1Abstract1();
    abstract void ChildClass1Abstract2();
    abstract void ChildClass1Abstract3();
}

abstract class ChildClass2 extends ChildClass1
{
    abstract void ChildClass2Abstract1();
    abstract void ChildClass2Abstract2();
    abstract void ChildClass2Abstract3();
}



class ConcreteClass1 extends ChildClass2
{
    void parentAbstract1()
    {
        System.out.println("Parent method 1");
    };
    void parentAbstract2()
    {
            System.out.println("Parent method 2");
    }
    void parentAbstract3()
    {
            System.out.println("Parent method 3");
    };

     void ChildClass1Abstract1()
     {
         System.out.println("Child1 method 1");
     };
     void ChildClass1Abstract2()
     {
         System.out.println("Child1 method 2");
     };
    void ChildClass1Abstract3()
    {
        System.out.println("Child1 method 3");
    };

     void ChildClass2Abstract1()
     {
         System.out.println("Child2 method 1");
     };
     void ChildClass2Abstract2()
     {
         System.out.println("Child2 method 2");
     };
    void ChildClass2Abstract3()
    {
        System.out.println("Child2 method 3");
    };

    public static void main(String[] args)
    {
        ConcreteClass1 cc1 = new ConcreteClass1();
        cc1.parentAbstract1();
        cc1.parentAbstract2();
        cc1.parentAbstract3();
        cc1.ChildClass1Abstract1();
        cc1.ChildClass1Abstract2();
        cc1.ChildClass1Abstract3();
        cc1.ChildClass2Abstract1();
        cc1.ChildClass2Abstract2();
        cc1.ChildClass2Abstract3();

    }

}
