package guru.qa;

public class TestHomework {
    public static void main(String[] args) {
        int a = (999999999 + 999999999);
        double b = 4.5;
        int c = 5;
        int d = (99999999 + 99999999);
        int e = (a * d);
        System.out.println(e);
        if (e >= 999999999) {
            System.out.println("Переполнение");
        }
        System.out.println(b + c);
        System.out.println(b / c);
        System.out.println(b - c);
        System.out.println(b * c);
        System.out.println("Комбинации типов данных");
    }
}