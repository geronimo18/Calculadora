package calculadoraa;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //Crear un objeto de la clase Calculadora

        Calculadora micalculadora; //Definir el objeto
        micalculadora = new Calculadora(); //Construir el objeto
        float a;
        float b;
        Scanner miEscaner;
        miEscaner = new Scanner(System.in);

        System.out.println("ESTA ES UNA CALCULADORA QUE PERMITE HACER LAS OPERACIONES DE SUMA, RESTA, MULTIPLICACIÓN Y DIVISIÓN");
        System.out.println("Ingrése 1. Para hacer una suma.");
        System.out.println("Ingrése 2. Para hacer una resta.");
        System.out.println("Ingrése 3. Para hacer una multiplicación.");
        System.out.println("Ingrése 4. Para calcular un coseno.");
        try{
        a = miEscaner.nextFloat();
        }catch(exception){
        System.out.println("Número invalido, intentelo de nuevo");
        }
        System.out.println("Ingrese el primer número");
        a = miEscaner.nextFloat();
        System.out.println("Ingrese el segundo número");
        b = miEscaner.nextFloat();
    }
}
