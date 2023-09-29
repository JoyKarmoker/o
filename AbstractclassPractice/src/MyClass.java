public class MyClass extends MyAbstractClass implements MyInterface{
    @Override
    public void unimplementedMethodInAbstractClass() {
        System.out.println("Unimplemented Method of Abstract class is being implemented in Child Class");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("Interface method is being implemented in child class");
    }

    public void commonMethod(String parrentMethod){
        super.commonMethod();
    }

    @Override
    public void commonMethod() {
        System.out.println("Common Method implemented in child class");
    }
}
