package Vecteur.td3.exo3forum;

public class ForumModere extends forum {
    private Utilisateur moderateur;
    private message[] quarantaine;
    static int NbMessagesQuarantaine = 0;
    public ForumModere (Utilisateur moderateur) {
        super();
        this.quarantaine = new message[10];
        this.moderateur = moderateur;
    }
    public void receptionMessage (message m){
        quarantaine[NbMessagesQuarantaine++] = m;
    }
    public void moderer (Utilisateur moderateur, message m, boolean MessageAccepte ) {
        if (this.moderateur != moderateur) {
            System.out.println("Vous n'êtes pas le modérateur de ce forum.");
            return;
        }
        for (int i = 0; i < NbMessagesQuarantaine; i++) {
            if (quarantaine[i] == m) {
                if (MessageAccepte) {
                    super.receptionMessage(m);
                    // Si le message est accepté, on l'ajoute au forum parent (forum.java).
                }
                for (int j = i; j < NbMessagesQuarantaine - 1; j++) {
                    quarantaine[j] = quarantaine[j + 1];
                    // Décalage à gauche des messages aprés suppression
                }
                quarantaine[--NbMessagesQuarantaine] = null;
                // Aprés avoir tout décaler à droite il reste une case doublon du dernier message donc on le rend vide,
                // et l'index précedent devient le nouveau dernier index
                break;
            }
        }
    }

}
