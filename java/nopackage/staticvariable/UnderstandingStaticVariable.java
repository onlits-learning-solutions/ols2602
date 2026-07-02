public class UnderstandingStaticVariable {
    public static void main(String[] args) {
        StaticVariable ob1 = new StaticVariable();
        StaticVariable ob2 = new StaticVariable();
        ob1.setA(50);
        ob2.setA(500);

        ob1.setB(30);
        ob2.setB(300);

        System.out.println("ob1.a = " + ob1.getA() + "; ob1.b = " + ob1.getB());
        System.out.println("ob2.a = " + ob2.getA() + "; ob2.b = " + ob2.getB());
    }
}
