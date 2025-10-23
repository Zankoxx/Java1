package Vecteur.td5;

public class ColisExpress extends Colis{
    private String dateEnvoi ;
    private int NumeroDeSuivi ;
    private static int colisExpress;
    private boolean emballage ;

    public ColisExpress(String origine , String destination , String codePostal , double poids , double volume ,
                        tauxRecommandation tauxrec,String contenu, float prixColis,
                        String dateEnvoi, int NumeroDeSuivi,boolean emballage)
    {
        super(origine, destination, codePostal, poids, volume, tauxrec, contenu, prixColis);
        this.dateEnvoi = dateEnvoi;
        this.NumeroDeSuivi = NumeroDeSuivi;
        colisExpress++;

    }
    public String getDateEnvoi() {
        return dateEnvoi;
    }
    public int getNumeroDeSuivi() {
        return NumeroDeSuivi;
    }
    public double getAffranchissementColisExpress(){
        return 30 ;
    }

    @Override
    public String toString(){
        return "ColisExpress "+ getCodePostal() + "/" + getDestination() + "/" +getTauxrec()
                +"/" + getVolume() + "/" + getPrixColis() + "/" + getPoids() + "/" +  NumeroDeSuivi ;
    }



}
