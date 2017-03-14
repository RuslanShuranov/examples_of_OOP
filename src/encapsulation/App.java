package encapsulation;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Boat myBoat = new Boat();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        myBoat.setCourse(scanner.nextFloat());
        System.out.println(myBoat.getCourse());

    }
}
