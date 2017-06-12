/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;

import java.util.Scanner;
import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author moises santiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       EcuacionDeSegundoGrado ecuacion1 = new EcuacionDeSegundoGrado(3,9,2);
       System.out.println("valor discriminante:" + ecuacion1.getDiscriminante());
       System.out.println("numero de raices:" + ecuacion1.getNumeroDeSolucionesReales());
       System.out.println("x1 = "+ ecuacion1.getRaiz1());
       System.out.println("x2 = "+ ecuacion1.getRaiz2());
       
       
       
       EcuacionDeSegundoGrado ecuacion2 = new EcuacionDeSegundoGrado(6,9,1);
       System.out.println("valor discriminante:" + ecuacion2.getDiscriminante());
       System.out.println("numero de raices:" + ecuacion2.getNumeroDeSolucionesReales());
       System.out.println("x1 = "+ ecuacion2.getRaiz1());
       System.out.println("x2 = "+ ecuacion2.getRaiz2());
       
       EcuacionDeSegundoGrado ecuacion3 = new EcuacionDeSegundoGrado(8,3,-6);
       System.out.println("valor discriminante:" + ecuacion3.getDiscriminante());
       System.out.println("numero de raices:" + ecuacion3.getNumeroDeSolucionesReales());
       System.out.println("x1 = "+ ecuacion3.getRaiz1());
       System.out.println("x2 = "+ ecuacion3.getRaiz2());
    }
    
}
