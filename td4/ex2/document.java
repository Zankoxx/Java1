package Vecteur.td4.ex2;

public class document {
    private String titre;
    private String texte;

    public document(String titre, String texte) {
        this.titre = titre;
        this.texte = texte;
    }

    public int nbCars() {
        return titre.length() + texte.length();
    }

    public String export() {
        return "# " + titre + "\n" + texte;
    }
}
