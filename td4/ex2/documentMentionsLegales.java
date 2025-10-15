package Vecteur.td4.ex2;

public class documentMentionsLegales extends document{
    private String mentionsLegales;

    public documentMentionsLegales(String titre, String texte, String mentionsLégales) {
        super(titre, texte);
        this.mentionsLegales = mentionsLegales;
    }

    @Override
    public String export() {
        return super.export() + "\n" + mentionsLegales;
    }

}
