enum Status {
    Running, Failed, Pending, Success
}


public class Main {
    public static void main(String[] args) {
        Status r = Status.Running;
        System.out.println(r);
        System.out.println(r.ordinal());

        }
    }
