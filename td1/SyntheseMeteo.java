package Vecteur.td1;

import java.util.Arrays;

public class SyntheseMeteo {
    private final String ville;
    private float[] tmin;
    private float[] tmax;

    public SyntheseMeteo(String ville){
        this.ville=ville;
    }

    public SyntheseMeteo(String ville, float[] tmin, float[] tmax){
        this(ville);
        this.tmin=tmin;
        this.tmax=tmax;
    }

    @Override
    public String toString() {
        return "Vecteur.td1.SyntheseMeteo{" +
                "ville='" + ville + '\'' +
                ", tmin=" + Arrays.toString(tmin) +
                ", tmax=" + Arrays.toString(tmax) +
                '}';
    }

    public float temperatureMensuelleMax(){
        float result=tmax[0];
        for (int i=1;i<tmax.length-1;i++){
            if (tmax[i]>result){
                result=tmax[i];
            }
        }
        return result;
    }
    public int moisLePlusChaud(){
        int result=0;
        for (int i=1;i<tmax.length-1;i++){
            if (tmax[i]>tmax[result]){
                result=i;
            }
        }
        return result+1; // on ajoute 1 pour avoir le numéro du mois entre 1 et 12
    }

    private Mois moisLePlusChaudv2(){
        float result=tmax[0];
        Mois MoisMax = Mois.JANVIER;
        for (int i=1;i<tmax.length-1;i++){
            if (tmax[i]>result){
                result = tmax[i];
                MoisMax = this.numMoisVersMois(i);
            }
        }
        return MoisMax; // on ajoute 1 pour avoir le numéro du mois entre 1 et 12
    }

    /**
     * positionne une température minimale pour un mois donné (entre 1 et 12)
     * @param numMois le numéro de mois entre 1 et 12
     * @param valeur la température minimale
     */
    public void setTmin(int numMois, float valeur) {
        if (tmin != null && numMois >= 1 && numMois <= tmin.length) {
            if (valeur > -100 && valeur < 100) {
                tmin[numMois - 1] = valeur;
            } else {
                System.out.println("température incorrecte");
            }

        }
        else {System.out.println("Mois incorrect");}
    }
    private Mois numMoisVersMois(int numMois) {
        return Mois.values()[numMois - 1];
        // Cette instruction aurait suffit mais la comprenez-vous ?
        // Vecteur.td1.Mois.values() renvoie un tableau contenant les valeurs de l'énumération Vecteur.td1.Mois
        /*switch (numMois){
            case 1:return Vecteur.td1.Mois.JANVIER;
            case 2:return Vecteur.td1.Mois.FEVRIER;
            case 3:return Vecteur.td1.Mois.MARS;
            case 4:return Vecteur.td1.Mois.AVRIL;
            case 5:return Vecteur.td1.Mois.MAI;
            case 6: return Vecteur.td1.Mois.JUIN;
            case 7: return Vecteur.td1.Mois.JUILLET;
            case 8: return Vecteur.td1.Mois.AOUT;
            case 9: return Vecteur.td1.Mois.SEPTEMBRE;
            case 10: return Vecteur.td1.Mois.OCTOBRE;
            case 11: return Vecteur.td1.Mois.NOVEMBRE;
            case 12: return Vecteur.td1.Mois.DECEMBRE;
            default: return null;
        }
    */
    }

    private int moisVersNumMois(Mois mois){
        return mois.ordinal()+1; // Cette instruction aurait suffit mais la comprenez-vous ?
    }
//     switch (mois){
//        case JANVIER : return 1;
//        case FEVRIER : return 2;
//        case MARS : return 3;
//        case AVRIL : return 4;
//        case MAI : return 5;
//        case JUIN : return 6;
//        case JUILLET : return 7;
//        case AOUT : return 8;
//        case SEPTEMBRE : return 9;
//        case OCTOBRE : return 10;
//        case NOVEMBRE : return 11;
//        case DECEMBRE : return 12;
//        default: return -1;
//    }
    public void NewsetTmin (Mois mois, float valeur) {
        int numMois = moisVersNumMois(mois);
        if (tmin != null && numMois >= 1 && numMois <= tmin.length && valeur > -100 && valeur < 100) {
            tmin[numMois - 1] = valeur;
        }




}

}


