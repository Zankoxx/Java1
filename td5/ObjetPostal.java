package Vecteur.td5;


public abstract class ObjetPostal {


    protected String origine;
    protected String destination;
    protected String codePostal;
    protected double poids;
    protected double volume;
    protected tauxRecommandation tauxrec;

    public ObjetPostal(String origine,String destination, String codePostal, double poids, double volume,tauxRecommandation tauxrec) {
        this.origine = origine;
        this.destination = destination;
        this.codePostal = codePostal;
        this.poids = poids;
        this.volume = volume;
        this.tauxrec = tauxrec;
    }
    public double getPoids() {
        return poids;
    }
    public double getVolume() {
        return volume;
    }
    public String getOrigine() {
        return origine;
    }
    public String getDestination() {
        return destination;}

    public String getCodePostal() {
        return codePostal;
    }
    public tauxRecommandation getTauxrec() {
        return tauxrec;
    }
    public abstract double getTarifAffranchissement () ;
    public abstract double remboursement() ;
    @Override
    public abstract String toString() ;

}



