package br.ucsal.advancedjava.Solid.ex1;

public class Console {
    public static void imprimeNome(A a) {
        System.out.println(a.getNome());
    }

    public static void main() {
        imprimeNome(new A());
        imprimeNome(new B());
    }
}
