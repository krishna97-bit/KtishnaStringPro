package Inheritance;

public class HerarchicalInheritance
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

class class1 extends HerarchicalInheritance
{
    public static void main(String[] args)
    {
        class1 ch1 = new class1();
        ch1.parentMethod1();
        ch1.parentMethod2();

    }

}

class class2 extends HerarchicalInheritance
{
    public static void main(String[] args)
    {
        class2 ch2 = new class2();
        ch2.parentMethod1();
        ch2.parentMethod2();
    }

}
