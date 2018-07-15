public class Method {
    Line line1 = new Line(2,4.3);
    Line line2 = new Line (1.2,5.6);

    void findLonger (Line line1, Line line2){
        if((line1.pointE - line1.pointS) > (line2.pointE - line2.pointS)){
            System.out.println("Odcinek pierwszy jest dłuższy\n" + "Początek: " + line1.pointS + ", " + "Koniec: " + line1.pointE + ", " + "Długość: " + (line1.pointE - line1.pointS));
        } else if (((line1.pointE - line1.pointS) == (line2.pointE - line2.pointS))){
            System.out.println("Odcinki są równe\n" + "Początek: " + line1.pointS + ", " + "Koniec: " + line1.pointE + ", " + "Długość: " + (line1.pointE - line1.pointS));
        } else {
            System.out.println("Odcinek drugi jest dłuższy\n" + "Początek: " + line2.pointS + ", " + "Koniec: " + line2.pointE + ", " + "Długość: " + (line2.pointE - line2.pointS));

        }
    }
}
