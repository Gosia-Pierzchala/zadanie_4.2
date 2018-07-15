import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {

        Line line1 = new Line(2,4.3);
        Line line2 = new Line (1.2,5.6);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj punkt początkowy pierwszego odcinka: ");
        line1.pointS = scan.nextDouble();
        System.out.println("Podaj punkt końcowy pierwszego odcinka: ");
        line1.pointE = scan.nextDouble();
        System.out.println("Podaj punkt początkowy drugiego odcinka: ");
        line2.pointS = scan.nextDouble();
        System.out.println("Podaj punkt końcowy drugiego odcinka: ");
        line2.pointE = scan.nextDouble();
        scan.close();

        Method method = new Method();
        method.findLonger(line1, line2);

    }
}
