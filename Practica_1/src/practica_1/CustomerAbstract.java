/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

/**
 *
 * @author Luis Felipe Garcia
 */
abstract class CustomerAbstract {
    String Nombre = "Sin nombre";
    int Edad = 0;
    String Raza = "Sin Raza";
    String Color = "Sin Color";
    int Peso = 0;
    
    abstract void Nombre();
    abstract void Edad();
    abstract void Raza();
    abstract void Color();
    abstract void Peso();
}
