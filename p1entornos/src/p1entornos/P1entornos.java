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
        int num;
        int i;
        String continuar;
        String cad;
     Scanner sc= new Scanner(System.in);
     do{
         System.out.println("letra: ");
          letra=sc.nextLine().charAt(0);
          System.out.println("cadena: ");
          cad=sc.nextLine();
          letra=Character.toUpperCase(letra); // PARA CONVERTIR UNA LETRA EN MAYUSCULA
          cad=cad.toUpperCase(); //PARA CONVERTIR UNA CADENA EN MAYUSCULA 
         num=numcaracter(cad,letra);
          System.out.println("numero de veces que se repite "+letra+" es "+num);
          System.out.println("desea contuniar(si/no) : ");
          continuar=sc.nextLine();
     }while(continuar.equalsIgnoreCase("si"));
    }
    public static int numcaracter(String cadena,char car){
        int j;
        int cont=0;
        for (j=0;j<cadena.length();j++){
              if (cadena.charAt(j)== car){
                  cont++;
              }
        }
        return cont;
    }
}
