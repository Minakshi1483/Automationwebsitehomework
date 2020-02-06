 public class Calculator2 {

     //for addition
     //NO return type - with parameter STATIC method
     public static void addition(int a, int b) {
         System.out.print("addition of " + a + " and " + b + " =");
         System.out.println(a + b);
     }

     //for substraction
     //no return type - with parameter STATIC method
     public static void substraction(int a, int b) {
         System.out.print("substraction  of " + a + " and " + b + " =");
         System.out.println(a - b);
     }

     //for multiplication
     //no return type - with parameter STATIC method
     public static void multiplication(int a, int b) {
         System.out.print("multiplication of " + a + " and " + b + " =");
         System.out.println(a * b);
     }

     //for divison
     //no return type - with parameter STATIC mehtod
     public static void division(int a, int b) {
         System.out.print("divison of " + a + " and " + b + " =");
         System.out.println(a / b);
     }
     //main method
     public static void main(String[] args) {

         addition(10,20);
         substraction(40, 20);
         multiplication(20, 50);
         division(30, 10);
     }


 }