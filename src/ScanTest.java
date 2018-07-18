import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj punkt początkowy odcinka pierwszego: ");
        double a = scan.nextDouble();
        System.out.println("Podaj punkt końcowy odcinka pierwszego: ");
        double b = scan.nextDouble();
        System.out.println("Podaj punkt początkowy odcinka drugiego: ");
        double c = scan.nextDouble();
        System.out.println("Podaj punkt końcowy odcinka drugiego: ");
        double d = scan.nextDouble();
        scan.close();

        Point p1 = new Point (a,10);
        Point p2 = new Point(b,10);
        Point p3 = new Point (c,10);
        Point p4 = new Point(d,10);

        Line line1 = new Line (p1, p2);
        Line line2 = new Line (p3, p4);

        Method method = new Method();
        Line longerLine = method.longerLine(line1, line2);

        double line1lenght = line1.getP2().getX() - line1.getP1().getX();
        double line2lenght = line2.getP2().getX() - line2.getP1().getX();

        if(longerLine == line1){
            System.out.println("Line1 jest odcinkiem dłuższym" + "\n" + "Początek: " + a + "\n" + "Koniec: " + b + "\n" + "Długość: " + line1lenght);
        } else {
            System.out.println("Line2 jest odcinkiem dłuższym" + "\n" + "Początek: " + c + "\n" + "Koniec: " + d + "\n" + "Długość: " + line2lenght);
        }
    }
}