package Vecteur.td5;

public class SyntheseColis {
    public static void main (String[] args) {
    Colis ps5 = new Colis ("Roubaix","Montpellier","34090",3.0,0.05,tauxRecommandation.FORT,"Console de jeux",499.99);
    System.out.println(ps5.toString());
    ColisExpress xbox = new ColisExpress ("Lille","Marseille","13001",2.5,0.03,tauxRecommandation.NUL,"Console de jeux",399.99,"12/06/2024",
            123456,true);
    System.out.println(xbox.toString());
    ps5.getPrixColis();
    xbox.getNumeroDeSuivi();
    System.out.println(ps5.getTarifAffranchissement());
    System.out.println(xbox.getTarifAffranchissement());
    System.out.println(xbox.remboursement());
    System.out.println(ps5.remboursement());
    System.out.println('\n' + xbox.getDateEnvoi());
    System.out.println("Le prix de la ps5 "+ ps5.getPrixColis());
    System.out.println("Le numéro de suivi de la xbox "+ xbox.getNumeroDeSuivi());


}}
