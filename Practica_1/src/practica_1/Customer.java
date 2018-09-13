/*
 * To change this license headeLuis Felipe Garciar, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

/**
 *
 * @author Luis Felipe Garcia
 */
public class Customer extends CustomerAbstract{
    
    private String Nombre;
    private String Edad;
    private String Raza;
    private String Color;
    private String Peso;
    
// constructor vacio
    public Customer(){
        this.Nombre = "Sin nombre";
        this.Edad = "";
        this.Raza = "Sin Raza";
        this.Color = "Sin Color";
        this.Peso = "";
    }
// constructor que recibe un parametro
    public Customer(String nomParam){
        this.Nombre = nomParam;
        this.Edad = "";
        this.Raza = "Sin Raza";
        this.Color = "Sin Color";
        this.Peso = "";
    }
// constructor que recibe dos parametros
    public Customer(String nomParam, String edadParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Raza = "Sin Raza";
        this.Color = "Sin Color";
        this.Peso = "";
    }
// constructor que recibe tres parametros
    public Customer(String nomParam, String edadParam, String equiParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Raza = equiParam;
        this.Color = "Sin Color";
        this.Peso = "";
    }
// constructor que recibe cuatro parametros
    public Customer(String nomParam, String edadParam, String equiParam, String nacParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Raza = equiParam;
        this.Color = nacParam;
        this.Peso = "";
    }
// constructor que recibe cinco parametros
    public Customer(String nomParam, String edadParam, String equiParam, String nacParam, String pesParam){
        this.Nombre = nomParam;
        this.Edad = edadParam;
        this.Raza = equiParam;
        this.Color = nacParam;
        this.Peso = pesParam;
    }
    
    @Override
    public String toString(){
        StringBuilder value = new StringBuilder();
        value.append(String.format("Nombre: %s%n", this.Nombre));
        value.append(String.format("Edad: %s%n", this.Edad));
        value.append(String.format("Raza: %s%n", this.Raza));
        value.append(String.format("Color: %s%n",this.Color));
        value.append(String.format("Peso: %s%n", this.Peso));
        return value.toString();
    }    
    
    @Override
    void Nombre() {
        System.out.println(Nombre);
    }

    @Override
    void Edad() {
        System.out.println(Edad);
    }

    @Override
    void Color() {
        System.out.println(Color);
    }

    @Override
    void Peso() {
        System.out.println(Peso);
    }

    @Override
    void Raza() {
        System.out.println(Raza);
    }

}
