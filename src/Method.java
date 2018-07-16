public class Method {
    Line line1 = new Line(2,4.3);
    Line line2 = new Line (1.2,5.6);

    void findLonger (Line line1, Line line2){
        if((line1.point.pointE - line1.point.pointS) > (line2.point.pointE - line2.point.pointS)){
            System.out.println("Odcinek pierwszy jest dłuższy\n" + "Początek: " + line1.point.pointS + ", " + "Koniec: " + line1.point.pointE + ", " + "Długość: " + (line1.point.pointE - line1.point.pointS));
        } else if (((line1.point.pointE - line1.point.pointS) == (line2.point.pointE - line2.point.pointS))){
            System.out.println("Odcinki są równe.\n" + "Początek pierwszego odcinka: " + line1.point.pointS + ", " + "Koniec pierwszego odcinka: " + line1.point.pointE + ", " + "Długość pierwszego odcinka: " + (line1.point.pointE - line1.point.pointS) + "\n" + "Początek drugiego odcinka: " + line2.point.pointS + ", " + "Koniec drugiego odcinka: " + line2.point.pointE + ", " + "Długość drugiego odcinka: " + (line2.point.pointE - line2.point.pointS));
        } else {
            System.out.println("Odcinek drugi jest dłuższy\n" + "Początek: " + line2.point.pointS + ", " + "Koniec: " + line2.point.pointE + ", " + "Długość: " + (line2.point.pointE - line2.point.pointS));

        }
    }
}
