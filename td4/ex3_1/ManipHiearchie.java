package Vecteur.td4.ex3_1;

public class ManipHiearchie {
    public static void main(String[] args) {
        A a=new B(); // car B est une sorte de A
        // B b=new A(); //car A n'est pas une sorte de B
        a = new A();
        a.m1(); // excute A.m1()
        a = new B();
        a.m1(); // execute B.m1()
        // a.m2();
        // méthode inexistante car le compilateur refuse la compilation car a est de type A
        // a.m3();
        // méthode inexistante car le compilateur refuse la compilation car a est de type A


    }
}

