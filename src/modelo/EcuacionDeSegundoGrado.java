/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author moises santiago
 */
public class EcuacionDeSegundoGrado {
    public double a;
    public double b;
    public double c;
   
public EcuacionDeSegundoGrado ( double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;      
}
public double getCoeficienteA(){
    return a;
}
public double getCoeficineteB(){
    return b;
}
public double getCoeficienteC(){
    return c;
}
public double getDiscriminante(){
    double d = (b*b)-4*a*c;
    return d;
}
public double getNumeroDeSolucionesReales(){
    double dt = getDiscriminante();
    int NumeroDeRaiz;
    if (dt > 0){
        NumeroDeRaiz = 2;
    }
    else 
        if(dt <0){
            NumeroDeRaiz = 0;
        }
    else
        {
            NumeroDeRaiz = 1;
        }
       return NumeroDeRaiz;
      
}
public double getRaiz1(){
    double raiz1;
    raiz1 = (-b + Math.sqrt(getDiscriminante()))/ (2*a);
    return raiz1;
}
public double getRaiz2(){
    double raiz2;
    raiz2 = (-b - Math.sqrt(getDiscriminante()))/ (2*a);
    return raiz2;
}

}
