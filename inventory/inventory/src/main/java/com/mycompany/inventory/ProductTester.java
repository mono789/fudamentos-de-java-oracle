/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

/**
 *
 * @author estra
 */
public class ProductTester {
    
    public static void main(String[] args) {  // Create new product objects using the default constructor
        Product p1 = new Product();
        Product p2 = new Product();
        
        // Create new product objects using the parameterized constructor
        Product p3 = new Product("LA01","Lavadora Samsung 16 Kg",3,1859100 );
        Product p4 = new Product("TV01","TV Sony 55' ",10,1500000 );
        Product p5 = new Product("MI01","Microondas Panasonic 270 W",5,380125 );
        Product p6 = new Product("ES01","Estufa Haceb 4 Puestos",2,825540 );
        
        
        // Print out each product object using the toString method
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
    
        
        
    }
}
