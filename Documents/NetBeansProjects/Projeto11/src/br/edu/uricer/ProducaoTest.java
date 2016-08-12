package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class CalculoIMCTest {
    
    //um comentario aqui
    @Test
    public void deveCalcularParaHomemObeso() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("M");
        calculo.setAltura(1.50);
        calculo.setPeso(80);
        
        int expResult = 2;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    }
    
   @Test
    public void deveCalcularParaHomemNoPesoIdeal() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("M");
        calculo.setAltura(1.70);
        calculo.setPeso(70);
        
        int expResult = 1;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    } 
    
   @Test
    public void deveCalcularParaHomemAbaixoDoPeso() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("M");
        calculo.setAltura(1.80);
        calculo.setPeso(50);
        
        int expResult = 0;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    }   
    
   @Test
    public void deveCalcularParaMulherAcimaDoPeso() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("F");
        calculo.setAltura(1.65);
        calculo.setPeso(85);
        
        int expResult = 2;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    }  
    
   @Test
    public void deveCalcularParaMulherNoPesoIdeal() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("F");
        calculo.setAltura(1.70);
        calculo.setPeso(70);
        
        int expResult = 1;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    }   
    
   @Test
    public void deveCalcularParaMulherAbaixoDoPeso() {
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo("F");
        calculo.setAltura(1.80);
        calculo.setPeso(5);
        
        int expResult = 0;
        int result = calculo.calcular();
        assertEquals(expResult, result);
    }     
}