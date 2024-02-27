package miPrincipal;

import biblioteca.libro;

public class libro { 
    public static void main(String[]args){
        System.out.println(Math.sqrt(8));// Retorna un punto flotante
        System.out.println(Math.sqrt(-1)); // es un NAN
        System.out.println(Math.sqrt(1.1e5 * 1.1e2));
        System.out.println(Math.sqrt(1.10000 * 1.10));
        System.out.println(Math.sqrt(1.1e200 * 1.1e200)); //este retorna un infinito positivo
        System.out.println(Math.sqrt(-1.1e200 * 1.1e200)); //este retorna un infinito negativo
}   }
