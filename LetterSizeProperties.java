public class LetterSizeProperties {
    public static void main(String[] args) {
        final double INCH_TO_MM = 25.4;
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11.0;

        double widthMM = WIDTH_INCHES * INCH_TO_MM;
        double heightMM = HEIGHT_INCHES * INCH_TO_MM;
        double perimeterMM = 2 * (widthMM + heightMM);
        double diagonalMM = Math.sqrt(Math.pow(widthMM, 2) + Math.pow(heightMM, 2));

        System.out.printf("Width: %.2f mm\n", widthMM);
        System.out.printf("Height: %.2f mm\n", heightMM);
        System.out.printf("Perimeter: %.2f mm\n", perimeterMM);
        System.out.printf("Diagonal: %.2f mm\n", diagonalMM);
    }
}

