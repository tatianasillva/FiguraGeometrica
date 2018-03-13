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
public class Cuadrado extends FiguraGeometrica {
    
  float lado;

@Override
float calcularArea () {
    
   float area;
   
   area= lado*lado; 
   
   return area;
    
}

@Override
    float calcularPerimetro() {
        
       float  perimetro;
       
   perimetro= (lado*2)+(lado*2);
        
        return perimetro;

    
    
}
}
  
    

