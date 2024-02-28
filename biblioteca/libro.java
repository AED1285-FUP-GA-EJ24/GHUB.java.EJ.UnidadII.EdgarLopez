package biblioteca;

import biblioteca.libro;

public class libro { 
    public static void main(String[]args){
        System.out.println(Math.sqrt(8));// Retorna un punto flotante
        System.out.println(Math.sqrt(-1)); // es un NAN
        System.out.println(Math.sqrt(1.1e5 * 1.1e2));
        System.out.println(Math.sqrt(1.10000 * 1.10));
        System.out.println(Math.sqrt(1.1e200 * 1.1e200)); //este retorna un infinito positivo
        System.out.println(Math.sqrt(-1.1e200 * 1.1e200)); //este retorna un infinito negativo
        //Tipo de dato char
        char car= 'A';
        car='\101';
        System.out.println(car);
        car='\u0041';
        System.out.println(car);
        car = '\165';
        System.out.println(car);
        //tipo de dato boolean
        boolean bandera;
        bandera = true;
        bandera = false;
        if (bandera) System.out.println("Es verdadero");
        //ejemplo de envoltorio
        System.out.println(Integer.parseInt("123"));
        System.out.println(Long.parseLong("165"));
        System.out.println(Byte.parseByte("21"));
        System.out.println(Short.parseShort("45"));
        System.out.println(Double.parseDouble("1.5e8"));
        System.out.println(Float.parseFloat("45.89"));
        //LITERALES Y CONSTANTES
        
        //Para declarar constantes, anteponemos la palabra
        //final en la declaracion y se utiliza un identificador
        //mayuscula

        final Double PI = 3.141592;

        int octal = 015;
        System.out.println(octal);

        int decimal = 12;
        System.out.println(decimal);

        int hexadecimal = 0xA;
        System.out.println(hexadecimal);





}   }   

