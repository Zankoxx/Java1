package Vecteur.td5;

public class Colis extends ObjetPostal{
    private String contenu;
    private double PrixColis;

    public Colis(String origine , String destination , String codePostal , double poids , double volume , tauxRecommandation tauxrec,String contenu, double prixColis) {
        super(origine,destination,codePostal,poids,volume,tauxrec);
        this.contenu = contenu;
        this.PrixColis = prixColis;


    }
    public String getContenu() {
        return contenu;
    }
    public double getPrixColis() {
        return PrixColis;
    }

    @Override
    public double getTarifAffranchissement (){
        double tarifBase= 0.0;
        switch (tauxrec) {
            case FORT:
                tarifBase+= 1.5;
                break;
            case MOYEN:
                tarifBase += 0.5;
                break;
        }
        if (volume > 0.125)
            tarifBase += 3.0;

        return tarifBase;

    }



    @Override
    public double remboursement() {
        double valeur = getPrixColis();
        switch (tauxrec) {
            case FORT:
                return valeur*0.5;
            case MOYEN:
                return valeur*0.1;
            case NUL:
                return 0.0;
            default:
                return 0.0; // utile pour couvrir tous les cas
        }
    }
    @Override

    public String toString(){
        return "Colis "+ codePostal + "/" + destination + "/" +tauxrec
                +"/" + volume + "/" + PrixColis;
    }





}
