package Vecteur.td1;

import Vecteur.td2.Vecteur.Point;

public class ManipulationsPoint {
    public static void main(String[] args) {
        Point o = new Point(0, 0);
        Point p1 = new Point(3, 4);
        System.out.println(o.module(o));
        System.out.println(p1.module(o));
        Point p2 = p1.symetrie();
        System.out.println(p1.DistanceDe(p2));
        Point p3 = new Point(6, 8);
        System.out.println(p1.DistanceDe(p3));



    }
}
