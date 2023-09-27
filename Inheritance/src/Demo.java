interface Computer{
    public void code();
}

class Laptop implements Computer{
    public void code()
    {
        System.out.println("Code Compile Run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code Compile Run Faster");
    }
}

class Developer{
    public void devApp(Computer comp)
    {
        comp.code();
    }
}


public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desktop = new Desktop();
        Developer dev  =new Developer();

        dev.devApp(lap);

    }
}
