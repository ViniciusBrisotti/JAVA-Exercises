/*(vetor) 1. 
Faça um programa em Java que crie, inicialmente, dois vetores, 
sendo que um vetor receberá o peso de 10 pessoas e o outro vetor 
receberá a altura destas mesmas 10 pessoas. 
Crie um terceiro vetor que terá o IMC 
(índice de massa corporal) de cada uma das 10 pessoas, 
sendo que o cálculo do IMC = peso/altura*altura.  
Calcule e mostre:  -  o IMC de cada uma das pessoas.*/

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        float [] weight = new float [10];
        float [] height = new float [10];
        float [] imc = new float[10];
        float weight1;
        float height1;
        
        for ( int people = 0; people <=9; people ++ ){
            System.out.println("Insira o valor do peso: ");
            weight1 = keyboard.nextFloat();
            weight[people] = weight1;
            System.out.println("Insira o valor da altura: ");
            height1 = keyboard.nextFloat();
            height[people]= height1;
            
            imc[people]= weight1 / (height1 *height1);
            System.out.println("O IMC é: "+imc[people]);
            
        
            
    
}
     }
}