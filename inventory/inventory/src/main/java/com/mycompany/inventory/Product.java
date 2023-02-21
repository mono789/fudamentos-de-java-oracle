/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;


public class Product {
    // Instance field declarations
    private String SKU; // Declare a private instance field for product SKU
    private String name; // Declare a private instance field for product name
    private int Stock; // Declare a private instance field for product stock
    private double price; // Declare a private instance field for product price

    // Default constructor
    public Product() { 
    }
    
    // Parameterized constructor
    public Product(String SKU, String name, int Stock, double price) { 
        this.SKU = SKU; // Set the SKU field to the passed value
        this.name = name; // Set the name field to the passed value
        this.Stock = Stock; // Set the stock field to the passed value
        this.price = price; // Set the price field to the passed value
    } 
    
    // Getter for SKU field
    public String getSKU() {
        return SKU;
    } 

    // Setter for SKU field
    public void setSKU(String SKU) {
        this.SKU = SKU;
    } 

    // Getter for name field
    public String getName() {
        return name;
    } 

    // Setter for name field
    public void setName(String name) {
        this.name = name;
    } 

    // Getter for stock field
    public int getStock() {
        return Stock;
    } 

    // Setter for stock field
    public void setStock(int Stock) {
        this.Stock = Stock;
    } 

    // Getter for price field
    public double getPrice() {
        return price;
    } 

    // Setter for price field
    public void setPrice(double price) {
        this.price = price;
    } 
   
    // Method to display the object as a string
    public String toString(){
        return "\n\nItem SKU    : " + this.SKU   // Display the SKU field
                + "\nName       : " + this.name // Display the name field
                + "\nQuantity in Stock   : " + this.Stock // Display the stock field
                + "\nPrice  : " + this.price; // Display the price field
    }
}




