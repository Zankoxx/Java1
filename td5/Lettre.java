package Vecteur.td5;

public class Lettre extends ObjetPostal{
    public enum UrgentCar {
        urgent , ordinaire;
    }
    private final UrgentCar caractereUrgence;



    public Lettre(String origine, String destination,String codePostal,double poids,double volume, tauxRecommandation taux, UrgentCar caractereUrgence) {
        super(origine,destination,codePostal,poids,volume,taux);
        this.caractereUrgence = caractereUrgence;

    }
    @Override
    public double getTarifAffranchissement (){
        double tarifBase = 0.5;
        if (caractereUrgence == UrgentCar.urgent) {
            tarifBase += 0.3;
        }
        switch (tauxrec) {
            case FORT:
                tarifBase += 1.5;
                break;
            case MOYEN:
                tarifBase += 1.0;
                break;
        }
        return tarifBase;

    }
    @Override
    public double remboursement() {
        double tarifRemboursement = 0.0;
        switch (tauxrec) {
            case FORT:
                tarifRemboursement += 15.0;
                break;
            case MOYEN:
                tarifRemboursement += 1.5;
                break;
            case NUL:
                tarifRemboursement = 0.0;
                break;
        }
        return tarifRemboursement;
    }

    @Override

    public String toString(){
        return "Lettre "+ codePostal + "/" + destination + "/" +tauxrec
                +"/" + caractereUrgence + "/" + caractereUrgence;
    }



}
