package Vecteur.td4.ex3_2;

public class B extends A {
    public B(int i) {
        super(i);
    }
    public void m1(A a){}
    public B m0 (A a) {
        super.m0(a);
        return this;
    }
}


