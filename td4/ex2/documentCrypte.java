package Vecteur.td4.ex2;

public class documentCrypte extends document{
    public documentCrypte(String titre, String texte) {
        super(titre, texte);
    }

    public static String crypter(String s){
        return s+"je suis cryptée";
    }

}
