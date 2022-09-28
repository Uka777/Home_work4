package guru.qa;

public class TestHomework {
    public static void main(String[] args) {
        int a = (2147483647 + 1);
        double b = 4.5;
        int c = 5;
        byte d = 127;
                System.out.println(a);
        if (a > 2147483647) {
            System.out.println("Переполнение");
        }
        System.out.println(b + c);
        System.out.println(b / c);
        System.out.println(b - c);
        System.out.println(b * c);
        System.out.println("Комбинации типов данных");
    }
}