package calculadora;
import java.util.Scanner;


public class Calculadora {

   

    public void suma() {
    
        Scanner teclado = new Scanner(System.in);
        int r;
        int op1,op2;

        System.out.println("******************");
        System.out.println("*******SUMA*******");
        System.out.println("******************");
        System.out.println("Proporciona valor 1: ");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2: ");
        op2 = teclado.nextInt();

        r = op1 + op2;

        System.out.println("El resultado de la suma es igual: " + r);



    }
    
    public void res() {
    
        Scanner teclado = new Scanner(System.in);
        int r;
        int op1,op2;

        System.out.println("******************");
        System.out.println("*******RESTA******");
        System.out.println("******************");
        System.out.println("Proporciona valor 1: ");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2: ");
        op2 = teclado.nextInt();

        r = op1 - op2;

        System.out.println("El resultado de la resta es igual: " + r);

    }
    public void mult() {
    
        Scanner teclado = new Scanner(System.in);
        int r;
        int op1,op2;

        System.out.println("******************");
        System.out.println("**MULTIPLICACION**");
        System.out.println("******************");
        System.out.println("Proporciona valor 1: ");
        op1 = teclado.nextInt();
        System.out.println("Proporciona valor 2: ");
        op2 = teclado.nextInt();

        r = op1 * op2;

        System.out.println("El resultado de la multiplicacion es igual: " + r);

    }
    public void div() {
    
        Scanner teclado = new Scanner(System.in);
        double r;
        double op1,op2;

        System.out.println("******************");
        System.out.println("*****DIVISION*****");
        System.out.println("******************");
        System.out.println("Proporciona valor 1: ");
        op1 = teclado.nextDouble();
        System.out.println("Proporciona valor 2: ");
        op2 = teclado.nextDouble();

        r = op1 / op2;

        System.out.println("El resultado de la division es igual: " + r);

    }
    

}

    
