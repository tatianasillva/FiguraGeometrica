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
public class Rectangulo extends FiguraGeometrica  {

float base, altura;

@Override
float calcularArea () {
    
   float area;
   
   area= (float)(base* altura);
   
   return area;
    
}

@Override
    float calcularPerimetro() {
    
   float perimetro;
   
  perimetro= (float)(2*base)+ (2*altura);
   
   return perimetro;
    
    
    
}
}