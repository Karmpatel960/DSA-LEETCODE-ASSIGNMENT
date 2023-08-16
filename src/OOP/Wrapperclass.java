package OOP;

public class Wrapperclass {
    public static void main(String[] args) {
        int a =10;

        Integer e =10;
        Integer b =20;

        swap(e,b);

        System.out.println(e + " "+ b);
//
//        final int bouns =10;
//        bouns =20;


//        final A kunal = new A("Kunal");
//        kunal.name = "ther";
//        kunal = new A("new obj"); // it will not work

//        A obj;
//        for (int i = 0; i < 100000000; i++) {
//            obj = new A("Random");
//        }

    }

    private static void swap(Integer e, Integer b) {
        Integer temp = e;
        e = b;
        b = temp;
    }




}

class A{
    final int a =10;
    String name ;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
