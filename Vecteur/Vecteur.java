package Vecteur.Vecteur;

public class Vecteur {
    private Point pcoord;

    public Vecteur(pcoord x, pcoord y) {
        this.pcoord = new Point(pcoord.getCoordX(), pcoord.getCoordY());
    }

    public Vecteur sommeAvec(Vecteur v) {
        return new Vecteur(new Point
                (pcoord.getCoordX() + v.pcoord.getCoordX(),
                        pcoord.getCoordY() + v.pcoord.getCoordY()));
    }

    public void ajout(Vecteur v) {
        pcoord = new Point(pcoord.getCoordX() + v.pcoord.getCoordX(),
                pcoord.getCoordY() + v.pcoord.getCoordY());

    }

    public static Vecteur somme(Vecteur v1, Vecteur v2) {
        return v1.sommeAvec(v2);
    }

    @Override
    public String toString() {
        return "Vecteur{" + "coordonnées = " + pcoord + "}"
    }
}



}
