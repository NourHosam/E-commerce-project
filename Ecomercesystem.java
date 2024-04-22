package com.mycompany.ecomercesystem;
import javax.swing.JOptionPane;
public class Ecomercesystem {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null,"Welcome to the E-commerce System!");
        int customerId = Integer.parseInt(JOptionPane.showInputDialog("please enter your ID"));
        String name= JOptionPane.showInputDialog("please enter your name");
        String address= JOptionPane.showInputDialog("please enter your address");
        ElectronicProduct e = new ElectronicProduct(1,"samsung",599.99,"smartPhone",1);
        ClothingProduct c = new ClothingProduct(2,"T-shirt",19.99, "medium","cotton");
        BookProduct b= new BookProduct(3,"x publications",39.99,"0'Reilly","oop");
        Customer u = new Customer(customerId, name, address); 
        int nProducts= Integer.parseInt(JOptionPane.showInputDialog("How many products do you want to add to your cart?"));
        cart cart1 = new cart(customerId, nProducts);
        for (int i = 0; i < nProducts; i++) {   
            int choice= Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1-smartphone 2- T-shirt 3-oop"));
            product product = null;
            switch (choice) {            
                case 1:
                    cart1.addProduct(e, i);               
                    break;
                case 2:                
                    cart1.addProduct(c, i);
                    break;             
                case 3:
                    cart1.addProduct(b, i);               
                    break;
                default:             
                   JOptionPane.showMessageDialog(null,"Invalid choice");
                    i--;                  
            }     
        }
            double totalPrice = cart1.calculatePrice();       
           int orderChoice =Integer.parseInt(JOptionPane.showInputDialog(null,"your total is $"+ totalPrice+". would you like to place the order?1-Yes 2-No"));
           if (orderChoice == 1) {
                cart1.placeOrder();      
            } else {
                JOptionPane.showMessageDialog(null,"Your order placement request has been cancelled.");
                           }
    }
} 