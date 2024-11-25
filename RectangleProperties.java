import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        scanner.close();

        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.printf("Area of the rectangle: %.2f\n", area);
        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
        System.out.printf("Length of the diagonal: %.2f\n", diagonal);
    }
}
