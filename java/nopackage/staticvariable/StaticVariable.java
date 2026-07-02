public class StaticVariable {
    private int a = 10;
    private static int b = 20;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static void setB(int b) {
        StaticVariable.b = b;
    }

    public static int getB() {
        return b;
    }
}
