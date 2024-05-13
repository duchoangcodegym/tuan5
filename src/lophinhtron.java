import java.util.Scanner;

public class lophinhtron {
    private double radius;
    public lophinhtron(double radius) {
        this.radius = radius;
    }
    public lophinhtron() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(": ");
        this.radius = scanner.nextDouble();
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        lophinhtron lophinhtron = new lophinhtron();
        System.out.println("Radius: " + lophinhtron.getRadius());
        System.out.println("Diện tích : " + lophinhtron.getArea());
        System.out.println("Chu Vi: " + lophinhtron.getCircumference());
    }
}
