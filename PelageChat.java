public class PelageChat {
    private Couleurs[] couleur;
    private boolean poilLong;
    private boolean estMulticolor;
    private String description;

    public PelageChat(Couleurs[] couleur, boolean poilLong, boolean estMulticolor, String description) {
        this.couleur = couleur;
        this.poilLong = poilLong;
        this.estMulticolor = estMulticolor;
        this.description = description;
    }
}