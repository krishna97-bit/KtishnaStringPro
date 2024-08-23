package Interface;

public interface InterfaceClass1
{
     void parent1Method1();
     void parent1Method2();
     void parent1Method3();
}

 interface InterfaceClass2
{
     void parent2Method1();
     void parent2Method2();
     void parent2Method3();
}

 class ImplementationClass implements InterfaceClass1,InterfaceClass2
{
    public void parent1Method1()
    {
       System.out.println("Parent1 method1");

    };
    public void parent1Method2()
    {
        System.out.println("Parent1 method2");
    };
    public void parent1Method3()
    {
        System.out.println("Parent1 method3");
    };

     public void parent2Method1()
     {
         System.out.println("Parent2 method1");
     };
     public void parent2Method2()
     {
         System.out.println("Parent2 method2");
     };
     public void parent2Method3()
     {
         System.out.println("Parent2 method3");
     };




}

