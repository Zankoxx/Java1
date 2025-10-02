package Vecteur.td2;

import Vecteur.td1.PelageChat;

public class ManipulationChatv2 {
    public static void main (String[] args) {
        PelageChat pelageAzrael = new PelageChat(
                new Couleurs[]{Couleurs.NOIR, Couleurs.BLANC},
                false,
                false,
                "Enjoué et pas joueur");

        Chatv2 Azrael = new Chatv2("Azrael", pelageAzrael, 2018, true);
        System.out.println(Azrael.toString());
    }

}
