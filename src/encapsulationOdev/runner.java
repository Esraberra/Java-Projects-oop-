package encapsulationOdev;

public class runner {

    public static void main(String[] args) {

        myMethod();

    }

    private static void myMethod() {

        subClass cons=new subClass();
        System.out.println(cons.goster());
        System.out.println(cons.num);
        
        super1 cons2=new super1();
        System.out.println(cons2.goster());
        System.out.println(cons2.num);

    }
}
