package Vecteur.td4.ex3_2;

public class ManipHiearchie2 {
    public static void main(String[] args) {
        A b=new B(1);
        A c = new A((2-1));
        b.m0(new A(1));
        b.m0(new B(1));
        c.m0(new A(1));
        c.m0(new B(1));
    }
}
