package Vecteur.td5;

public class ColisExpress extends Colis{
    private String dateEnvoi ;
    private int NumeroDeSuivi ;
    private static int colisExpress = 0 ;
    private boolean emballage ;

    public ColisExpress(String origine , String destination , String codePostal , double poids , double volume ,
                        tauxRecommandation tauxrec,String contenu, double prixColis,
                        String dateEnvoi, int NumeroDeSuivi,boolean emballage)
    {
        super(origine, destination, codePostal, poids, volume, tauxrec, contenu, prixColis);
        this.dateEnvoi = dateEnvoi;
        this.NumeroDeSuivi = NumeroDeSuivi;
        this.emballage = emballage;
        colisExpress++;

    }
    public String getDateEnvoi() {
        return dateEnvoi;
    }
    public int getNumeroDeSuivi() {
        return NumeroDeSuivi;
    }
    public double getTarifAffranchissement(){
        double res = 30 ;
        if(emballage)
            res += 3.0;
        return res;
    }

    @Override
    public String toString(){
        return "ColisExpress "+ getCodePostal() + "/" + getDestination() + "/" +getTauxrec()
                +"/" + getVolume() + "/" + getPrixColis() + "/" + getPoids() + "/" +  NumeroDeSuivi ;
    }



}
