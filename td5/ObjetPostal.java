package Vecteur.td5;


public class ObjetPostal {

    public enum tauxRecommandation {
        FORT,MOYEN,NUL
    }

    protected String origine;
    protected String destination;
    protected String codePostal;
    protected double poids;
    protected double volume;
    protected tauxRecommandation tauxrec;

    public ObjetPostal(String origine,String destination, int codePostal, double poids, double volume,tauxRecommandation tauxrec) {
        this.origine = origine;
        this.destination = destination;
        this.codePostal = codePostal;
        this.poids = poids;
        this.volume = volume;
        this.tauxrec = tauxrec;
    }

}



