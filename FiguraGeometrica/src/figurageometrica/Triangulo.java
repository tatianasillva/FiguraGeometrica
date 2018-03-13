/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author USER
 */
public class Triangulo extends FiguraGeometrica {
    
    float base, altura, hipotenusa;

@Override
float calcularArea () {
    
   float area;
   
   area= (base*altura)/2;
   
   return area;
    
}

@Override
    float calcularPerimetro() {
    
   float perimetro;
   
  perimetro= base+altura+hipotenusa;
   
   return perimetro;
    
    
    
}
}


