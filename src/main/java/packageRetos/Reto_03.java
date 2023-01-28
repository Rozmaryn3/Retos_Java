//RETO DE PROGRAMACION nº3
//DIFICULTAD: Facil
/*
ENUNCIADO: 
Escriba un programa que, dado un numero compuebe y muestre si es primo, fibonacci y par
*/

package packageRetos;

import java.util.Scanner;

public class Reto_03 {
    
    public static void main(String[] args){
         boolean parBool = true;
         boolean primoBool = true;
         boolean fibonacciBool = true;
         int aux1 = 1, aux2 = 1, rel;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese un numero para saber es par, primo o es fibonacci");
         int num = sc.nextInt();
         
         if(num % 2 == 0){
             parBool = true;
         }
         
         else{
             parBool = false;
         }
         
         if(num == 1 || num == 2){
             primoBool = true;
         }
         
         else{
         for(int i = 2; i < num; i++){
             if(num % i == 0){
                 primoBool = false;
                 break;
             }
             else{
                 primoBool = true;
             }
             
             
         }
        }
        
        
        System.out.println("El numero " + num);
        System.out.println("Par: " + parBool);
        System.out.println("Primo: " + primoBool);
        System.out.println("Fibonacc: " + fibonacciBool);
    } 
}
