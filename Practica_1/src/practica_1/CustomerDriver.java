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
public class CustomerDriver {
    public static void main(String[] args){
        Customer cus1 = new Customer();
        Customer cus2 = new Customer("Toti");
        Customer cus3 = new Customer("Nala","2");
        Customer cus4 = new Customer("Max", "5", "Poodle");
        Customer cus5 = new Customer("Kiki","4","Pastor Aleman","Negro");
        Customer cus6 = new Customer("Suki","3","Pastor Belga","Café","20 kg");
        
        System.out.println(cus1.toString());
        System.out.println(cus2.toString());
        System.out.println(cus3.toString());
        System.out.println(cus4.toString());
        System.out.println(cus5.toString());
        System.out.println(cus6.toString());
        
    }
}
