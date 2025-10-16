package Vecteur.td5;

public class Lettre extends ObjetPostal{

    public enum UrgentCar {
        urgent , ordinaire;
    }

    protected boolean Urgent;

    public Lettre(String origine, String destination,String codePostal,double poids,double volume, tauxRecommandation taux, UrgentCar caractereUrgence) {
        super(origine,destination,codePostal,poids,volume,taux);

    }
    public double getTarifAffranchissement (){
    }


}
