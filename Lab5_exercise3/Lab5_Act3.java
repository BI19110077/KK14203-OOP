//NAME : NURMUNRAH BINTI ASRI
//NO MATRIC : BI19110077
//LAB 5 : INHERITANCE
//Exercise 3 

abstract class Cake{

   String name; 
   String[] topping; 
   String[] toppingOrder; 
   double priceSmall; 
   double priceMedium; 
   double priceBig; 
   double totalPrice; 
   int size; 
   int quantity;
   
   //Constructor (accept String cake’s name and set the value to class member name.)
   Cake(String name){ this.name = name; }
   
   void setCake(String[] t, double ps, double pm, double pb){
      topping = t;
      priceSmall = ps;
      priceMedium = pm;
      priceBig = pb;
   }
   
   public void cakeOrder(String[] to, int q, int s){
      toppingOrder = to;
      quantity = q;
      size = s;
   }

   double getSizePrice (){
      double price = 0.0;
      if (size == 1){
         price = priceSmall;
      }
      else if (size == 2){
         price = priceMedium;
      }
      else if (size == 3){
         price = priceBig;
      }
      return price;
   }

   double getTotalPrice(){
      totalPrice = getSizePrice() * quantity + (toppingOrder.length*10);
      return totalPrice;
   }

   String getSize(){
      String cakeSize = "Small";
   
      if(size == 1){
         cakeSize = "Small";
      }
      else if(size == 2){
         cakeSize = "Medium";
      }
      else if(size == 3){
         cakeSize = "Big";
      }
      
      return cakeSize;
   }

   void printCake(){  //that print out the information of the cake.
   
      System.out.println("------------------------------------");
      System.out.println("              Cake Menu");
      System.out.println("------------------------------------");
      System.out.println(name + " BlackForest with available toppings:");
      for(int i=0; i<topping.length; i++){
         System.out.println(i+1 + ") " + topping[i]);
      } 
      System.out.println("\nPrice:");
      System.out.println("[1] Small : RM" + priceSmall);
      System.out.println("[2] Medium: RM" + priceMedium);
      System.out.println("[3] Big   : RM" + priceBig);
   }
   
   void printOrder(){ // that print out the information of order and the total price.
      System.out.println("\n\nCake Order detail:");
      System.out.println("-------------------------------------------");
      System.out.print("Topping : ");
      for(int i=0; i<toppingOrder.length; i++){
         System.out.print(i+1 + ") " + toppingOrder[i] + " ");
      } 
      System.out.println("\nSize    : " + getSize());
      System.out.println("-------------------------------------------");
      System.out.println("Total Price: RM" + getTotalPrice()); 
      System.out.println("-------------------------------------------"); 
   }
}

class BlackForest extends Cake{
   
   BlackForest(String name){
      super(name);
      }
   
      void setCake (String[] t, double ps, double pm, double pb){
      this.topping = t;
      this.priceSmall = ps;
      this.priceMedium = pm;
      this.priceBig = pb;
   }

}

public class Lab5_Act3{ 
   public static void main(String args[]){ 
      Cake c = new BlackForest("BlackForest"); 
      String[] topping = {"Chocolate", "Cherries", "Whipped Cream"}; 
      c.setCake(topping, 45.00, 65.00, 80.00); 
      c.printCake(); 
      String[] order = {"Chocolate", "Cherries"}; 
      c.cakeOrder(order, 1, 2); 
      c.printOrder(); 
    } 
}