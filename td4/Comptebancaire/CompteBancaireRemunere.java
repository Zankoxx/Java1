package Vecteur.td4.Comptebancaire;

public class CompteBancaireRemunere extends CompteBancaire {
    static float taux = 0 ;
    private float plafond;
    public CompteBancaireRemunere(int identifiant, double solde, float plafond) {
        super(identifiant, (solde > plafond) ? plafond : solde);
        if (solde > plafond) {
            System.out.println("Tu fais crash ton compte mon pote ta trop d'argent");
        }
        this.plafond = plafond;
    }
    public void mensualite(){
        solde = solde * taux;
    }


}
