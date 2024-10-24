public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.areasCalculate());
        System.out.println("Длина окружности: " + Circle.Circumference(circle.getRadius()));
        circle.setRadius(10);
        System.out.println("второй круг: " + circle.getRadius());
        System.out.println("Площадь: " + circle.areasCalculate());
        System.out.println("Длина окружности: " + Circle.Circumference(circle.getRadius()));
    }
}