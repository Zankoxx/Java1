package Vecteur.Vecteur;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Accesseurs en lecture
    public double getCoordX() {
        return x;
    }
    public double getCoordY() {
        return y;
    }

    public String toString() {
        return "Vecteur.Vecteur.Point x = " + x + " Vecteur.Vecteur.Point y =" + y;
    }
    public double module (Point p) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double DistanceDe(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
    public Point symetrie () {
        return new Point(-x,-y);
    }

}




