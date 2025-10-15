package Vecteur.td4.ex1;

public class CompteBancaire {
    private final int identifiant;
    protected double solde;

    public CompteBancaire(int identifiant, double solde) {
        this.identifiant = identifiant;
        this.solde = solde;
    }
    public int getNumeroCompte() {
        return this.identifiant;
    }
    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void Ajouter(double argent){
        solde = solde+argent;
    }
    public void Retrait(double argent){
        if (solde-argent < 0){
            System.out.println("Tu peux pas retirer plus que ce que t'as mon gars");
        } else {
            solde = solde-argent;
        }
    }
    @Override
    public String toString() {
        return "CompteBancaire{" +
                "identifiant=" + identifiant + '\n' +
                "solde =" + solde +
                '}';
    }

}
