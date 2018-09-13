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
public interface CustomerInterface {
    String Nombre = "Sin nombre";
    int Edad = 0;
    String Raza = "Sin Raza";
    String Color = "Sin Color";
    int Peso = 0;
    
    public void Peso();
    public void Edad();
    public void Raza();
    public void Color();
    public void Nombre();
}
