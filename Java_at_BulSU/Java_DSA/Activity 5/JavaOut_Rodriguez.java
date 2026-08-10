import java.util.FormatFlagsConversionMismatchException;

public class JavaOut_Rodriguez {
    public static void main(String[] args) {
        System.out.print("Hey there! ");
        System.out.print("I'm a future ComSci Pro \uD83D\uDE80");

        System.out.println();

        System.out.println("\uD83C\uDFAE I  love gaming after coding");
        System.out.println("\uD83D\uDCBB My dream is to build the next viral app.");
        System.out.println("\uD83D\uDCF1 You'll probably catch me on Discord or Github.");

        int age = 18;
        double hoursCodingPerDay = 4.567;
        String favoriteLanguage = "Java";

        System.out.printf("\uD83D\uDC64 Age: %d%n", age);
        System.out.printf("\u2328\uFE0F Hours coding daily: %.1f%n", hoursCodingPerDay);
        System.out.printf("\uD83D\uDD25 Favorite Language: %s%n", favoriteLanguage);

        System.out.println("Okay, enough intro. Let's CODE! \uD83D\uDCA1");
    }
}