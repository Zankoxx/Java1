package Vecteur.td4.ex1;

public class CompteBancaireRemunere extends CompteBancaire {
    private static float taux = 0 ;
    private float plafond;
    public CompteBancaireRemunere(int identifiant, double solde, float plafond) {
        super(identifiant, (solde > plafond) ? plafond : solde);
        if (solde > plafond) {
            System.out.println("Tu fais crash ton compte mon pote ta trop d'argent");
        }
        if (plafond < 0) {
            System.out.println("Le plafond doit être positif");
            plafond = 0;
        }
        this.plafond = plafond;
    }
    public static void setTaux(float newTaux) {
        if (newTaux < 0) {
            System.out.println("Le taux doit être positif");
            taux = 0;
        } else {
            taux = newTaux;
        }
    }

    public void mensualite() {
        double interet = (solde * taux) / 100;
        if (solde + interet > plafond) {
            solde = plafond;
        } else {
            solde += interet;
        }
    }



}
