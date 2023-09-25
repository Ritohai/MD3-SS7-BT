package BT2;

public class StaticMethod {
    static float PI = 3.14f;
    public StaticMethod() {
    }

    public static float getPI() {
        return PI;
    }

    public static void setPI(float PI) {
        StaticMethod.PI = PI;
    }
    public static double calCircleArea(double R) {
        double circleArea = Math.pow(R, 2)*PI;
        return circleArea;
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double avg = (a + b + c) / 2;
        return Math.sqrt(avg * (avg - a) * (avg - b) * (avg - c));
    }
}
