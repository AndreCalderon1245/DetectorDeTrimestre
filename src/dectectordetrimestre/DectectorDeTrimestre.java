/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dectectordetrimestre;

import java.util.Scanner;

/**
 *
 * @author End User
 */
public class DectectorDeTrimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        String text = null;
        String texts = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que mes desea conocer?\nSeleccione un mes según la lista: \nEnero[1] \nFebrero[2] \nMarzo[3] \nAbril[4] \nMayo[5] \nJunio[6] \nJulio[7] \nAgosto[8] \nSeptiembre[9] \nOctubre[10] \nNoviembre[11] \nDiciembre[12]");
        mes = sc.nextInt();
        
        if (mes > 0 && mes <= 12){
        switch (mes) {
            case 1:
                texts = "enero";
                text="primer trimestre";
                break;
            case 2:
                texts = "febrero";
                text="primer trimestre";
                break;
            case 3:
                texts = "marzo";
                text="primer trimestre";
                break;
            case 4:
                texts = "abril";
                text="segundo trimestre";
                break;
            case 5:
                texts = "mayo";
                text="segundo trimestre";
                break;
            case 6:
                texts = "junio";
                text="segundo trimestre";
                break;
            case 7:
                texts = "julio";
                text="tercer trimestre";
                break;
            case 8:
                texts = "agosto";
                text="tercer trimestre";
                break;
            case 9:
                texts = "septiembre";
                text="tercer trimestre";
                break;
            case 10:
                texts = "octubre";
                text="cuarto trimestre";
                break;
            case 11:
                texts = "noviembre";
                text="cuarto trimestre";
                break;
            case 12:
                texts = "diciembre";
                text="cuarto trimestre";
                break;
            default:
               
                break;
        }
         System.out.println("El mes de " + texts + " se encuentra en el " + text);
        }else {
         System.out.println("Favor de escribir un número que este dentro de la lista");
        }
        
    }
    
}
