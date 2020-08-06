/*
   NURMUNIRAH BINTI ASRI
   BI19110077
   LAB 4 : ARRAY & CLASSES
   EXERCISE 3
*/

import java.util.Scanner;

class Menu{
   private String item;
   private double price;
   
   Menu(String a, double b){
        item = a;
        price = b;   
   }
   
   String getItem(){
        return item;
   }
   
   double getPrice(){
        return price;
   }
   
   void setItem(String item){
        this.item = item; 
   }
   
   void setPrice(double price){
        this.price = price; 
   }
   
   String getMenuItem(){
        return (item + " RM" + String.format("%.2f", price));   
   }
   
   double calcPrice(int quantity){
        double total = price * quantity;
        return total;  
   }
}

class Order{ 
   private int m_id; 
   private String m_Name; 
   private int o_Quantity; 
   private double sub_total; 
      
   Order(int id, String name, int quantity, double subto){ 
        m_id = id;
        m_Name = name;
        o_Quantity = quantity;
        sub_total = subto;
   }
   
   void print(){
        System.out.println(m_id + " \t" + m_Name + " \t\t" + o_Quantity + " \t\tRM" + sub_total);
   }
   
   double getSubTotal(){
        return sub_total;
   }
   
   
}

public class Lab4Array {
   public static void main(String args[]) throws java.io.IOException{
        char choice;
        int qty;
        double total=0.0;
      
        Scanner sc = new Scanner(System.in);

      
      //initialize menu
        Menu [] menu = new Menu[4];
        menu [0] = new Menu("Nasi Lemak", 2.00);
        menu [1] = new Menu("Roti      ", 1.00);
        menu [2] = new Menu("Teh Tarik ", 1.50);
        menu [3] = new Menu("Kopi O    ", 1.00);
      
      //print menu
        System.out.println("Menu Order System");
        System.out.println("----------------------------------------");     
        for(int i=0;i<4;i++){
            System.out.println("["+(i+1)+"]"+menu[i].getMenuItem());
        }
        System.out.println("----------------------------------------");     
        System.out.println("Press n for new order | q to exit.");
         
        do{
            System.out.print("Add order: ");
            choice = (char) System.in.read();
         
            switch(choice){
               case '1':
                  System.out.print("\t" + menu[0].getItem() + " - ");
                  System.out.print("Quantity: ");
                  qty = sc.nextInt();
                  total += (menu[0].calcPrice(qty));
                  System.out.println("\tPrice: RM" + menu[0].calcPrice(qty) + "\n");
                  break;
               case '2':
                  System.out.print("\t" + menu[1].getItem() + " - ");
                  System.out.print("Quantity: ");
                  qty = sc.nextInt();
                  total += ( menu[1].calcPrice(qty));
                  System.out.println("\tPrice: RM" + menu[1].calcPrice(qty) + "\n");
                  break;
               case '3':
                  System.out.print("\t" +  menu[2].getItem() + " - ");
                  System.out.print("Quantity: ");
                  qty = sc.nextInt();
                  total += (menu[2].calcPrice(qty));
                  System.out.println("\tPrice: RM" + menu[2].calcPrice(qty) + "\n");
                  break;
               case '4':
                  System.out.print("\t" +  menu[3].getItem() + " - ");
                  System.out.print("Quantity: ");
                  qty = sc.nextInt();
                  total += (menu[3].calcPrice(qty));
                  System.out.println("\tPrice: RM" + menu[3].calcPrice(qty) + "\n");
                  break;
               default:
                  break;
            }
         } while (choice!='q');       
      
         System.out.println("\nThank you for your order.");
         System.out.printf("Total due: RM %.2f", total);
            
   }
}

