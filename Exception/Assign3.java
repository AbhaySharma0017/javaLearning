// 3.Input Mismatch Exception
// InputMismatchException occurs when an input of a different datatype is given other than the required. In common practice, it occurs when a String or double datatype is given for an int datatype. Let's handle this exception for practice. 

// Create a driver class called Main. In the Main method, obtain integer input from the user. If the input is an integer, print the value or else throw the InputMismatchException.
// Input format :
// The input consists of a integer value.
// Output format :
// The output prints the given input otherwise throws InputMismatchException.
// Refer sample output for reference.
// Sample test cases :
// Input 1 :
// hello
// Output 1 :
// java.util.InputMismatchException
// Input 2 :
// 9
// Output 2 :
// 9
import java.util.Scanner;

class Driver extends RuntimeException{
  Driver(String message){
    super(message);
  }
}

class Assign3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if(num >=0 && num <= 9 ){
      System.out.print("Number is: "+num);
    }
    else{
        throw new Driver("Input mismatch exception");
    }
  }
}