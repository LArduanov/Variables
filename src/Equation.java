public class Equation {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 1;
        System.out.println("Решаем квадратное уравнение, вида:");
        System.out.println("ax^2 + bx + c = 0");
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень х1 = " + x1);
            System.out.println("Второй корень х2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет 1 корень х = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
