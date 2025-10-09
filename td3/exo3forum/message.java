package Vecteur.td3.exo3forum;

public class message {
    private String titre;
    private String texte;
    private Utilisateur auteur;

    public message(String titre, String texte, Utilisateur auteur) {
        super();
        this.titre = titre;
        this.texte = texte;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Par : " + auteur.toString() +
                "\n" + "Titre : " + titre + "\n" + "Texte : " + texte;
    }
}
