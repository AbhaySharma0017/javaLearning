// 2.
// Create a class named Main with the attribute "number" as an integer.
// Write a program to catch IllegalArgumentException and ArithmeticException for the given input.
// 1.	If the input provided is 0, the program should throw an "ArithmeticException" with a message.
// 2.	If the input provided is greater than 7, the program should throw an "IllegalArgumentException" with a message.
// 3.	If neither of the above cases is true, the program should return the given number.

// HINT: Use nested try block for both the exception.
// Input format :
// Input consists of an integer.
// Output format :
// Refer to the sample output for reference.
// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// 5
// Input 2 :
// 8
// Output 2 :
// IllegalArgumentException caught - Number should not be greater than 7
// Input 3 :
// 0
// Output 3 :
// ArithmeticException caught - / by zero

import java.util.Scanner;
class Main extends RuntimeException{
     Main(String message){
       super(message);
   }
}
class Assign2{
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = sc.nextInt();
       try{
          if(number == 0){
            throw new ArithmeticException("ArithmeticException, Provide another number");
        }
        else if(number > 7){
            throw new IllegalArgumentException("IllegalArgument");
        }
        else{
            System.out.println(number);
        }
       }
       catch(Exception e){

       }
        System.out.print("Hello");
    }
}