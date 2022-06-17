public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.firstAttribute = 11;
        myClass.secondAttribute = 33;

        myClass.print();
        myClass.max();
        myClass.min();
        myClass.sum();
        System.out.println("Sum: " + myClass.sum());
        System.out.println("Max: " + myClass.max());
        System.out.println("Min: " + myClass.min());
    }

}
