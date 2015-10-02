/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m8aplicacion;

import java.util.Scanner;

/**
 *
 * @author adaw
 */
public class M8aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int aux=100,fina=100;
        int numeros[]= new int[5];
        
        System.out.println("Digame 5 numeros separados por intros:");
        numeros[0]=teclado.nextInt();
        numeros[1]=teclado.nextInt();
        numeros[2]=teclado.nextInt();
        numeros[3]=teclado.nextInt();
        numeros[4]=teclado.nextInt();
        
        for (int i=0; i < 5; i++){
            
            if (numeros[i]<aux){
                aux=numeros[i];
                
                if(fina>aux){
                    fina = aux;
                    
                }
             }
            }
        System.out.print("El número más pequeño és:"+fina);
            
        }
        
    }
    

