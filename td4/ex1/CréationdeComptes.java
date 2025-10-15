package Vecteur.td4.ex1;

public class CréationdeComptes {
    public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire(1, 1000);
        CompteBancaireRemunere cbr1 = new CompteBancaireRemunere(2, 500, 1000);
        CompteBancaireRemunere cbr2 = new CompteBancaireRemunere(3, 1500, 1000);

        System.out.println("Compte Bancaire 1 - Numéro: " + cb1.getNumeroCompte() + ", Solde: " + cb1.getSolde());
        System.out.println("Compte Bancaire Rémunéré 1 - Numéro: " + cbr1.getNumeroCompte() + ", Solde: " + cbr1.getSolde());
        System.out.println("Compte Bancaire Rémunéré 2 - Numéro: " + cbr2.getNumeroCompte() + ", Solde: " + cbr2.getSolde());
        CompteBancaireRemunere.setTaux(5); // Définir un taux d'intérêt de 5% parmis tous les comptes rémunérés
        cb1.Ajouter(200);
        System.out.println("Après ajout de 200, Compte Bancaire 1 - Solde: " + cb1.getSolde());

        cb1.Retrait(500);
        System.out.println("Après retrait de 500, Compte Bancaire 1 - Solde: " + cb1.getSolde());

        cb1.Retrait(800); // Devrait afficher un message d'erreur
        System.out.println("Après tentative de retrait de 800, Compte Bancaire 1 - Solde: " + cb1.getSolde());
        cb1.setSolde(300);
    }


}
