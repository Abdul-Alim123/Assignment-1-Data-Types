import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        scanner.close();

        double metersToMiles = 0.000621371;
        double metersToFeet = 3.28084;
        double metersToInches = 39.3701;

        double miles = meters * metersToMiles;
        double feet = meters * metersToFeet;
        double inches = meters * metersToInches;

        System.out.printf("%.2f meters is equivalent to:\n", meters);
        System.out.printf("%.2f miles\n", miles);
        System.out.printf("%.2f feet\n", feet);
        System.out.printf("%.2f inches\n", inches);
    }
}
