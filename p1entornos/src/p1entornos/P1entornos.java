/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1entornos;
import java.util.*;
/**
 *
 * @author Alejandro Del Val
 */
public class P1entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        int num=0;
        int i;
        String cad;
     Scanner sc= new Scanner(System.in);
         System.out.println("letra: ");
          letra=sc.nextLine().charAt(0);
          System.out.println("cadena: ");
          cad=sc.nextLine();
          letra=Character.toUpperCase(letra); // PARA CONVERTIR UNA LETRA EN MAYUSCULA
          cad=cad.toUpperCase(); //PARA CONVERTIR UNA CADENA EN MAYUSCULA 
          for (i=0;i<cad.length();i++){
              if (cad.charAt(i)== letra){
                  num++;
              }
          }
          System.out.println("numero de veces que se repite "+letra+" es: "+num);
    }
    
}
