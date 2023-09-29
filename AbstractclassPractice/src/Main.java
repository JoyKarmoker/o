// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.protectedVariable = 20;
        myClass.publicVariable = 30;

        System.out.println("Public Variable from abstract class " + myClass.publicVariable);
        System.out.println("Protected Variable from abstract class " + myClass.protectedVariable);
        System.out.println("Public Variable from Interface Class " +myClass.publicInterFaceVariable);
        // Call commonMethod from MyClass
        myClass.commonMethod();
        //Implements commonMethod From Abstract Class
        myClass.commonMethod("p");

    }
}