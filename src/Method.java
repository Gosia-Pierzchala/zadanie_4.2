public class Method {
    public Line longerLine (Line line1, Line line2){
        double line1lenght = line1.getP2().getX() - line1.getP1().getX();
        double line2lenght = line2.getP2().getX() - line2.getP1().getX();

        if(line1lenght > line2lenght){
            return line1;
        } else {
            return line2;
        }
    }
}
