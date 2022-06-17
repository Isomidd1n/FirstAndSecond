public class MyClass {
    int firstAttribute;
    int secondAttribute;

    public void print(){
        System.out.println("firstAttribute: " + firstAttribute + "\nsecondAttribute: " + secondAttribute);
    }
    public int sum(){
        return firstAttribute + secondAttribute;
    }
    public int max() {
        if (firstAttribute > secondAttribute) {
            return (firstAttribute);
        }else {
            return (secondAttribute);
        }
    }
    public int min() {
        if (firstAttribute < secondAttribute) {
            return (firstAttribute);
        }else {
            return (secondAttribute);
        }
    }
}
