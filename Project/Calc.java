/*
   NAME : NURMUNIRAH BINTI ASRI
   MATRIC NO : BI19110077
   OBJECT ORIENTED CONCEPT
*/

import java.util.Scanner;

class calculator{
   double a, b;
   
   calculator(double a, double b){
      this.a = a;
      this.b = b;
   }
   
   double add(){
      return a+b;
   }
   
   double sub(){
      return a-b;
   }
   
   double mult(){
      return a*b;
   }
   
   double div(){
      return a/b;
   }
}

public class Calc {
   public static void main (String[] args){

      Scanner sc = new Scanner (System.in);
      double a, b, c = 0.0;
      String op;
      
      System.out.print ("Enter value of a : ");
      a = sc.nextDouble();
      System.out.print ("Enter value of b : ");
      b = sc.nextDouble();
      System.out.print ("Enter the operation (+ , - , * , / ) : ");
      op = sc.next();
      
      calculator obj = new calculator(a,b);
      switch (op){
         case "+" : System.out.println(a + op + b + " = " + obj.add()); break;
         case "-" : System.out.println(a + op + b + " = " + obj.sub()); break;
         case "*" : System.out.println(a + op + b + " = " + obj.mult()); break;
         case "/" : System.out.println(a + op + b + " = " + obj.div()); break;
         default : System.out.print("\nInvalid!");
      } 
      
   }
}