package Vecteur.td2;

public class Chatv2 {
    private String nom;
    private PelageChat pelage;
    private int anneeNaissance;
    private boolean pucé;
    private static final boolean carnivore = true;
    private static final int Esperancedevie = 15;
    private static final boolean PeutRonronner = true;


    public Chatv2(String nom, PelageChat pelage, int anneeNaissance, boolean pucé) {
        this.nom = nom;
        this.pelage = pelage ;
        this.anneeNaissance = anneeNaissance;
        this.pucé = pucé;
    }

    public String toString() {
        return "Vecteur.td1.Chat [nom=" + nom + ", pelage=" + pelage + ", anneeNaissance="
                + anneeNaissance + ", pucé=" + pucé + "]";
    }

}
