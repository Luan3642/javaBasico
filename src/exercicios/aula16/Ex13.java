/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

/**
 *
 * @author luan3
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a base");
        int base = scan.nextInt();
        
        System.out.println("Entre com o expoente");
        int expoente = scan.nextInt();
       
        int calculo = base;
    
       while(expoente > 1){
           
           base = base * calculo;
           
           expoente--;
       }   
       
        System.out.println(base);
        
        

        }
}
