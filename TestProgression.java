/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exprogressao;

public class TestProgression {
    public static void main(String[] args) {
       
        Progression prog;
        
        
        System.out.println("Testando progressao aritmetica");
        prog = new ArithProgression();
        prog.printProgression(10);
        
        System.out.println("testando a progressao aritmetica agora com incremento de 5");
        prog = new ArithProgression(5);
        prog.printProgression(10);
        
        
        int incremento = 2;
        System.out.println("testando a progressao geométrica com incremento de 2");
        prog = new GeomProgression(2);
        prog.printProgression(10);
        
        
        System.out.println("testando a progressao fibonacci");
        prog = new FibonacciProgression();
        prog.printProgression(10);
    
    
    }
    
}
