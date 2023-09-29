abstract class MyAbstractClass {
    public int publicVariable = 10;
    public int protectedVariable = 20;

    private int privateVariable = 30;

    public abstract void unimplementedMethodInAbstractClass();

    public void implementedMethodInAbstractClass()
    {
        System.out.println("Method Implemented Inside Abstract Class");
    }

    public void commonMethod()
    {
        System.out.println("Abstract Class Implementation");
    }

}
