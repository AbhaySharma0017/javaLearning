 //1.
// Divide by zero exception.
// Write a program to obtain two numbers and print their quotient. In case of an exception print the exception message.
// Input format :
// Provide a single line of input separated by a space. Obtain the integers N1 and N2.
// Output format :
// Display the quotient if there is no exception; otherwise, print the exception message.
// Refer to the sample output for reference.
// Code constraints :
// Integers only.
// Sample test cases :
// Input 1 :
// 44 2
// Output 1 :
// 22
// Input 2 :
// 2 0
// Output 2 :
// java.lang.ArithmeticException


class Assign1{
    public static void main(String args[]){
       String s1 = args[0];
       String s2 = args[1];

       int a = Integer.parseInt(s1);
       int b = Integer.parseInt(s2);
       try{
        int c = a/b;
        System.out.print(c);
       }
       catch(ArithmeticException e){
        System.out.println(e.toString());
       }
    }
}