package Vecteur.td3.exo3forum;

public class forum {
    static int nbMessagesRecus = 0;
    private message[] MessagesRecus;


    public forum() {
        MessagesRecus = new message[100];
    }
    public void receptionMessage(message m){
        this.MessagesRecus[nbMessagesRecus++] = m;
    }
    public void afficher() {
        for(int i = 0; i < nbMessagesRecus; i++) {
            System.out.println(MessagesRecus[i].toString());
        }
    }

}
