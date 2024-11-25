import java.util.Scanner;

public class CircleAndSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        scanner.close();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * radius * radius;

        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);
        System.out.printf("Volume of the sphere: %.2f\n", volume);
        System.out.printf("Surface area of the sphere: %.2f\n", surfaceArea);
    }
}
