/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args) {
    
        
       Rectangulo miRectangulo=new Rectangulo ();
        Triangulo miTriangulo =new Triangulo ();
        Cuadrado miCuadrado =new Cuadrado ();
        Scanner miEscaner=new Scanner(System.in);
        
        System.out.println("ingrese los siguientes datos para calcular el area del rectangulo:");
          
        
        System.out.println("ingrese la altura del rectangulo:");
        miRectangulo.altura=miEscaner.nextInt();
        System.out.println("ingrese la base del rectangulo:");
        miRectangulo.base=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado=miRectangulo.calcularArea();
        System.out.println(resultado);
        
        System.out.println("ingrese los siguientes datos para calcular el perimetro del rectangulo:");
        
        System.out.println("ingrese la altura del rectangulo:");
        miRectangulo.altura=miEscaner.nextInt();
        System.out.println("ingrese la base del rectangulo:");
        miRectangulo.base=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado1=miRectangulo.calcularPerimetro();
        System.out.println(resultado1);
        
        
        
        System.out.println("ingrese los siguientes datos para calcular el area del triangulo:");
        
        System.out.println("ingrese la altura del triangulo:");
        miTriangulo.altura=miEscaner.nextInt();
        System.out.println("ingrese la base del triangulo:");
        miTriangulo.base=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado2=miTriangulo.calcularArea();
        System.out.println(resultado2);
        
        System.out.println("ingrese los siguentes datos para calcular el perimetro del triangulo:");
        
        System.out.println("ingrese la altura del triangulo:");
        miTriangulo.altura=miEscaner.nextInt();
        System.out.println("ingrese la base del triangulo:");
        miTriangulo.base=miEscaner.nextInt();
        System.out.println("ingrese la hipotenusa del triangulo:");
        miTriangulo.hipotenusa=miEscaner.nextInt();
        System.out.println("El resultado es:");
        float resultado3=miTriangulo.calcularPerimetro();
        System.out.println(resultado3);
        
        
        System.out.println("ingrese los siguientes datos para calcular el area del cuadrado:");
        
        System.out.println("ingrese el lado del cuadrado:");
        miCuadrado.lado=miEscaner.nextInt();
        
        System.out.println("El resultado es:");
        float resultado4=miCuadrado.calcularArea();
        System.out.println(resultado4);
        
         System.out.println("ingrese los siguientes datos para calcular el perimetro del cuadrado:");
        
        System.out.println("ingrese el lado del cuadrado:");
        miCuadrado.lado=miEscaner.nextInt();
        
        System.out.println("El resultado es:");
        float resultado5=miCuadrado.calcularPerimetro();
        System.out.println(resultado5);
         
        
        
}
}