package Vecteur.td4.ex3;

public class ManipHiearchie {
    public static void main(String[] args) {
         // A a=new B(); //Types incompatibles
        // B b=new A(); // Types incompatibles
        a = new A();
        a.m1();
        // a = new B(); // Types incompatibles
        a.m1();
        // a.m2(); // méthode inexistante
        // a.m3(); // méthode inexistante


    }
}
